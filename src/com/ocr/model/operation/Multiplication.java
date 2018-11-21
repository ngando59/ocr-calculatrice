package com.ocr.model.operation;

import com.ocr.model.Operation;
import com.ocr.model.TypeOperator;

public class Multiplication extends Operation {
	@SuppressWarnings("unused")
	private TypeOperator operator = TypeOperator.FOIS;
	
	public Multiplication(double operand1, double operand2) {
		super(operand1, operand2);
	}
	
	@Override
	public double result() {
		return this.getOperand1()*this.getOperand2();
	}
}
