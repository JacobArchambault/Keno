package com.jacobarchambault.keno;

import java.awt.Color;
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
	private Border radioBorder = BorderFactory.createTitledBorder(
			"Choose bet amount ($)");
	private Border spotsBorder = BorderFactory.createTitledBorder(
			"Choose numbers to play");
	private JButton[] buttons = new JButton[80];
	private JPanel buttonPanel1;
	private JPanel buttonPanel2;
	private JPanel middlePanel;
	private ButtonGroup dollarGroup = new ButtonGroup();
	private JRadioButton[] dollars = new JRadioButton[6];
	private ButtonGroup spotsGroup = new ButtonGroup();
	private JButton[] spots = new JButton[12];
	private Font font = new Font(
			"Arial",
			Font.BOLD,
			38);
	private Font font2 = new Font(
			"Arial",
			Font.BOLD,
			18);
	private JLabel luckyLabel = new JLabel(
			new ImageIcon(
					"images/Lucky.png"));

	public static void main(
			String[] args) {
		new Keno();
	}

	public Keno() {
		this.setLayout(
				new GridLayout(
						3,
						1));
		createButtons();
		createRadioButtons();
		createPanels();
		addPanels();
	}

	private void addPanels() {
		this.add(
				buttonPanel1);
		this.add(
				middlePanel);
		this.add(
				buttonPanel2);
	}

	private void createPanels() {
		// TODO Auto-generated method stub

	}

	private void createRadioButtons() {
		dollars[0] = new JRadioButton("1");
		dollars[1] = new JRadioButton("2");
		dollars[2] = new JRadioButton("3");
		dollars[3] = new JRadioButton("5");
		dollars[4] = new JRadioButton("10");
		dollars[5] = new JRadioButton("20");
		for (int i = 0; i < dollars.length; i++) {
			dollars[i].setFont(font2);
			dollarGroup.add(dollars[i]);
		}
		for (int i = 0; i < spots.length; i++) {
			spots[i] = new JButton(String.valueOf(i + 1));
			spotsGroup.add(spots[i]);
			spots[i].setFont(font2);
		}
	}

	private void createButtons() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(String.valueOf(i + 1));
			buttons[i].setHorizontalAlignment(JButton.CENTER);
			buttons[i].setFont(font);
			buttons[i].setBackground(getBackground().blue);
			buttons[i].setForeground(getForeground().yellow);
		}
	}

}
