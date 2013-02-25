/**
 * All rights reserved.
 */
package box.functions;

import box.objects.BoxFolder;

/**
 * @author Jimmy
 * 
 */
public interface CreateFolderResponse extends BoxResponse {

    /**
     * @return the folder
     */
    public BoxFolder getFolder();

    /**
     * @param folder
     *            the folder to set
     */
    public void setFolder(BoxFolder folder);
}
