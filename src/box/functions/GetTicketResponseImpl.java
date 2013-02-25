/**
 * All rights reserved.
 */
package box.functions;


/**
 * @author Jimmy
 * 
 */
public class GetTicketResponseImpl extends BoxResponseImpl implements
        GetTicketResponse {

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
}
