/**
 * All rights reserved.
 */
package box.functions;

import box.constants.BoxConstant;

/**
 * @author Jimmy
 * 
 */
public class LogoutRequestImpl extends BoxRequestImpl implements LogoutRequest {

    /** auth token. */
    private String authToken;

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
     * @return action name
     */
    public String getActionName() {
        return BoxConstant.ACTION_NAME_LOGOUT;
    }
}
