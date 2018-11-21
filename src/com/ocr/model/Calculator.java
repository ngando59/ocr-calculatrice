package com.ocr.model;

import com.ocr.model.operation.*;

public class Calculator {

	private double lastValue;
	private double currentValue;
	private TypeOperator currentOperator;
	public boolean isOnDecimalMode;
	public int decimalMode;
	
	public Calculator() {
		this.lastValue = 0;
		this.currentValue = 0;
		currentOperator = null;
		isOnDecimalMode = false;
		decimalMode = 10;
	}

	public double getLastValue() {
		return lastValue;
	}

	public void setLastValue(double lastValue) {
		this.lastValue = lastValue;
	}

	public double getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}

	public TypeOperator getCurrentOperator() {
		return currentOperator;
	}

	public void setCurrentOperator(TypeOperator currentOperator) {
		this.currentOperator = currentOperator;
	}
	
	public boolean isOnDecimalMode() {
		return isOnDecimalMode;
	}

	public void setOnDecimalMode(boolean isOnDecimalMode) {
		this.isOnDecimalMode = isOnDecimalMode;
	}
	
	public int getDecimalMode() {
		return decimalMode;
	}

	public void setDecimalMode(int decimalMode) {
		this.decimalMode = decimalMode;
	}

	//public void reset() {}
	
	/**
	 * This function make the operation between the last value and the current value
	 * @return the result of lastValue TypeOperator currentValue
	 * */
	public void makeOperation() {
		Operation op = null;
		switch (currentOperator) {
			case PLUS :
				op = new Addition(lastValue, currentValue);
				break;
			case MOINS :
				op = new Substraction(lastValue, currentValue);
				break;
			case FOIS :
				op = new Multiplication(lastValue, currentValue);
				break;
			case DIVISER :
				op = new Division(lastValue, currentValue);
				break;
		default:
			break;
		}
		this.setCurrentValue(op.result());
	}
}
