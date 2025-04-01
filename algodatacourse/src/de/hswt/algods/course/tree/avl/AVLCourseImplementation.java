/**
 * 
 */
package de.hswt.algods.course.tree.avl;

import de.hswt.algods.tree.avl.core.AVLServiceProvider;
import de.hswt.algods.tree.avl.core.AbstractAVLTree;
import de.hswt.atp.core.annotations.ServiceImplementation;

//import de.hswt.algo.automation.AnimationStopProvider;

/**
 * @author Christopher Hartmann
 * 
 */
@ServiceImplementation(id = "de.hswt.algo.tree.avl.AVLCourseImplementation", name = "Course implementation", position = 1)
public class AVLCourseImplementation extends AVLServiceProvider {
	@Override
	public AbstractAVLTree<Integer> getNewTree() {
		return createNewTree(AVLTree.class);
	}
}
