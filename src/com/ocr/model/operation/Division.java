package com.ocr.model.operation;

import com.ocr.model.Operation;
import com.ocr.model.TypeOperator;

public class Division extends Operation {
	@SuppressWarnings("unused")
	private TypeOperator operator = TypeOperator.DIVISER;
	
	public Division(double operand1, double operand2) {
		super(operand1, operand2);
	}
	
	@Override
	public double result() {
		double d =  this.getOperand1()/this.getOperand2();
		if(d == Double.POSITIVE_INFINITY ) {
			throw new ArithmeticException();
		}
		return d;
	}
}
