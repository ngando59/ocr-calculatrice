package com.ocr.model.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ocr.model.button.MyButton;
import com.ocr.view.Windows;

public class MyActionListener implements ActionListener {
	private MyButton button;
	private Windows windows;
	
	public MyActionListener(MyButton button, Windows windows) {
		super();
		this.button = button;
		this.windows = windows;
	}

	public MyButton getButton() {
		return button;
	}

	public void setButton(MyButton button) {
		this.button = button;
	}

	public Windows getWindows() {
		return windows;
	}

	public void setWindows(Windows windows) {
		this.windows = windows;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.getWindows().writeOnTerminal(this.getButton());	
	}

}
