package com.ocr.model.button;

import com.ocr.model.TypeOperator;

@SuppressWarnings("serial")
public class OperatorButton extends MyButton {
	private TypeOperator operator;

	
	public OperatorButton(TypeOperator operator) {
		super(operator.toString());
		this.operator = operator;
	}

	public TypeOperator getOperator() {
		return operator;
	}

	public void setOperator(TypeOperator operator) {
		this.operator = operator;
	}
	
	public String toString() {
		return operator.toString();
	}
}
