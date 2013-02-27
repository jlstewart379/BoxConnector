/**
 * 
 */
package box.methods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import box.constants.BoxConstant;
import box.factories.BoxObjectFactory;
import box.factories.BoxResponseFactory;
import box.functions.UploadRequest;
import box.functions.UploadResponse;
import box.objects.BoxException;
import box.objects.BoxFile;
import box.objects.UploadResult;

/**
 * @author Jimmy
 * 
 */
public class UploadMethod extends BaseBoxMethod {

    /**
     * upload.
     * 
     * @param uploadRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public UploadResponse upload(UploadRequest uploadRequest)
            throws IOException, BoxException {
        UploadResponse uploadResponse = BoxResponseFactory
                .createUploadResponse();

        // String apiKey = uploadRequest.getApiKey();
        String authToken = uploadRequest.getAuthToken();
        String folderId = uploadRequest.getFolderId();
        Map nameValueMap = uploadRequest.getDataMap();
        boolean asFile = uploadRequest.isAsFile();

        StringBuffer urlBuff = new StringBuffer();
        urlBuff.append(apiUploadUrlPrefix);
        urlBuff.append(BoxConstant.SLASH_STRING);
        urlBuff.append(apiVersion);
        urlBuff.append(BoxConstant.SLASH_STRING);
        urlBuff.append(BoxConstant.ACTION_NAME_UPLOAD);
        urlBuff.append(BoxConstant.SLASH_STRING);
        urlBuff.append(authToken);
        urlBuff.append(BoxConstant.SLASH_STRING);
        urlBuff.append(folderId);

        String result = null;
        if (asFile) {
            List fileList = new ArrayList();
            Iterator iterator = nameValueMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                // String fileName = (String) entry.getKey();
                File inFIle = (File) entry.getValue();
                fileList.add(inFIle);
            }
            
            result = httpManager.doMultipartPost(urlBuff.toString(), fileList);
        } else {
            result = httpManager.doMultipartPost(urlBuff.toString(),
                    nameValueMap);
        }
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(result);
        } catch (DocumentException e) {
            BoxException be = new BoxException(
                    "failed to parse to a document.", e);
            be.setStatus(uploadResponse.getStatus());
            throw be;
        }
       
        Element responseElm = doc.getRootElement();
        Element statusElm = responseElm.element(BoxConstant.PARAM_NAME_STATUS);
        String status = statusElm.getText();
        uploadResponse.setStatus(status);
        Element filesElm = responseElm.element(BoxConstant.PARAM_NAME_FILES);
        System.out.println("UploadResponse upload 8"); 
        List fileStatusList = toFileStatusList(filesElm);
        System.out.println("Setting Upload Result"); 
        uploadResponse.setUploadResultList(fileStatusList);
        System.out.println("UploadResponse upload 10"); 
        return uploadResponse;
    }

    /**
     * 
     * @param filesElm
     *            file element
     * @return file status object list
     */
    private List toFileStatusList(Element filesElm) {
        List list = new ArrayList();
        for (int i = 0; i < filesElm.nodeCount(); i++) {
            UploadResult uploadFileStatus = BoxObjectFactory
                    .createUploadResult();
            BoxFile soapFileInfo = BoxObjectFactory.createBoxFile();
            System.out.println("BoxFileCreated"); 
            uploadFileStatus.setFile(soapFileInfo);
            Element fileElm = (Element) filesElm.node(i);
            String fileName = fileElm.attributeValue("file_name");
            soapFileInfo.setFileName(fileName);
            String errorStr = fileElm.attributeValue("error");
            if (errorStr == null || errorStr.length() == 0) {
                String id = fileElm.attributeValue("id");
                String folderId = fileElm.attributeValue("folder_id");
                String shared = fileElm.attributeValue("shared");
                String publicName = fileElm.attributeValue("public_name");
                soapFileInfo.setFileId(id);
                soapFileInfo.setFolderId(folderId);
                if ("1".equals(shared)) {
                    soapFileInfo.setShared(true);
                } else {
                    soapFileInfo.setShared(false);
                }
                soapFileInfo.setSharedName(publicName);

            } else {
                uploadFileStatus.setErrorInfo(errorStr);
            }
            list.add(uploadFileStatus);
        }
        return list;
    }
}
