package de.alexmerkel.java;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;

public class CalcController implements ActionListener, PropertyChangeListener {
	CalcClassModel model;
	CalcView view;
	State state;
	String operation;
	
	public CalcController(CalcClassModel model, CalcView view) {
		this.model = model;
		this.view = view;
		Component[] components = this.view.getButtons();		
		for (Component component : components) {
			
			if (component instanceof JButton) {
				((JButton) component).addActionListener(this);
			}
		}
		this.model.addObserver(this);
		state = State.OPERAND;
		operation = "";
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		String com = e.getActionCommand();
		if(com.equals("C")) {
			this.model.clearValue();
			this.view.setCalcOutput(this.model.getValue());
			state = State.OPERAND;
			return;
		}

		if (state == State.OPERAND) {

			if (com.matches("[0-9,]")) {
				this.model.setValue(com);
				this.view.setCalcOutput(this.model.getValue());
				SimpleLogger.logInfo("Number is valid: " + Evaluation.evalNumber(this.model.getValue()));
				SimpleLogger.logInfo(e.getActionCommand());
			} else if(com.matches("pow")) {
				this.model.powValue();
				this.view.setCalcOutput(this.model.getValue());				
				return;
			}else if(com.matches("sqrt")) {
				this.model.sqrtValue();
				this.view.setCalcOutput(this.model.getValue());				
				return;
			}else if(com.matches("[*/+-]")) {
				this.operation = com;
				this.model.setValue(com);
				this.view.setCalcOutput(this.model.getValue());
				state = State.OPERAND2;
			}

		} else if(state == State.OPERAND2) {
			if (com.matches("[0-9,]")) {
				this.model.setValue(com);
				this.view.setCalcOutput(this.model.getValue());
				SimpleLogger.logInfo("Number is valid: " + Evaluation.evalNumber(this.model.getValue()));
				SimpleLogger.logInfo(e.getActionCommand());
			}else if(com.matches("[=]")) {
				switch(this.operation) {
				case "+":
					this.model.addValues();
					this.view.setCalcOutput(this.model.getValue());				
					state = State.OPERAND;
					break;
				case "-":
					this.model.subValues();
					this.view.setCalcOutput(this.model.getValue());				
					state = State.OPERAND;
					break;
				case "*":
					this.model.mulValues();
					this.view.setCalcOutput(this.model.getValue());				
					state = State.OPERAND;
					break;
				case "/":
					this.model.divValues();
					this.view.setCalcOutput(this.model.getValue());				
					state = State.OPERAND;
					break;

				}
				

			}
			//**++ maybe to implement
		}

		
		switch (com) {
		case "C":
			
			break;
		case "MC":
			break;
		case "MR":
			break;
		case "M+":
			break;
		case "M-":
			break;
		case "%":
			break;
		case "CE":
			break;
		case "<--":
			break;
		case "1/x":
			break;
		case "x^2":
			break;
		case "sqrt":
			break;
		case "/":
			break;
		case "7":
			break;
		case "8":
			break;
		case "9":
			break;
		case "4":
			break;
		case "5":
			break;
		case "6":
			break;
		case "-":
			break;
		case "*":
			break;
		case "+":
			break;
		case "1":
			break;
		case "2":
			break;
		case "3":
			break;
		case "+/<":
			break;
		case "0":
			break;
		case ",":
			break;
		case "=":
			break;
		default:
			break;
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		
		//testing
		SimpleLogger.logInfo(evt.getPropertyName());
	}

}
