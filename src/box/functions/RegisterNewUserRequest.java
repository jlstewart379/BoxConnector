/**
 * All rights reserved.
 */
package box.functions;

/**
 * @author Jimmy
 * 
 */
public interface RegisterNewUserRequest extends BoxRequest {

    /**
     * @return the loginName
     */
    public String getLoginName();

    /**
     * @param loginName
     *            the loginName to set
     */
    public void setLoginName(String loginName);

    /**
     * @return the password
     */
    public String getPassword();

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password);
}
