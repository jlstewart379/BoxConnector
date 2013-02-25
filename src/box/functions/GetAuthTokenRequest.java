/**
 * All rights reserved.
 */
package box.functions;

/**
 * @author Jimmy
 * 
 */
public interface GetAuthTokenRequest extends BoxRequest {

    /**
     * @return the ticket
     */
    public String getTicket();

    /**
     * @param ticket
     *            the ticket to set
     */
    public void setTicket(String ticket);
}
