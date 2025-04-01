package de.hswt.algods.course.tree.binary;

import java.util.LinkedList;

import de.hswt.algods.tree.binary.core.AbstractBinaryTree;
import de.hswt.algods.tree.traversing.core.TreeTraversingServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * @author Frank Lesske
 * @author Marco Luthardt
 * @author Christopher Hartmann
 * @author <YOU!>
 * 
 */
@ServiceImplementation(id = "de.hswt.algo.tree.traversing.course.TraversityCourseImplementation", name = "Course implementation", position = 1)
public class TraversityCourseImplementation extends
		TreeTraversingServiceProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.tree.traversing.core.TreeTraversingServiceProvider#levelOrder
	 * (de.hswt.algo.tree.core.TreeNode)
	 */
	@Override
	protected void levelOrder(AbstractBinaryTree<Integer> node) {
		if (node != null && node.getRoot() != null) {
			LinkedList<AbstractBinaryTree<Integer>> q = new LinkedList<AbstractBinaryTree<Integer>>();
			q.add(node);
			while (!q.isEmpty()) {
				checkNode(q.getFirst().getRoot());
				if (q.getFirst().getLeft() != null) {
					q.add(q.getFirst().getLeft());
				}
				if (q.getFirst().getRight() != null) {
					q.add(q.getFirst().getRight());
				}
				q.removeFirst();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.tree.traversing.core.TreeTraversingServiceProvider#inOrder
	 * (de.hswt.algo.tree.core.TreeNode)
	 */
	@Override
	protected void inOrder(AbstractBinaryTree<Integer> node) {
		if (!(node == null)) {
			// TODO
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.tree.traversing.core.TreeTraversingServiceProvider#preOrder
	 * (de.hswt.algo.tree.core.TreeNode)
	 */
	@Override
	protected void preOrder(AbstractBinaryTree<Integer> node) {
		if (!(node == null)) {
			// TODO
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.tree.traversing.core.TreeTraversingServiceProvider#postOrder
	 * (de.hswt.algo.tree.core.TreeNode)
	 */
	@Override
	protected void postOrder(AbstractBinaryTree<Integer> node) {
		if (!(node == null)) {
			// TODO
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.tree.traversing.core.TreeTraversingServiceProvider#getNewTree
	 * ()
	 */
	@Override
	public BinaryTree<Integer> getNewTree() {
		return new BinaryTree<Integer>();
	}
}