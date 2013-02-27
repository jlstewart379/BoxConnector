/**
 * All rights reserved.
 */
package box.factories;

import java.util.logging.Logger;

import box.functions.AddToMyBoxResponse;
import box.functions.AddToTagResponse;
import box.functions.CreateFolderResponse;
import box.functions.DeleteResponse;
import box.functions.DownloadResponse;
import box.functions.ExportTagsResponse;
import box.functions.GetAccountTreeResponse;
import box.functions.GetAuthTokenResponse;
import box.functions.GetFileInfoResponse;
import box.functions.GetFriendsResponse;
import box.functions.GetTicketResponse;
import box.functions.LogoutResponse;
import box.functions.MoveResponse;
import box.functions.PrivateShareResponse;
import box.functions.PublicShareResponse;
import box.functions.PublicUnshareResponse;
import box.functions.RegisterNewUserResponse;
import box.functions.RenameResponse;
import box.functions.RequestFriendsResponse;
import box.functions.SetDescriptionResponse;
import box.functions.UploadResponse;
import box.functions.VerifyRegistrationEmailResponse;

/**
 * @author Jimmy
 * 
 */
public class BoxResponseFactory extends BaseBoxFactory {

    /** log4j object. */
    protected static final Logger LOGGER = Logger
            .getAnonymousLogger();

    /**
     * create response object.
     * 
     * @return response object
     */
    public static AddToMyBoxResponse createAddToMyBoxResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.AddToMyBoxResponse");
        return (AddToMyBoxResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static AddToTagResponse createAddToTagResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.AddToTagResponse");
        return (AddToTagResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static CreateFolderResponse createCreateFolderResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.CreateFolderResponse");
        return (CreateFolderResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static DeleteResponse createDeleteResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.DeleteResponse");
        return (DeleteResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static DownloadResponse createDownloadResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.DownloadResponse");
        return (DownloadResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static ExportTagsResponse createExportTagsResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.ExportTagsResponse");
        return (ExportTagsResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static GetAccountTreeResponse createGetAccountTreeResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.GetAccountTreeResponse");
        return (GetAccountTreeResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static GetAuthTokenResponse createGetAuthTokenResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.GetAuthTokenResponse");
        return (GetAuthTokenResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static GetFileInfoResponse createGetFileInfoResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.GetFileInfoResponse");
        return (GetFileInfoResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static GetFriendsResponse createGetFriendsResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.GetFriendsResponse");
        return (GetFriendsResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static GetTicketResponse createGetTicketResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.GetTicketResponse");
        return (GetTicketResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static LogoutResponse createLogoutResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.LogoutResponse");
        return (LogoutResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static MoveResponse createMoveResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.MoveResponse");
        return (MoveResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static PrivateShareResponse createPrivateShareResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.PrivateShareResponse");
        return (PrivateShareResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static PublicShareResponse createPublicShareResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.PublicShareResponse");
        return (PublicShareResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static PublicUnshareResponse createPublicUnshareResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.PublicUnshareResponse");
        return (PublicUnshareResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static RegisterNewUserResponse createRegisterNewUserResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.RegisterNewUserResponse");
        return (RegisterNewUserResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static RenameResponse createRenameResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.RenameResponse");
        return (RenameResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static RequestFriendsResponse createRequestFriendsResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.RequestFriendsResponse");
        return (RequestFriendsResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static SetDescriptionResponse createSetDescriptionResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.SetDescriptionResponse");
        return (SetDescriptionResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static UploadResponse createUploadResponse() {
    	Object obj = newInstanceOf("box4j.config.responsefactory.UploadResponse");
    	return (UploadResponse) obj;
    }

    /**
     * create response object.
     * 
     * @return response object
     */
    public static VerifyRegistrationEmailResponse createVerifyRegistrationEmailResponse() {
        Object obj = newInstanceOf("box4j.config.responsefactory.VerifyRegistrationEmailResponse");
        return (VerifyRegistrationEmailResponse) obj;
    }

}
