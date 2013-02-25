/**
 * All rights reserved.
 */
package box.functions;

/**
 * @author Jimmy
 * 
 */
public interface VerifyRegistrationEmailRequest extends BoxRequest {

    /**
     * @return the loginName
     */
    public String getLoginName();

    /**
     * @param loginName
     *            the loginName to set
     */
    public void setLoginName(String loginName);
}
