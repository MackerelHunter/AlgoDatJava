package de.hswt.algods.course.tree.binary;

import de.hswt.algods.tree.binary.core.BinaryTreeServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * @author Marco Luthardt
 * 
 * 
 */
@ServiceImplementation(id = "de.hswt.algo.tree.binary.course.BinaryTreeCourseImplementation", name = "Course implementation", position = 1)
public class BinaryTreeCourseImplementation extends BinaryTreeServiceProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hswt.algo.tree.binary.core.BinaryTreeServiceProvider#getNewTree()
	 */
	@Override
	public BinaryTree<Integer> getNewTree() {
		return new BinaryTree<Integer>();
	}

}
