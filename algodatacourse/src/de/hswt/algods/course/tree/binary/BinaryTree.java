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
		
		// TODO implement me!		
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
