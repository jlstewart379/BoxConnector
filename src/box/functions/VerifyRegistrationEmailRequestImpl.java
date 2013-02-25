/**
 * All rights reserved.
 */
package box.functions;

import box.constants.BoxConstant;

/**
 * @author Jimmy
 * 
 */
public class VerifyRegistrationEmailRequestImpl extends BoxRequestImpl
        implements VerifyRegistrationEmailRequest {

    /** the email to verify. */
    private String loginName;

    /**
     * @return the loginName
     */
    public String getLoginName() {
        return this.loginName;
    }

    /**
     * @param loginName
     *            the loginName to set
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * @return action name
     */
    public String getActionName() {
        return BoxConstant.ACTION_NAME_VERIFY_REGISTRATION_EMAIL;
    }
}
