/**
 * All rights reserved.
 */
package box.functions;


/**
 * @author Jimmy
 * 
 */
public class PublicShareResponseImpl extends BoxResponseImpl implements
        PublicShareResponse {

    /** public name. */
    private String publicName;

    /**
     * @return the publicName
     */
    public String getPublicName() {
        return this.publicName;
    }

    /**
     * @param publicName
     *            the publicName to set
     */
    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }

}
