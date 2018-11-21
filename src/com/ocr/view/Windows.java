package com.ocr.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import com.ocr.model.TypeOperator;
import com.ocr.model.button.DigitButton;
import com.ocr.model.button.MyButton;
import com.ocr.model.button.OperatorButton;
import com.ocr.model.listener.MyActionListener;


@SuppressWarnings("serial")
public class Windows extends JFrame implements MyObservable  {
	private JPanel container;
	//private Calculator calculator;
	private static JLabel terminal; 
	private static Color customColor = new Color(239,245,255);
	private static ArrayList<MyObserver> listObservateur = new ArrayList<MyObserver>();
	private static String currentEpr = "0 ";
    private static ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
	
	public Windows() {
		super();
		//calculator = new Calculator();
		this.setTitle("MyCalculator");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		container = new JPanel();
		container.setBackground(customColor);
		container.setLayout(new BorderLayout());
		
		JPanel panelNorth = new JPanel();
		// Terminal
		terminal = new JLabel(currentEpr, SwingConstants.RIGHT);
		terminal.setFont(new Font("Courrier", Font.BOLD,24));
		terminal.setPreferredSize(new Dimension(280, 50));
		terminal.setOpaque(true);
		terminal.setBackground(Color.WHITE);
		Border borderGray = BorderFactory.createLineBorder(new Color(222,228,237));
		terminal.setBorder(borderGray);
		// Button reset
		OperatorButton reset = new OperatorButton(TypeOperator.RESET);
		reset.addActionListener(new MyActionListener(reset, this));
		reset.setForeground(Color.red);
		OperatorButton paraO = new OperatorButton(TypeOperator.PARENTHESEOUVRE);
		paraO.addActionListener(new MyActionListener(paraO, this));
		OperatorButton paraF = new OperatorButton(TypeOperator.PARENTHESEFERME);
		paraF.addActionListener(new MyActionListener(paraF, this));
		OperatorButton nullO = new OperatorButton(TypeOperator.NULL);
		nullO.setVisible(false);
		panelNorth.setBackground(customColor);
		panelNorth.setLayout(new GridLayout(2,1));
		
		JPanel panelSNORTH = new JPanel();
		panelSNORTH.setLayout(new GridLayout(1,4));
		panelSNORTH.add(nullO);
		panelSNORTH.add(paraO);
		panelSNORTH.add(paraF);
		panelSNORTH.add(reset);
		
		panelNorth.add(terminal);
		panelNorth.add(panelSNORTH);
		//panelNorth.add(reset);
		
		JPanel panelSouth = new JPanel();
		panelSouth.setLayout(new GridLayout(4,4));
		
		DigitButton b7 = new DigitButton(7);
		b7.addActionListener(new MyActionListener(b7,this));
		DigitButton b8 = new DigitButton(8);
		b8.addActionListener(new MyActionListener(b8,this));		
		DigitButton b9 = new DigitButton(9);
		b9.addActionListener(new MyActionListener(b9,this));
		panelSouth.add(b7);
		panelSouth.add(b8);
		panelSouth.add(b9);
		OperatorButton plus = new OperatorButton(TypeOperator.PLUS);
		plus.addActionListener(new MyActionListener(plus, this));
		panelSouth.add(plus);
		
		DigitButton b4 = new DigitButton(4);
		b4.addActionListener(new MyActionListener(b4,this));
		DigitButton b5 = new DigitButton(5);
		b5.addActionListener(new MyActionListener(b5,this));		
		DigitButton b6 = new DigitButton(6);
		b6.addActionListener(new MyActionListener(b6,this));
		panelSouth.add(b4);
		panelSouth.add(b5);
		panelSouth.add(b6);
		OperatorButton moins = new OperatorButton(TypeOperator.MOINS);
		moins.addActionListener(new MyActionListener(moins, this));
		panelSouth.add(moins);
		
		DigitButton b1 = new DigitButton(1);
		b1.addActionListener(new MyActionListener(b1,this));
		DigitButton b2 = new DigitButton(2);
		b2.addActionListener(new MyActionListener(b2,this));		
		DigitButton b3 = new DigitButton(3);
		b3.addActionListener(new MyActionListener(b3,this));
		panelSouth.add(b1);
		panelSouth.add(b2);
		panelSouth.add(b3);
		OperatorButton fois = new OperatorButton(TypeOperator.FOIS);
		fois.addActionListener(new MyActionListener(fois, this));
		panelSouth.add(fois);
		
		DigitButton b0 = new DigitButton(0);
		b0.addActionListener(new MyActionListener(b0,this));
		panelSouth.add(b0);
		OperatorButton point = new OperatorButton(TypeOperator.POINT);
		point.addActionListener(new MyActionListener(point, this));
		panelSouth.add(point);
		OperatorButton egal = new OperatorButton(TypeOperator.EGAL);
		egal.addActionListener(new MyActionListener(egal, this));
		OperatorButton diviser = new OperatorButton(TypeOperator.DIVISER);
		diviser.addActionListener(new MyActionListener(diviser, this));
		panelSouth.add(egal);
		panelSouth.add(diviser);
		
		container.add(panelNorth, BorderLayout.NORTH);
		container.add(panelSouth, BorderLayout.CENTER);
		this.setContentPane(container);
		
	}
	
	public void run() {
		this.setVisible(true);
	}

	@Override
	public void addObserver(MyObserver obs) {
		listObservateur.add(obs);
	}

	@Override
	public void delObserver() {
		listObservateur = new ArrayList<MyObserver>();	
	}

	@Override
	public void updateObserver() {
		for(MyObserver obs : listObservateur)
			obs.update(terminal);
	}

	public void writeOnTerminal(MyButton button) {
		if(button instanceof DigitButton ) {
			printButton(button);
		} else
		if(button instanceof OperatorButton) {
			switch(((OperatorButton) button).getOperator()) {
				case RESET :
					//calculator = new Calculator();
					currentEpr = "0";
					break;
				case PARENTHESEOUVRE :
					printButton(button);
					break;
				case PARENTHESEFERME :
					currentEpr = terminal.getText().trim();
					if(canICloseParenthese(currentEpr)) {
						printButton(button);
					}
					break;
				case PLUS :
					currentEpr = terminal.getText().trim();
					if(!currentEpr.equals("0")) {
						printButton(button);
					}
					break;
				case MOINS :
					printButton(button);
					break;
				case FOIS :
					currentEpr = terminal.getText().trim();
					if(!currentEpr.equals("0")) {
						printButton(button);
					}
					break;
				case DIVISER :
					currentEpr = terminal.getText().trim();
					if(!currentEpr.equals("0")) {
						printButton(button);
					}
					break;
				case POINT :
					currentEpr = terminal.getText().trim();
					currentEpr+=".";
					break;
				case EGAL :
					currentEpr = terminal.getText().trim();
				try {
					currentEpr = engine.eval(currentEpr).toString();
				} catch (ScriptException e) {
					currentEpr = "error";
				}
					break;
				default:
					break;
			}
		}
		if(currentEpr.endsWith(".0")) {
			currentEpr=currentEpr.substring(0, currentEpr.length()-2);
		}
		if(currentEpr.equals("Infinity")) {
			currentEpr = "error";
		}
		terminal.setText(currentEpr+" ");
	}
	
	static void printButton(MyButton button) {
		currentEpr = terminal.getText().trim();
		if(currentEpr.equals("0")) {
			currentEpr=button.toString();
		} else {
			currentEpr+=button.toString();
		}
	}
	
	static boolean canICloseParenthese(String str) {
		int nbOpen = 0;
		int nbClose = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') {
				nbOpen++;
			}
			if(str.charAt(i)==')') {
				nbClose++;
			}
		}
		if((nbClose+1)<=nbOpen) {
			return true;
		}
		return false;
	}
}

