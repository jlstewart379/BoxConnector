/**
 * All rights reserved.
 */
package box.functions;

import box.objects.BoxFolder;

/**
 * @author Jimmy
 * 
 */
public class CreateFolderResponseImpl extends BoxResponseImpl implements
        CreateFolderResponse {

    /** created folder. */
    private BoxFolder folder;

    /**
     * @return the folder
     */
    public BoxFolder getFolder() {
        return this.folder;
    }

    /**
     * @param folder
     *            the folder to set
     */
    public void setFolder(BoxFolder folder) {
        this.folder = folder;
    }
}
