/**
 * All rights reserved.
 */
package box.functions;


/**
 * @author Jimmy
 * 
 */
public abstract class BoxRequestImpl implements BoxRequest {

    /** api key. */
    protected String apiKey;

    /**
     * @return the apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @param apiKey
     *            the apiKey to set
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * get action name.
     * 
     * @return action name
     */
    public abstract String getActionName();
}
