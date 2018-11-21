package com.ocr.model;

public enum TypeOperator {
	PLUS('+'),
	MOINS('-'),
	FOIS('*'),
	DIVISER('/'),
	EGAL('='),
	RESET('C'),
	POINT('.'),
	PARENTHESEOUVRE('('),
	PARENTHESEFERME(')'),
	NULL(' ');

	private char op;
	
	TypeOperator(char op) {
		this.op = op;
	}
	
	public String toString() {
		return this.op+"";
	}
	
	public char getOp() {
		return this.op;
	}

}
