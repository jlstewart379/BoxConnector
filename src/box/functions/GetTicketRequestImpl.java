/**
 * All rights reserved.
 */
package box.functions;

import box.constants.BoxConstant;

/**
 * @author Jimmy
 * 
 */
public class GetTicketRequestImpl extends BoxRequestImpl implements
        GetTicketRequest {

    /**
     * @return action name
     */
    public String getActionName() {
        return BoxConstant.ACTION_NAME_GET_TICKET;
    }

}
