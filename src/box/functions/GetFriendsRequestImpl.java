/**
 * All rights reserved.
 */
package box.functions;

import box.constants.BoxConstant;

/**
 * @author Jimmy
 * 
 */
public class GetFriendsRequestImpl extends BoxRequestImpl implements
        GetFriendsRequest {

    /** auth token. */
    private String authToken;

    /** parameters, could be 'nozip'. */
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
        return BoxConstant.ACTION_NAME_GET_FRIENDS;
    }
}
