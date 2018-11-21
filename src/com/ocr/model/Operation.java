package com.ocr.model;

public class Operation {
	private double operand1;
	private double operand2;
	private TypeOperator operator;
	
	public Operation() {}
		
	public Operation(double operand1, double operand2, TypeOperator operator) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
	}

	public Operation(double operand1, double operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	public double getOperand1() {
		return operand1;
	}

	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}

	public double getOperand2() {
		return operand2;
	}

	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}

	public TypeOperator getOperator() {
		return operator;
	}

	public void setOperator(TypeOperator operator) {
		this.operator = operator;
	}

	public String toSting() {
		return "( "+operand1+" "+operator.toString()+" "+operand2+" )";
	}
	
	/**
	 * this function make the operation between operand1 and operand2
	 * @return the result of operand1 operator operand2
	 * */
	public double result() {return 0;}
}
