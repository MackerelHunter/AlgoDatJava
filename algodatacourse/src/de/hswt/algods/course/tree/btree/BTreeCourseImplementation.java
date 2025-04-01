package de.hswt.algods.course.tree.btree;

import de.hswt.algods.tree.btree.core.BTreeServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * @author Hartmann
 *
 */
@ServiceImplementation(
		id = "de.hswt.algo.tree.btree.course.BTreeCourseImplementation", 
		name = "Course implementation", position = 1)
public class BTreeCourseImplementation extends BTreeServiceProvider {

	/* (non-Javadoc)
	 * @see de.hswt.algo.tree.binary.core.BTreeServiceProvider#getNewTree()
	 */
	public BTree<Integer> getNewTree() {
		return new BTree<Integer>();
	}
}
