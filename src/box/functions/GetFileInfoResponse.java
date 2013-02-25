/**
 * All rights reserved.
 */
package box.functions;

import box.objects.BoxFile;


/**
 * @author Jimmy
 * 
 */
public interface GetFileInfoResponse extends BoxResponse {

    /**
     * @return the file
     */
    public BoxFile getFile();

    /**
     * @param file
     *            the file to set
     */
    public void setFile(BoxFile file);
}
