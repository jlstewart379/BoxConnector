package box.functions;

/**
 * All rights reserved.
 */

public interface MoveRequest extends BoxRequest {

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
     * @return the target
     */
    public String getTarget();

    /**
     * @param target
     *            the target to set
     */
    public void setTarget(String target);

    /**
     * @return the targetId
     */
    public String getTargetId();

    /**
     * @param targetId
     *            the targetId to set
     */
    public void setTargetId(String targetId);

    /**
     * @return the destinationId
     */
    public String getDestinationId();

    /**
     * @param destinationId
     *            the destinationId to set
     */
    public void setDestinationId(String destinationId);
}
