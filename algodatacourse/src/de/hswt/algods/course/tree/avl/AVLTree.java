package de.hswt.algods.course.tree.avl;

import de.hswt.algods.tree.avl.core.AVLNode;
import de.hswt.algods.tree.avl.core.AbstractAVLTree;

/**
 * @author Christopher Hartmann
 * @author Frank Leßke
 * @author YOU!
 */
public class AVLTree extends AbstractAVLTree<Integer> {

	/**
	 * Muss der Baum weiterhin balanciert werden? (Wird vor jedem Aufruf von
	 * insert(...) auf true gesetzt).
	 */
	protected boolean balanceNeeded;

	// protected int hoehe;

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hswt.algo.tree.core.AbstractAVLTree#rotateRight(AVLNode<Integer>
	 * n)
	 */
	@Override
	protected AVLNode<Integer> rotateRight(AVLNode<Integer> n) {

		if (n != null) {
			// Pause fuer die Animation (mit entsprechender Nachricht)
			waitForRotation("Right rotation at " + n.getElement());

			// Rotationsalgorithmus
			AVLNode<Integer> tmp = n.getLeft();
			n.setLeft(n.getLeft().getRight());
			tmp.setRight(n);

		}
		return null;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hswt.algo.tree.core.AbstractAVLTree#rotateLeft(AVLNode<Integer>
	 * n)
	 */
	@Override
	protected AVLNode<Integer> rotateLeft(AVLNode<Integer> n) {
		if (n != null) {
			// Pause fuer die Animation (mit entsprechender Nachricht)
			waitForRotation("Right rotation at " + n.getElement());

		}
		return null;
	}

	/*
	 * Insert a value in an avl tree with given root. The insertion might
	 * require a subsequent rotation in order to ensure the correct balance.
	 * 
	 * @see de.hswt.algo.tree.core.AbstractAVLTree#insert(AVLNode<Integer> node,
	 * Integer value)
	 */
	@Override
	public AVLNode<Integer> insert(AVLNode<Integer> node, Integer value) {

		AVLNode<Integer> neu = new AVLNode<Integer>(value);
		if (node == null)
			// bisher leerer Baum
			return neu;
		else {
			if (value < node.getElement()) {
				// links einf�gen
				node.setLeft(insert(node.getLeft(), value));

				// ueberpruefen ob Rotation notwendig
				if (node.getBalance() == 2) {
					if (value < node.getLeft().getElement()) {
						// Rechts-Rotation
						node = rotateRight(node);
					} else {
						// Links-Rechts-Rotation
						// ... to do
					}
				}
			} else {
				// rechts einf�gen
				// ... to do
			}

		}

		return node;

	}

	/**
	 * This method calculates and sets the balance of a node. Use:
	 * recalcBalance(root). And NOT root.setBalance(recalcBalance(root))
	 * 
	 * @param node
	 *            The node to recalculate the balance
	 * 
	 */
	private void recalcBalance(AVLNode<Integer> node) {
		if (node.getLeft() == null) {
			if (node.getRight() == null)
				node.setBalance(0);
			else
				node.setBalance(-node.getRight().getHeight());
		} else {
			if (node.getRight() == null)
				node.setBalance(node.getLeft().getHeight());
			else {
				node.setBalance(node.getLeft().getHeight()
						- node.getRight().getHeight());
			}
		}
	}

	/**
	 * Sets whether further balancing is needed.
	 */
	public void setBalanceNeeded(boolean balanceNeeded) {
		this.balanceNeeded = balanceNeeded;
	}
}