/**
 * All rights reserved.
 */
package box.functions;

import java.util.List;

/**
 * @author Jimmy
 * 
 */
public class UploadResponseImpl extends BoxResponseImpl implements
        UploadResponse {

    /** a list of UploadResult object. */
    private List uploadResultList;

    /**
     * @return the uploadResultList
     */
    public List getUploadResultList() {
        return this.uploadResultList;
    }

    /**
     * @param uploadResultList
     *            the uploadResultList to set
     */
    public void setUploadResultList(List uploadResultList) {
        this.uploadResultList = uploadResultList;
    }
}
