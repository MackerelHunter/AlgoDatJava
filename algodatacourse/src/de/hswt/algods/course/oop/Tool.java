package de.hswt.algods.course.oop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 * @author Lesske
 *
 */


@SuppressWarnings("serial")
class Tool extends JFrame {

	public Tool() {
		super("Beispiel fuer BorderLayout");

		getContentPane().setLayout(new BorderLayout());

		JMenuBar mbar = new JMenuBar();
		JMenu file = new JMenu("File");
		file.add(new JMenuItem("New..."));
		

		file.add(new JMenuItem("Exit"));
		mbar.add(file);

		JMenu source = new JMenu("Source");
		source.add(new JMenuItem("Format"));
		mbar.add(source);

		getContentPane().add(mbar, BorderLayout.NORTH);

		DefaultMutableTreeNode root, node, node1;
		root = new DefaultMutableTreeNode("Projekt");
		node = new DefaultMutableTreeNode("default package");
		root.add(node);
		node1 = new DefaultMutableTreeNode("Tool.java");
		node.add(node1);
		node = new DefaultMutableTreeNode("Java");
		root.add(node);

		DefaultTreeModel treeModel = new DefaultTreeModel(root);
		JTree tree = new JTree(treeModel);

		JScrollPane scrollpane = new JScrollPane(tree);

		getContentPane().add(scrollpane, BorderLayout.WEST);

		JPanel panel = new JPanel(new GridLayout(2, 1));
		JButton button1 = new JButton("Java Editor");
		panel.add(button1);
		JButton button2 = new JButton("Debugger");
		panel.add(button2);

		getContentPane().add(panel, BorderLayout.EAST);
		
		JTextArea area = new JTextArea("In diesen Editor koennen Sie mit gruener Schrift schreiben");
		area.setForeground(Color.green);
		getContentPane().add(area,BorderLayout.CENTER);
		
		JTextField field = new JTextField("Das ist ein Konsolen-Fenster");
		field.setBackground(Color.black);
		field.setForeground(Color.white);
		getContentPane().add(field, BorderLayout.SOUTH);

		setSize(600, 400);
	}

	public static void main(String[] args) {
		Tool tool = new Tool();
		tool.setVisible(true);
	}
}