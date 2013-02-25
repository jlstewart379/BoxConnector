/**
 * All rights reserved.
 */
package box.functions;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author Jimmy
 * 
 */
public class GetAccountTreeResponseImpl extends BoxResponseImpl implements
        GetAccountTreeResponse {

    /**
     * a Java Swing tree structure, and each of tree node attached a
     * BoxAbstractFile object, wich can be either file or folder.
     */
    private DefaultMutableTreeNode tree;

    /** base64 encoded string of XML content. */
    private String encodedTree;

    /**
     * @return the tree
     */
    public DefaultMutableTreeNode getTree() {
        return this.tree;
    }

    /**
     * @param tree
     *            the tree to set
     */
    public void setTree(DefaultMutableTreeNode tree) {
        this.tree = tree;
    }

    /**
     * @return the encodedTree
     */
    public String getEncodedTree() {
        return this.encodedTree;
    }

    /**
     * @param encodedTree
     *            the encodedTree to set
     */
    public void setEncodedTree(String encodedTree) {
        this.encodedTree = encodedTree;
    }
}
