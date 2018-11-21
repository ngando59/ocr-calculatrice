package com.ocr.model.operation;

import com.ocr.model.Operation;
import com.ocr.model.TypeOperator;

public class Addition extends Operation {
	
	@SuppressWarnings("unused")
	private TypeOperator operator = TypeOperator.PLUS;
	
	public Addition(double operand1, double operand2) {
		super(operand1, operand2);
	}
	
	@Override
	public double result() {
		return this.getOperand1()+this.getOperand2();
	}

}
