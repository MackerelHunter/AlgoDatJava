/**
 * 
 */
package de.hswt.algods.course.tree.btree;

import de.hswt.algods.tree.btree.core.AbstractBTree;
import de.hswt.algods.tree.btree.core.BTreeNode;

/**
 * @author lesske
 * @author hartmanc
 * @author you
 * 
 */
public class BTree<T extends Comparable<T>> extends AbstractBTree<T> {
	public BTree() {
	}

	public BTree(BTreeNode<T> n) {
		setRoot(n);
	}

	public boolean insert(T newContent) {
		if (getRoot() == null)
			setRoot(new BTreeNode<T>(newContent));
		else {
			setRoot(insert(newContent, getRoot()));
		}
		return true;
	}

	protected BTreeNode<T> insert(T newContent, BTreeNode<T> currentNode) {
		return insert(newContent, currentNode, null, null);
	}

	protected BTreeNode<T> insert(T newContent, BTreeNode<T> currentNode,
			BTreeNode<T> n1, BTreeNode<T> n2) {
		// TODO implement me!
		return null;
	}

}
