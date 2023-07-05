package de.alexmerkel.java;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class CalcClassModel implements CalcModelInterface {
	PropertyChangeSupport support = new PropertyChangeSupport(this);
	String value ="";

	public void setValue(String value) {
		String old = value;
		this.value+=value;
		support.firePropertyChange("value", old, this.value);
	}
	public String getValue() {
		return value;	
	}
	@Override
	public void addValues() {
		int indexOfPlus = this.value.indexOf("+");
		this.value = this.value.replace(',', '.');
		double val1=0.0, val2=0.0;
		val1 = Double.valueOf(this.value.substring(0, indexOfPlus));
		val2 = Double.valueOf(this.value.substring(indexOfPlus+1));
		
		this.value = String.valueOf(val1+val2);
	}
	@Override
	public void subValues() {
		int indexOfMinus = this.value.indexOf("-");
		this.value = this.value.replace(',', '.');
		double val1=0.0, val2=0.0;
		val1 = Double.valueOf(this.value.substring(0, indexOfMinus));
		val2 = Double.valueOf(this.value.substring(indexOfMinus+1));
		
		this.value = String.valueOf(val1-val2);
	}
	@Override
	public void mulValues() {
		int indexOfMul = this.value.indexOf("*");
		this.value = this.value.replace(',', '.');
		double val1=0.0, val2=0.0;
		val1 = Double.valueOf(this.value.substring(0, indexOfMul));
		val2 = Double.valueOf(this.value.substring(indexOfMul+1));
		
		this.value = String.valueOf(val1*val2);
	}
	@Override
	public void divValues() {
		int indexOfDiv = this.value.indexOf("/");
		this.value = this.value.replace(',', '.');
		double val1=0.0, val2=0.0;
		val1 = Double.valueOf(this.value.substring(0, indexOfDiv));
		val2 = Double.valueOf(this.value.substring(indexOfDiv+1));
		
		this.value = String.valueOf(val1/val2);
	}
	
	public void addObserver(PropertyChangeListener l) {
		support.addPropertyChangeListener("value", l);
	}
	
	public void clearValue() {
		this.value = "";
	}
	@Override
	public void powValue() {
		double val1= Double.valueOf(this.value.replace(',', '.'));
		this.value = String.valueOf(Math.pow(val1, 2));
	}
	@Override
	public void sqrtValue() {
		double val1= Double.valueOf(this.value.replace(',', '.'));
		this.value = String.valueOf(Math.sqrt(val1));
	}
	@Override
	public void fractValue() {
		double val1= Double.valueOf(this.value.replace(',', '.'));
		this.value = String.valueOf(1/val1);
	}
	@Override
	public void signValue() {
		double val1= Double.valueOf(this.value.replace(',', '.'));
		this.value = String.valueOf(-1*val1);
	}
}
