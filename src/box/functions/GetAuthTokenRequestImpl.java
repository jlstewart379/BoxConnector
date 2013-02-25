/**
 * All rights reserved.
 */
package box.functions;

import box.constants.BoxConstant;

/**
 * @author Jimmy
 * 
 */
public class GetAuthTokenRequestImpl extends BoxRequestImpl implements
        GetAuthTokenRequest {

    /** ticket. */
    private String ticket;

    /**
     * @return the ticket
     */
    public String getTicket() {
        return this.ticket;
    }

    /**
     * @param ticket
     *            the ticket to set
     */
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    /**
     * @return action name
     */
    public String getActionName() {
        return BoxConstant.ACTION_NAME_GET_AUTH_TOKEN;
    }
}
