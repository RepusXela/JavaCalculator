package de.alexmerkel.java;

public class CalcMain {

	public static void main(String[] args) {
		CalcView calcView = new CalcView();
		CalcClassModel calcModel = new CalcClassModel();
		new CalcController(calcModel, calcView);
		
	}

}
