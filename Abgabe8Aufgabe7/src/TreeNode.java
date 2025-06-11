
/**
 * Der Knoten eines Baums. Ein Knoten hat einen Inhalt, einen linken und einen rechten Nachfolger.
 * @author lesske
 *
 * @param <T>
 */
public class TreeNode<T> {
	
	private T content;
	private TreeNode<T> left = null;
	private TreeNode<T> right = null;
	
	public TreeNode(T myContent) {
		content = myContent;
	}
	
	//----------------- Methoden -------------------------------------------
	
	public String toString() {
		return "(" + content.toString() + ")";
	}
	
	/**
	 * Diese Methode druckt rekursiv den Baum aus, der unter diesem Knoten steht.
	 * Das Format zum Drucken ist
	 * ( linker-Teilbaum Wurzel rechter-Teilbaum)
	 * @return
	 */
	
	/*
	 * Entspricht InOrder-Traversal
	 */
	public String printTree() {
		if (getContent() == null) {
			return "";
		}
		String leftTree = "";
		if (getLeft() != null) {
			leftTree = getLeft().printTree();
		}
		String rightTree = "";
		if (getRight() != null) {
			rightTree = getRight().printTree();
		}
		return ("(" + leftTree + content + rightTree + ")");
	}

	//-------------------- Getters and Setters ------------------------------
	
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}
}
