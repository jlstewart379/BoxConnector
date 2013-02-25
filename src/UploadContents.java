import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import box.api.BoxExternalAPI;
import box.api.SimpleBoxImpl;
import box.factories.BoxRequestFactory;
import box.functions.GetTicketRequest;
import box.functions.GetTicketResponse;
import box.functions.RegisterNewUserRequest;

public class UploadContents {

	public static void main(String[] args) {
		// the global API interface
		BoxExternalAPI iBoxExternalAPI = new SimpleBoxImpl();
		String API_KEY = "";

		try {
			// create a user for the preparation.
			String email = "<Enter new user_email here>";
			String password = "<new user password>";
			RegisterNewUserRequest registerNewUserRequest = BoxRequestFactory
					.createRegisterNewUserRequest(API_KEY, email, password);
			iBoxExternalAPI.registerNewUser(registerNewUserRequest);
			System.out.println("Your username is " + email);
			System.out.println("Your password is " + password);

			// get a ticket by API key.
			GetTicketRequest getTicketRequest = BoxRequestFactory
					.createGetTicketRequest(API_KEY);
			GetTicketResponse getTicketResponse = iBoxExternalAPI
					.getTicket(getTicketRequest);

			// after you get the ticket, you need to navigate to the URL
			// http://www.box.net/api/1.0/auth/<ticket> to enter the user name
			// and password to authenticate.
			System.out.println("Your ticket is "
					+ getTicketResponse.getTicket());

			System.out
					.println("press any key after you are authenticated from box.net page (www.box.net/api/1.0/auth/<ticket>).");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			try {
				String temp = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
