/**
 * All rights reserved.
 */
package box.functions;

/**
 * @author Jimmy
 * 
 */
public interface PublicShareResponse extends BoxResponse {

    /**
     * @return the publicName
     */
    public String getPublicName();

    /**
     * @param publicName
     *            the publicName to set
     */
    public void setPublicName(String publicName);
}
