/**
 * All rights reserved.
 */
package box.functions;

import box.objects.BoxFile;

/**
 * @author Jimmy
 * 
 */
public class GetFileInfoResponseImpl extends BoxResponseImpl implements
        GetFileInfoResponse {

    /** box file. */
    private BoxFile file;

    /**
     * @return the file
     */
    public BoxFile getFile() {
        return this.file;
    }

    /**
     * @param file
     *            the file to set
     */
    public void setFile(BoxFile file) {
        this.file = file;
    }
}
