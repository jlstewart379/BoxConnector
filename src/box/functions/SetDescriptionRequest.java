/**
 * All rights reserved.
 */
package box.functions;

/**
 * @author Jimmy
 * 
 */
public interface SetDescriptionRequest extends BoxRequest {

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
     * @return the description
     */
    public String getDescription();

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description);
}
