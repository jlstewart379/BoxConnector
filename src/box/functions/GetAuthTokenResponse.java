/**
 * All rights reserved.
 */
package box.functions;

import box.objects.BoxUser;

/**
 * @author Jimmy
 * 
 */
public interface GetAuthTokenResponse extends BoxResponse {

    /**
     * @return the authToken
     */
    public String getAuthToken();

    /**
     * @param authToken
     *            the authToken to set
     */
    public void setAuthToken(String authToken);

    /**
     * @return the user
     */
    public BoxUser getUser();

    /**
     * @param user
     *            the user to set
     */
    public void setUser(BoxUser user);
}
