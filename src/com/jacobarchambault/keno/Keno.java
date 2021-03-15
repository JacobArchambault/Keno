package com.jacobarchambault.keno;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
// Jacob Archambault
// 15 Mar 2021
// The purpose of this program is to create a workable Keno game
public class Keno extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Border radioBorder = BorderFactory.createTitledBorder("Choose bet amount ($)");
	private Border spotsBorder = BorderFactory.createTitledBorder("Choose numbers to play");
	private JButton[] jButtons = new JButton[80];
	private JPanel buttonPanel1;
	private JPanel buttonPanel2;
	private JPanel middlePanel;
	private ButtonGroup dollarGroup = new ButtonGroup();
	private JRadioButton[] dollars = new JRadioButton[6];
	private ButtonGroup spotsGroup = new ButtonGroup();
	private JButton[] spots = new JButton[12];
	private Font font = new Font("Arial", Font.BOLD, 38);
	private Font font2 = new Font("Arial", Font.BOLD, 18);
	private JLabel luckyLabel = new JLabel(new ImageIcon("images/Lucky.png"));

	public static void main(String[] args) {
		new Keno();
	}
	
	public Keno() {
		this.setLayout(new GridLayout(3, 1));
		createButtons();
		createRadioButtons();
		createPanels();
		addPanels();
	}

	private void addPanels() {
		this.add(buttonPanel1);
		this.add(middlePanel);
		this.add(buttonPanel2);
	}

	private void createPanels() {
		// TODO Auto-generated method stub
		
	}

	private void createRadioButtons() {
		// TODO Auto-generated method stub
		
	}

	private void createButtons() {
		// TODO Auto-generated method stub
		
	}

}
