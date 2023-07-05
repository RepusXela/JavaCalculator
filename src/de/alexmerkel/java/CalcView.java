package de.alexmerkel.java;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField calcOutput;
	JButton mc, mr, mPlus, mMinus, ms, m;
	JButton procent, ce, c, back, oneDivX, pow;
	JButton root, divide, seven, eight, nine;
	JButton four, five, six, one, two, three;
	JButton muliply, minus, plus, plusMinus, zero;
	JButton comma, equals;
	JPanel allPanel;
	JPanel outputPanel;
	JPanel buttonPanel;
	
	public CalcView() {
		this.setTitle("Rechner");
		this.setSize(new Dimension(300, 400));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		allPanel = new JPanel();
		allPanel.setLayout(new BorderLayout());
		
		outputPanel = new JPanel(new BorderLayout());		
		calcOutput = new JTextField("0");
		calcOutput.setHorizontalAlignment(JTextField.RIGHT);
		calcOutput.setEditable(false);		
		outputPanel.add(calcOutput, BorderLayout.PAGE_START);
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0,4));
		mc = new JButton("MC");
		buttonPanel.add(mc);
		mr = new JButton("MR");
		buttonPanel.add(mr);
		mPlus = new JButton("M+");
		buttonPanel.add(mPlus);
		mMinus = new JButton("M-");
		buttonPanel.add(mMinus);
		procent = new JButton("%");
		buttonPanel.add(procent);
		ce = new JButton("CE");
		buttonPanel.add(ce);
		c = new JButton("C");
		buttonPanel.add(c);
		back = new JButton("<--");
		buttonPanel.add(back);
		oneDivX = new JButton("1/x");
		buttonPanel.add(oneDivX);
		pow = new JButton("pow");
		buttonPanel.add(pow);
		root = new JButton("sqrt");
		buttonPanel.add(root);
		divide = new JButton("/");
		buttonPanel.add(divide);
		seven = new JButton("7");
		buttonPanel.add(seven);
		eight = new JButton("8");
		buttonPanel.add(eight);
		nine = new JButton("9");
		buttonPanel.add(nine);
		muliply = new JButton("*");
		buttonPanel.add(muliply);
		four = new JButton("4");
		buttonPanel.add(four);
		five = new JButton("5");
		buttonPanel.add(five);
		six = new JButton("6");
		buttonPanel.add(six);
		minus = new JButton("-");
		buttonPanel.add(minus);
		one = new JButton("1");
		buttonPanel.add(one);
		two = new JButton("2");
		buttonPanel.add(two);
		three = new JButton("3");
		buttonPanel.add(three);
		plus = new JButton("+");
		buttonPanel.add(plus);
		plusMinus = new JButton("sign");
		buttonPanel.add(plusMinus);
		zero = new JButton("0");
		buttonPanel.add(zero);
		comma = new JButton(",");
		buttonPanel.add(comma);
		equals = new JButton("=");
		buttonPanel.add(equals);
		
		
		allPanel.add(outputPanel,BorderLayout.NORTH);
		allPanel.add(buttonPanel,BorderLayout.CENTER);
		
		
		this.setContentPane(allPanel);
		this.setVisible(true);
		
		
	}
	public JTextField getCalcOutput() {
		return calcOutput;
	}
	public JButton getMc() {
		return mc;
	}
	public JButton getMr() {
		return mr;
	}
	public JButton getmPlus() {
		return mPlus;
	}
	public JButton getmMinus() {
		return mMinus;
	}
	public JButton getMs() {
		return ms;
	}
	public JButton getM() {
		return m;
	}
	public JButton getProcent() {
		return procent;
	}
	public JButton getCe() {
		return ce;
	}
	public JButton getC() {
		return c;
	}
	public JButton getBack() {
		return back;
	}
	public JButton getOneDivX() {
		return oneDivX;
	}
	public JButton getPow() {
		return pow;
	}
	public JButton getRoot() {
		return root;
	}
	public JButton getDivide() {
		return divide;
	}
	public JButton getSeven() {
		return seven;
	}
	public JButton getEight() {
		return eight;
	}
	public JButton getNine() {
		return nine;
	}
	public JButton getFour() {
		return four;
	}
	public JButton getFive() {
		return five;
	}
	public JButton getSix() {
		return six;
	}
	public JButton getOne() {
		return one;
	}
	public JButton getTwo() {
		return two;
	}
	public JButton getThree() {
		return three;
	}
	public JButton getMuliply() {
		return muliply;
	}
	public JButton getMinus() {
		return minus;
	}
	public JButton getPlus() {
		return plus;
	}
	public JButton getPlusMinus() {
		return plusMinus;
	}
	public JButton getZero() {
		return zero;
	}
	public JButton getComma() {
		return comma;
	}
	public JButton getEquals() {
		return equals;
	}
	public void setCalcOutput(String calcOutput) {
		
		this.calcOutput.setText(calcOutput.replace('.', ','));
	}
	
	public Component[] getButtons() {
		return buttonPanel.getComponents();
	}

}
