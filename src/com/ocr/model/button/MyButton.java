package com.ocr.model.button;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class MyButton extends JButton {
	private String name;

	public MyButton(String name) {
		super(name);
		this.setFont(new Font("Courrier", Font.BOLD,24));
		this.setFocusable(false);
		this.setPreferredSize(new Dimension(60, 40));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
	
}
