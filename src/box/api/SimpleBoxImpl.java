/**
 * 
 */
package box.api;

import java.io.IOException;

import box.functions.AddToMyBoxRequest;
import box.functions.AddToMyBoxResponse;
import box.functions.AddToTagRequest;
import box.functions.AddToTagResponse;
import box.functions.CreateFolderRequest;
import box.functions.CreateFolderResponse;
import box.functions.DeleteRequest;
import box.functions.DeleteResponse;
import box.functions.DownloadRequest;
import box.functions.DownloadResponse;
import box.functions.ExportTagsRequest;
import box.functions.ExportTagsResponse;
import box.functions.GetAccountTreeRequest;
import box.functions.GetAccountTreeResponse;
import box.functions.GetAuthTokenRequest;
import box.functions.GetAuthTokenResponse;
import box.functions.GetFileInfoRequest;
import box.functions.GetFileInfoResponse;
import box.functions.GetFriendsRequest;
import box.functions.GetFriendsResponse;
import box.functions.GetTicketRequest;
import box.functions.GetTicketResponse;
import box.functions.LogoutRequest;
import box.functions.LogoutResponse;
import box.functions.MoveRequest;
import box.functions.MoveResponse;
import box.functions.PrivateShareRequest;
import box.functions.PrivateShareResponse;
import box.functions.PublicShareRequest;
import box.functions.PublicShareResponse;
import box.functions.PublicUnshareRequest;
import box.functions.PublicUnshareResponse;
import box.functions.RegisterNewUserRequest;
import box.functions.RegisterNewUserResponse;
import box.functions.RenameRequest;
import box.functions.RenameResponse;
import box.functions.RequestFriendsRequest;
import box.functions.RequestFriendsResponse;
import box.functions.SetDescriptionRequest;
import box.functions.SetDescriptionResponse;
import box.functions.UploadRequest;
import box.functions.UploadResponse;
import box.functions.VerifyRegistrationEmailRequest;
import box.functions.VerifyRegistrationEmailResponse;
import box.methods.AddToMyBoxMethod;
import box.methods.AddToTagMethod;
import box.methods.CreateFolderMethod;
import box.methods.DeleteMethod;
import box.methods.DownloadMethod;
import box.methods.ExportTagsMethod;
import box.methods.GetAccountTreeMethod;
import box.methods.GetAuthTokenMethod;
import box.methods.GetFileInfoMethod;
import box.methods.GetFriendsMethod;
import box.methods.GetTicketMethod;
import box.methods.LogoutMethod;
import box.methods.MoveMethod;
import box.methods.PrivateShareMethod;
import box.methods.PublicShareMethod;
import box.methods.PublicUnshareMethod;
import box.methods.RegisterNewUserMethod;
import box.methods.RenameMethod;
import box.methods.RequestFriendsMethod;
import box.methods.SetDescriptionMethod;
import box.methods.UploadMethod;
import box.methods.VerifyRegistrationEmailMethod;
import box.objects.BoxException;
import box.utils.Logger;

/**
 * @author Jimmy
 * 
 */
public class SimpleBoxImpl implements BoxExternalAPI {

    /** log4j logger. */
    protected static final Logger LOGGER = Logger
            .getLogger(null);

    /** box action implementation. */
    private GetTicketMethod getTicketMethod = new GetTicketMethod();

    /** box action implementation. */
    private GetAuthTokenMethod getAuthTokenMethod = new GetAuthTokenMethod();

    /** box action implementation. */
    private LogoutMethod logoutMethod = new LogoutMethod();

    /** box action implementation. */
    private RegisterNewUserMethod registerNewUserMethod = new RegisterNewUserMethod();

    /** box action implementation. */
    private VerifyRegistrationEmailMethod verifyRegistrationEmailMethod = new VerifyRegistrationEmailMethod();

    /** box action implementation. */
    private GetAccountTreeMethod getAccountTreeMethod = new GetAccountTreeMethod();

    /** box action implementation. */
    private ExportTagsMethod exportTagsMethod = new ExportTagsMethod();

    /** box action implementation. */
    private CreateFolderMethod createFolderMethod = new CreateFolderMethod();

    /** box action implementation. */
    private MoveMethod moveMethod = new MoveMethod();

    /** box action implementation. */
    private RenameMethod renameMethod = new RenameMethod();

    /** box action implementation. */
    private DeleteMethod deleteMethod = new DeleteMethod();

    /** box action implementation. */
    private PublicShareMethod publicShareMethod = new PublicShareMethod();

    /** box action implementation. */
    private PublicUnshareMethod publicUnshareMethod = new PublicUnshareMethod();

    /** box action implementation. */
    private PrivateShareMethod privateShareMethod = new PrivateShareMethod();

    /** box action implementation. */
    private AddToMyBoxMethod addToMyBoxMethod = new AddToMyBoxMethod();

    /** box action implementation. */
    private AddToTagMethod addToTagMethod = new AddToTagMethod();

    /** box action implementation. */
    private GetFileInfoMethod getFileInfoMethod = new GetFileInfoMethod();

    /** box action implementation. */
    private SetDescriptionMethod setDescriptionMethod = new SetDescriptionMethod();

    /** box action implementation. */
    private GetFriendsMethod getFriendsMethod = new GetFriendsMethod();

    /** box action implementation. */
    private RequestFriendsMethod requestFriendsMethod = new RequestFriendsMethod();

    /** box action implementation. */
    private DownloadMethod downloadMethod = new DownloadMethod();

    /** box action implementation. */
    private UploadMethod uploadMethod = new UploadMethod();

    /**
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
        return this.uploadMethod.upload(uploadRequest);
    }

    /**
     * @param downloadRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     */
    public DownloadResponse download(DownloadRequest downloadRequest)
            throws IOException {
        return this.downloadMethod.download(downloadRequest);
    }

    /**
     * This method requests new friends to be added to your network. 'emails' -
     * array of emails. 'message' - text message that you want to send to
     * freinds. 'params' is an array of string where you can set additional
     * parameters, which are: box_auto_subscribe - subscribe to public boxes of
     * inveted users. no_email - don't send emails to invited users.
     * 
     * On a successful result, you will receive status 's_request_friends'. If
     * the result wasn't successful, status field can be: e_request_friends.
     * 
     * @param requestFriendsRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public RequestFriendsResponse requestFriends(
            RequestFriendsRequest requestFriendsRequest) throws IOException,
            BoxException {
        return this.requestFriendsMethod.requestFriends(requestFriendsRequest);
    }

    /**
     * This method is used to retrieve a list of freinds.
     * 
     * 'params' is an array of the string where you can set additional
     * parameters, which are: nozip - do not zip tree xml.
     * 
     * On a successful result you will receive 's_get_friends' as the status and
     * base64 encoded (and zipped) friends xml. Friends xml looks like this:
     * ......
     * 
     * @param getFriendsRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public GetFriendsResponse getFriends(GetFriendsRequest getFriendsRequest)
            throws IOException, BoxException {
        return this.getFriendsMethod.getFriends(getFriendsRequest);
    }

    /**
     * This method sets a description to a file or folder. 'target' can be a
     * 'file' or 'folder', 'target_id' - id of file or folder, description -
     * string that should be set as description.
     * 
     * On successful a result, you will receive status 's_set_description'. If
     * the result wasn't successful, status field can be: e_set_description.
     * 
     * @param setDescriptionRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public SetDescriptionResponse setDescription(
            SetDescriptionRequest setDescriptionRequest) throws IOException,
            BoxException {
        return this.setDescriptionMethod.setDescription(setDescriptionRequest);
    }

    /**
     * This method gets file info. 'file_id' param should contain valid if of
     * user file.
     * 
     * On successful a result, you will receive status 's_get_file_info' and
     * file info in 'info'. If the result wasn't successful, status field can
     * be: e_access_denied.
     * 
     * @param getFileInfoRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public GetFileInfoResponse getFileInfo(GetFileInfoRequest getFileInfoRequest)
            throws IOException, BoxException {
        return this.getFileInfoMethod.getFileInfo(getFileInfoRequest);
    }

    /**
     * This method adds file or folder to tags list. 'target' param can be
     * either 'file' or 'folder' depending on what do you want to add,
     * 'target_id' is the id of a file or folder to be added, 'tags' array of
     * tags where target will be added.
     * 
     * On successful a result, you will receive 'addtotag_ok'. If the result
     * wasn't successful, status field can be: addtotag_error.
     * 
     * @param addToTagRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public AddToTagResponse addToTag(AddToTagRequest addToTagRequest)
            throws IOException, BoxException {
        return this.addToTagMethod.addToTag(addToTagRequest);
    }

    /**
     * This method copies a file publicly shared by someone to a user's mybox.
     * 'file_id' and 'public_name' params identify a publicly shared file, you
     * should provide either file_id or public name (like '31nhke0ahp') as a
     * parameter. 'folder_id' is the id of a user's folder, where files are to
     * be copied.
     * 
     * On a successful result, the status will be 'addtomybox_ok'. If the result
     * wasn't successful, the status field can be: 'addtomybox_error',
     * 'not_logged_id', 'application_restricted', 's_link_exists'.
     * 
     * @param addToMyBoxRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public AddToMyBoxResponse addToMyBox(AddToMyBoxRequest addToMyBoxRequest)
            throws IOException, BoxException {
        return this.addToMyBoxMethod.addToMyBox(addToMyBoxRequest);
    }

    /**
     * This method privately shares a file or folder with another user(s).
     * 'target' param should be either 'file' or 'folder', 'target_id' is the id
     * of the file or folder to be shared. 'emails' params is an array of emails
     * of users' to share files with. if 'notify' param is true, then a
     * notification email will be sent to users, 'message' param is a message to
     * be included in the notification email.
     * 
     * Note: currently only files can be shared privately.
     * 
     * On a successful result, the status will be 'private_share_ok'. If the
     * result wasn't successful, the status field can be: 'private_share_error',
     * 'wrong_node', 'not_logged_in', 'application_restricted'.
     * 
     * @param privateShareRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public PrivateShareResponse privateShare(
            PrivateShareRequest privateShareRequest) throws IOException,
            BoxException {
        return this.privateShareMethod.privateShare(privateShareRequest);
    }

    /**
     * This method unshares a shared file or folder. 'target' param shoud be
     * either 'file' or 'folder', 'target_id' is id of a file or folder to be
     * unshared.
     * 
     * On a successful result, the status will be 'unshare_ok'. If the result
     * wasn't successful, the status field can be: 'unshare_error',
     * 'wrong_node', 'not_logged_in', 'application_restricted'.
     * 
     * @param publicUnshareRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public PublicUnshareResponse publicUnshare(
            PublicUnshareRequest publicUnshareRequest) throws IOException,
            BoxException {
        return this.publicUnshareMethod.publicUnshare(publicUnshareRequest);
    }

    /**
     * This method publicly shares a file or folder. 'target' param should be
     * either 'file' or 'folder', 'target_id' is id of the file or folder to be
     * shared. 'password' param is to protect sharing with a password, 'emails'
     * params is array of emails to notify about a new share, 'message' param is
     * some message to be included in a notification email.
     * 
     * On a successful result, the status will be 'share_ok' and 'public_name'
     * param will be a unique identifier of a publicly shared file or folder. If
     * the result wasn't successful, the status field can be: 'share_error',
     * 'wrong_node', 'not_logged_in', 'application_restricted'.
     * 
     * @param publicShareRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public PublicShareResponse publicShare(PublicShareRequest publicShareRequest)
            throws IOException, BoxException {
        return this.publicShareMethod.publicShare(publicShareRequest);
    }

    /**
     * This method deletes a file or folder.
     * 
     * 'target' param can be either 'file' or 'folder' depending on what you
     * want to delete, 'target_id' is id of a file or folder to be deleted.
     * 
     * On a successful result, the status will be 's_delete_node'. If the result
     * wasn't successful, status field can be: 'e_delete_node', 'not_logged_in',
     * 'application_restricted'.
     * 
     * @param deleteRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public DeleteResponse delete(DeleteRequest deleteRequest)
            throws IOException, BoxException {
        return this.deleteMethod.delete(deleteRequest);
    }

    /**
     * This method renames a file or folder.
     * 
     * 'target' param can be either 'file' or 'folder' depending on what you
     * want to rename, 'target_id' is the id of a file or folder to be renamed,
     * 'new_name' is the new name for a file or folder.
     * 
     * On a successful result, status will be 's_rename_node'. If result wasn't
     * successful, stat's field can be: 'e_rename_node', 'not_logged_in',
     * 'application_restricted'.
     * 
     * @param renameRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public RenameResponse rename(RenameRequest renameRequest)
            throws IOException, BoxException {
        return this.renameMethod.rename(renameRequest);
    }

    /**
     * This method moves a file or folder to another folder.
     * 
     * 'target' param can be either 'file' or 'folder' depending on what do you
     * want to move, 'target_id' is the id of a file or folder to be moved,
     * 'destination_id' is the destination folder id.
     * 
     * On a successful result, status will be 's_move_node'. If the result
     * wasn't successful, status field can be: 'e_move_node', 'not_logged_in',
     * 'application_restricted'.
     * 
     * @param moveRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public MoveResponse move(MoveRequest moveRequest) throws IOException,
            BoxException {
        return this.moveMethod.move(moveRequest);
    }

    /**
     * This method creates a new folder.
     * 
     * 'parent_id' param is the id of a folder in which a new folder will be
     * created, 'name' param is the name of a new folder. Set 'share' to 1 if
     * you want to share a folder publicly.
     * 
     * On a successful result, the status will be 'create_ok'.
     * 
     * If the result wasn't successful, status field can be:
     * 'e_no_parent_folder', 'not_logged_in', 'application_r'stricted'.
     * 
     * @param createFolderRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public CreateFolderResponse createFolder(
            CreateFolderRequest createFolderRequest) throws IOException,
            BoxException {
        return this.createFolderMethod.createFolder(createFolderRequest);
    }

    /**
     * This method returns all the user's tags.
     * 
     * On successful a result, you will receive 'export_tags_ok' and tag_xml
     * will be base64 encoded tags xml. After decoding tag_xml you will get xml
     * like this:
     * 
     * <?xml version="1.0"?> <tags> <tag id="37"> music </tag> <tag id="38"> mp3
     * </tag> </tags> If the result wasn't successful, status field can be:
     * not_logged_id, application_restricted.
     * 
     * @param exportTagsRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public ExportTagsResponse exportTags(ExportTagsRequest exportTagsRequest)
            throws IOException, BoxException {
        return this.exportTagsMethod.exportTags(exportTagsRequest);
    }

    /**
     * This method is used to get a user's files and folders tree.
     * 
     * 'folder_id' param defines root folder from which the tree begins.
     * 'params' is array of string where you can set additional parameters,
     * which are: onelevel - make a tree of one level depth, so you will get
     * only files and folders stored in folder which folder_id you have
     * provided. nofiles - include folders only in result tree, no files. nozip -
     * do not zip tree xml.
     * 
     * On successful result you will receive 'listing_ok' as status and base64
     * encoded zipped tree xml. So you have to decode the received tree, then
     * unzip it (if you haven't set 'nozip' param) and you will get xml like
     * this: (note that updatedand createdare UNIX timestamps in PST).
     * 
     * @param getAccountTreeRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public GetAccountTreeResponse getAccountTree(
            GetAccountTreeRequest getAccountTreeRequest) throws IOException,
            BoxException {
        return this.getAccountTreeMethod.getAccountTree(getAccountTreeRequest);
    }

    /**
     * This method is used to verify user registration email . Upon a not used
     * and right registration email, the status param will be 'email_ok'. Else
     * status field can be: 'email_invalid', 'email_already_registered',
     * 'application_restricted'.
     * 
     * @param verifyRegistrationEmailRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public VerifyRegistrationEmailResponse verifyRegistrationEmail(
            VerifyRegistrationEmailRequest verifyRegistrationEmailRequest)
            throws IOException, BoxException {
        return this.verifyRegistrationEmailMethod
                .verifyRegistrationEmail(verifyRegistrationEmailRequest);
    }

    /**
     * This method is used to register a user. Upon a successful registration,
     * the status param will be 'successful_register'. If registration wasn't
     * successful, status field can be: 'e_register', 'email_invalid',
     * 'email_already_registered', 'application_restricted'.
     * 
     * @param registerNewUserRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public RegisterNewUserResponse registerNewUser(
            RegisterNewUserRequest registerNewUserRequest) throws IOException,
            BoxException {
        return this.registerNewUserMethod
                .registerNewUser(registerNewUserRequest);
    }

    /**
     * This method is used to logout a user. On successful logout method will
     * return 'logout_ok' as status. If logout wasn't successful, then status
     * filed can be: 'invalid_auth_token' when auth_token is invalid.
     * 
     * @param logoutRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public LogoutResponse logout(LogoutRequest logoutRequest)
            throws IOException, BoxException {
        return this.logoutMethod.logout(logoutRequest);
    }

    /**
     * This method is used in the authorization process. You should call this
     * method after the user has authorized themself on box.net site. Pass
     * ticket that you get when called get_ticket method. On a successful
     * result, method will return 'get_auth_token_ok' as status, auth_token to
     * use in other method calls, and user struct which describes logged user.
     * Request.
     * 
     * @param getAuthTokenRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public GetAuthTokenResponse getAuthToken(
            GetAuthTokenRequest getAuthTokenRequest) throws IOException,
            BoxException {
        return this.getAuthTokenMethod.getAuthToken(getAuthTokenRequest);
    }

    /**
     * @param getTicketRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     * @throws BoxException
     *             box exception
     */
    public GetTicketResponse getTicket(GetTicketRequest getTicketRequest)
            throws IOException, BoxException {
        return this.getTicketMethod.getTicket(getTicketRequest);
    }

}