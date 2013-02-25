/**
 * All rights reserved.
 */
package box.functions;

import box.constants.BoxConstant;

/**
 * @author Jimmy
 * 
 */
public class RegisterNewUserRequestImpl extends BoxRequestImpl implements
        RegisterNewUserRequest {

    /** email, to register a new user. */
    private String loginName;

    /** password. */
    private String password;

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
     * @return the password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return action name
     */
    public String getActionName() {
        return BoxConstant.ACTION_NAME_REGISTER_NEW_USER;
    }
}
