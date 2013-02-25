/**
 * All rights reserved.
 */
package box.functions;

/**
 * @author Jimmy
 * 
 */
public interface BoxRequest {

    /**
     * @return the apiKey
     */
    String getApiKey();

    /**
     * @param apiKey
     *            the apiKey to set
     */
    void setApiKey(String apiKey);

    /**
     * get action name.
     * 
     * @return action name
     */
    String getActionName();
}
