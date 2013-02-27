import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import box.api.BoxExternalAPI;
import box.api.SimpleBoxImpl;
import box.factories.BoxRequestFactory;
import box.functions.GetAccountTreeRequest;
import box.functions.GetTicketRequest;
import box.functions.GetTicketResponse;
import box.functions.RegisterNewUserRequest;
import box.functions.UploadRequest;
import box.functions.UploadResponse;
import box.objects.UploadResult;

public class UploadContents {

	public static void main(String[] args) {

		// the global API interface
		BoxExternalAPI iBoxExternalAPI = new SimpleBoxImpl();

		String API_KEY = "yv017qbu0wowat2spngv0joo70fd8loi";

		try {
			// create a user for the preparatiton.
			String email = "jstewart@teamnorthwoods.com";
			String password = "phonec5";
			RegisterNewUserRequest registerNewUserRequest = BoxRequestFactory
					.createRegisterNewUserRequest(API_KEY, email, password);
			System.out.println("attempting to register new user");
			iBoxExternalAPI.registerNewUser(registerNewUserRequest);
			
			//
			// // get a ticket by API key.
			GetTicketRequest getTicketRequest = BoxRequestFactory
					.createGetTicketRequest(API_KEY);
			GetTicketResponse getTicketResponse = iBoxExternalAPI
					.getTicket(getTicketRequest);

			// after you get the ticket, you need to navigate to the URL
			// http://www.box.net/api/1.0/auth/<ticket> to enter the user name
			// and password to authenticate.
			System.out.println("Your ticket is "
					+ getTicketResponse.getTicket());

			// http://www.box.net/api/1.0/auth/zkiqjmdtmxlcznw3ev9vd0c7kvjy339c
			String auth_token = "5m8eltwbgt2mvlimrsd9vap5swx1yon3";

			String[] params = { "nozip" };
			GetAccountTreeRequest getAccountTreeRequest = BoxRequestFactory
					.createGetAccountTreeRequest(API_KEY, auth_token, "0",
							params);
			

			iBoxExternalAPI.getAccountTree(getAccountTreeRequest);
			
	

			File tmpFile = createTempFile();

			String fileId = "6029939515";
			;
			// upload a file to the created folder.
			Map<String, File> fileMap = new HashMap<String, File>();
			
			fileMap.put(tmpFile.getName(), tmpFile);

			UploadRequest uploadRequest = BoxRequestFactory
					.createUploadRequest(auth_token, true, "637748671", fileMap);
		
			UploadResponse uploadResponse = iBoxExternalAPI
					.upload(uploadRequest);
			
			UploadResult uploadResult = (UploadResult) uploadResponse
					.getUploadResultList().get(0);
			String uploadedFileId = uploadResult.getFile().getFileId();
			System.out.println("Uploaded file id is: " + uploadedFileId);

			HashMap nameBytesHashMap = new HashMap();
			nameBytesHashMap.put("fileName.txt", "fileName.txt".getBytes());
			uploadRequest = BoxRequestFactory.createUploadRequest(auth_token,
					false, "637748671", nameBytesHashMap);
			iBoxExternalAPI.upload(uploadRequest);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static File createTempFile() {
		System.out.println("Create temp file");
		File tmpFile = null;
		BufferedWriter out = null;
		try {
			System.out.println("Create temp file1");
			tmpFile = File.createTempFile("9__1360075826.09921_", ".json");
			out = new BufferedWriter(new FileWriter(tmpFile));
			tmpFile.deleteOnExit();
			out.write("this is a test file for upload"
					+ +System.currentTimeMillis());
			out.close();
			System.out.println("Create temp file2");
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
			e.printStackTrace();
		}

		return tmpFile;
	}

}
