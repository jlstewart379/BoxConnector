/**
 * All rights reserved.
 */
package box.functions;

/**
 * @author Jimmy
 * 
 */
public interface LogoutRequest extends BoxRequest {

    /**
     * @return the authToken
     */
    public String getAuthToken();

    /**
     * @param authToken
     *            the authToken to set
     */
    public void setAuthToken(String authToken);
}
