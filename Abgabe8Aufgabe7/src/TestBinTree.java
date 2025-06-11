import java.util.LinkedList;
import java.util.Random;

/**
 * Klasse um das Zählen der Knoten in einem Binärbaum zu testen
 * @author lesske
 *
 */
public class TestBinTree {

	public static void main(String[] args) {

		//erzeuge alle Knoten
		Random random = new Random();
		// Habe zur Übersichtlichkeit die Knotenzahl verringert
		int size = random.nextInt(10);
		// Kontrollausgabe, um countNodes zu prüfen
		System.out.println("Zufällig generierte Größe: " + size);
		LinkedList<TreeNode<Character>> nodelist = new LinkedList<TreeNode<Character>>();
		for (int i = 0; i < size; i++) {
			char c = (char) (48+ random.nextInt(42));
			nodelist.add(new TreeNode<Character>(c));
		}


		// erzeuge denBaum
		BinaryTree<Character> tree = new BinaryTree<Character>(nodelist.getFirst());

		// zufälliger Aufbau des Baums
		TreeNode<Character> root = nodelist.getFirst();
		for (int i = 1; i < nodelist.size(); i++) {
			TreeNode<Character> tmp = root;
			double p = random.nextDouble();
			boolean stop = false;
			while (!stop) {
				if (p <= 0.5) {
					if (tmp.getLeft() == null) {
						tmp.setLeft(nodelist.get(i));
						stop = true;
					} else
						tmp = tmp.getLeft();
				} else {
					if (tmp.getRight() == null) {
						tmp.setRight(nodelist.get(i));
						stop = true;
					} else
						tmp = tmp.getRight();
				}
				p = random.nextDouble();
			}

		}

		int count = tree.countNodes();
		System.out.println("Der Baum hat " + count  + " Knoten");
		System.out.println(root.printTree());

		// Mein eigener Testbaum:
		LinkedList<TreeNode<Character>> testTreeList = new LinkedList<TreeNode<Character>>();
		for (int i = 0; i < 1; i++) {
			testTreeList.add(new TreeNode<Character>('a'));
		}
		BinaryTree<Character> testTree = new BinaryTree<Character>(testTreeList.getFirst());
		TreeNode<Character> testRoot = testTreeList.getFirst();
		TreeNode<Character> testTmp = testRoot;
		for (int i = 1; i < testTreeList.size(); i++) {
			testTmp.setLeft(testTreeList.get(i));
			testTmp = testTmp.getLeft();
		}
		// Testbaum Ausgabe:
		System.out.println("Testbaum: " + testRoot.printTree());
	}

}
