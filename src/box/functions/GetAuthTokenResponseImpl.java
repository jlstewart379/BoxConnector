/**
 * All rights reserved.
 */
package box.functions;

import box.objects.BoxUser;

/**
 * @author Jimmy
 * 
 */
public class GetAuthTokenResponseImpl extends BoxResponseImpl implements
        GetAuthTokenResponse {

    /** the authentication token. */
    private String authToken;

    /** the box user. */
    private BoxUser user;

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
     * @return the user
     */
    public BoxUser getUser() {
        return this.user;
    }

    /**
     * @param user
     *            the user to set
     */
    public void setUser(BoxUser user) {
        this.user = user;
    }
}
