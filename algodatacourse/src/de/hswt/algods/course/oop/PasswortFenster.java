package de.hswt.algods.course.oop;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author lesske
 */
@SuppressWarnings("serial")
public class PasswortFenster extends JFrame {

	JButton ok, cancel;
	JLabel label;
	JPasswordField feld;
	JTextField msg;
	String passwort;
	final String PW = "bioinformatik";

	public PasswortFenster() {
		super("ein Test für das GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setLayout(new GridLayout(3, 1));

		JPanel pPanel = new JPanel();
		pPanel.setLayout(new FlowLayout());

		label = new JLabel("Passwort eingeben:");
		pPanel.add(label);
		feld = new JPasswordField(12);
		pPanel.add(feld);

		getContentPane().add(pPanel);

		ok = new JButton("OK");
		
		cancel = new JButton("Cancel");
		
		JPanel bPanel = new JPanel();
		bPanel.setLayout(new FlowLayout());

		bPanel.add(ok);
		bPanel.add(cancel);
		getContentPane().add(bPanel);

		JPanel mPanel = new JPanel();
		mPanel.setLayout(new FlowLayout());

		msg = new JTextField(30);
		mPanel.add(msg);
		getContentPane().add(mPanel);

	}

	public static void main(String[] args) {
		PasswortFenster test = new PasswortFenster();
		test.setSize(400, 200);
		test.setVisible(true);
	}
}
