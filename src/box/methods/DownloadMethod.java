/**
 * 
 */
package box.methods;

import java.io.File;
import java.io.IOException;

import box.constants.BoxConstant;
import box.factories.BoxResponseFactory;
import box.functions.DownloadRequest;
import box.functions.DownloadResponse;

/**
 * @author Jimmy
 * 
 */
public class DownloadMethod extends BaseBoxMethod {

    /**
     * 
     * @param downloadRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     */
    public DownloadResponse download(DownloadRequest downloadRequest)
            throws IOException {
        DownloadResponse downloadResponse = BoxResponseFactory
                .createDownloadResponse();

        String authToken = downloadRequest.getAuthToken();
        String fileId = downloadRequest.getFileId();
        boolean asFile = downloadRequest.isAsFile();
        File inFile = downloadRequest.getInFile();

        StringBuffer urlBuff = new StringBuffer();
        urlBuff.append(apiUrlPrefix);
        urlBuff.append(BoxConstant.SLASH_STRING);
        urlBuff.append(apiVersion);
        urlBuff.append(BoxConstant.SLASH_STRING);
        urlBuff.append(BoxConstant.ACTION_NAME_DOWNLOAD);
        urlBuff.append(BoxConstant.SLASH_STRING);
        urlBuff.append(authToken);
        urlBuff.append(BoxConstant.SLASH_STRING);
        urlBuff.append(fileId);

        downloadResponse.setAsFile(asFile);
        if (asFile) {
            File result = httpManager.doGetFile(urlBuff.toString(), inFile);
            downloadResponse.setOutFile(result);
        } else {
            byte[] result = httpManager.doGetByteArry(urlBuff.toString());
            downloadResponse.setRawData(result);
        }
        return downloadResponse;
    }

}
