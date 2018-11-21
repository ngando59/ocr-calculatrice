package com.ocr.model.button;

@SuppressWarnings("serial")
public class DigitButton extends MyButton {
	private int value;
	
	public DigitButton(int value) {
		super((int)value+"");
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString() {
		return this.value+"";
	}
}
