
/**
 * Ein Binärbaum wird repräsentiert durch einen Verweis auf den Wurzelknoten.
 * @author lesske
 *
 * @param <T>
 */
public class BinaryTree<T> {

	private TreeNode<T> root = null;

	//--------------- Konstruktoren -------------------------------

	public BinaryTree() {

	}

	public BinaryTree(TreeNode<T> node) {
		root = node;
	}

	//-------------- Methoden 

	public TreeNode<T> getRoot() {
		return root;
	}

	public BinaryTree<T> right() {
		return new BinaryTree(root.getRight());
	}

	public BinaryTree<T> left() {
		return new BinaryTree(root.getLeft());
	}

	public T value() {
		return root.getContent();
	}

	public boolean isEmpty() {
		return (root == null);
	}

	//-------------- Aufgabe ----------------------------

	public int countNodes() {
		/*
		 * Wenn root vom Unterbaum leer ist, wird 0 zurückgegeben
		 */
		if (isEmpty()) {
			return 0;
		}
		/*
		 * Ansonsten wird ein linker und ein rechter Unterbaum erzeugt
		 * und die Methode rekursiv aufgerufen
		 */
		int left = new BinaryTree(root.getLeft()).countNodes();
		int right = new BinaryTree(root.getRight()).countNodes();
		/*
		 * Sind beide Unterbäume leer oder abgearbeitet,
		 * können wir den Knoten zählen (und die Größe der Unterbäume addieren)
		 */
		return 1+left+right;
	}

}
