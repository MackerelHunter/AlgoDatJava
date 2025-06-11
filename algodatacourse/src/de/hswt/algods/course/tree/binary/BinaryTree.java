package de.hswt.algods.course.tree.binary;

import de.hswt.algods.tree.binary.core.AbstractBinaryTree;
import de.hswt.algods.tree.binary.core.BinaryTreeNode;

/**
 * @author Frank Lesske
 * @author Marco Luthardt
 * 
 */
public class BinaryTree<T extends Comparable<T>> extends AbstractBinaryTree<T> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hswt.algo.tree.binary.core.AbstractBinaryTree#insert(java.lang.Comparable
	 * )
	 */
	@Override
	public boolean insert(T value) {
		BinaryTreeNode<T> parent = null;
		BinaryTreeNode<T> child = this.getRoot();

		if (value == null) {
			return false;
		}
		// laufe zum Blatt, wo eingefügt werden soll
		while (child != null) {
			parent = child;
			if (value.compareTo(child.getElement()) == 0) {
				return false;
			} else {
				if (value.compareTo(child.getElement()) < 0) {
					child = child.getLeft();
				} else {
					child = child.getRight();
				}
			}
		}
		if (parent == null) {
			setRoot(new BinaryTreeNode<T>(value));
		} else {
			if (value.compareTo(parent.getElement()) < 0) {
				parent.setLeft(new BinaryTreeNode<T>(value));
			} else {
				parent.setRight(new BinaryTreeNode<T>(value));
			}
		}
		return true;	
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hswt.algo.tree.binary.core.AbstractBinaryTree#getLeft()
	 */
	@Override
	public BinaryTree<T> getLeft() {
		return (BinaryTree<T>)super.getLeft(); 
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hswt.algo.tree.binary.core.AbstractBinaryTree#getRight()
	 */
	@Override
	public BinaryTree<T> getRight() {
		return (BinaryTree<T>)super.getRight(); 
	}
}
