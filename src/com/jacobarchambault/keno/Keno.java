package com.jacobarchambault.keno;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
// Jacob Archambault
// 15 Mar 2021
// The purpose of this program is to create a workable Keno game
public class Keno extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Border radioBorder = BorderFactory.createTitledBorder("Choose bet amount ($)");
	Border spotsBorder = BorderFactory.createTitledBorder("Choose numbers to play");
	JButton[] jButtons = new JButton[80];
	JPanel buttonPanel1;
	JPanel buttonPanel2;
	JPanel middlePanel;
	ButtonGroup dollarGroup = new ButtonGroup();
	public static void main(String[] args) {
	}

}
