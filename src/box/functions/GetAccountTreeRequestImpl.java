/**
 * All rights reserved.
 */
package box.functions;

import box.constants.BoxConstant;

/**
 * @author Jimmy
 * 
 */
public class GetAccountTreeRequestImpl extends BoxRequestImpl implements
        GetAccountTreeRequest {

    /** auth token. */
    private String authToken;

    /** folder id. */
    private String folderId;

    /** parameters, could be 'onelevel','nofiles','nozip'. */
    private String[] params;

    /**
     * @return the authToken
     */
    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * @param authToken
     *            the authToken to set
     */
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * @return the folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @param folderId
     *            the folderId to set
     */
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    /**
     * @return the params
     */
    public String[] getParams() {
        return this.params;
    }

    /**
     * @param params
     *            the params to set
     */
    public void setParams(String[] params) {
        this.params = params;
    }

    /**
     * @return action name
     */
    public String getActionName() {
        return BoxConstant.ACTION_NAME_GET_ACCOUNT_TREE;
    }
}
