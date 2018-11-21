package com.ocr.testing;

import java.util.Scanner;

import com.ocr.model.Calculator;
import com.ocr.model.TypeOperator;
import com.ocr.model.operation.*;
import com.ocr.view.Windows;

@SuppressWarnings("unused")
public class test {
	static Scanner sc = new Scanner(System.in);
	
	static double readDouble() {
		System.out.print("Entrer un nombre : ");
		double rep = sc.nextDouble();
		System.out.println("-----------------");
		return rep;
	}
	
	static TypeOperator readOperator() {
		TypeOperator operator = null;
		System.out.println("Choississez une operation");
		System.out.println("1 => + ");
		System.out.println("2 => - ");
		System.out.println("3 => * ");
		System.out.println("4 => / ");
		System.out.print("Entrer le chifre correspondant à l'operation : ");
		int operateur  = sc.nextInt();
		System.out.println("-----------------");
		switch(operateur) {
			case 1 :
				operator = TypeOperator.PLUS;
				break;
			case 2 :
				operator = TypeOperator.MOINS;
				break;
			case 3 :
				operator = TypeOperator.FOIS;
				break;
			case 4 :
				operator = TypeOperator.DIVISER;
				break;
			default :
				break;
		}
		return operator;
	}
	
	public static void main(String[] args) {
		/*double op1 = 15;
		double op2 = 10;
		double op3 = 0;*/
		
		/*// Test addition
		Addition add = new Addition(op1,op2);
		System.out.println(add.result());
		
		// Test addition
		Substraction sub = new Substraction(op1,op2);
		System.out.println(sub.result());
		
		// Test division
		Division div = new Division(op1,op2);
		System.out.println(div.result());
		
		// Test multiplication
		Multiplication mul = new Multiplication(op1,op2);
		System.out.println(mul.result());
		
		// Test division par 0
		Division div2 = new Division(op1,op3);
		try {
			
			System.out.println(div2.result());
		} catch (Exception e) {
			System.err.println("Impossible de div par 0");}*/
		
		
		// Test Calulatrice 
		/*Calculator cal = new Calculator();
		double lastvalue = 0;
		double currentValue = 0;
		TypeOperator operator = null;
		
		// Test simple calcul 
		// lecture de la première operande
		currentValue = readDouble();
		// stockage de la valeur lu dans currentValue
		cal.setCurrentValue(currentValue);
		// récupératon de l'opération
		operator = readOperator();
		// stockage de l'opérateur 
		cal.setCurrentOperator(operator);
		// la valeur courrante deviens la dernière valeur
		cal.setLastValue(currentValue);
		// la valeur courrante devient 0
		cal.setCurrentValue(0);
		// lecture de la deuxième operande
		currentValue = readDouble();
		// stockage de la valeur lu dans currentValue
		cal.setCurrentValue(currentValue);
		// Calcul
		cal.makeOperation();
		// affichage résultat
		System.out.println("Resultat : "+cal.getCurrentValue());
		*/
		
		// Teste fenêtre
		Windows win = new Windows();
		win.run();
		//System.out.println(win.formatTerminal(12.0));
	}

}
