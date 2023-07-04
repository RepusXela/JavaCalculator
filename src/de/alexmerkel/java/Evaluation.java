package de.alexmerkel.java;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Evaluation {

	public static boolean evalNumber(String number) {
		Pattern p = Pattern.compile("\\d+,?\\d*");
		Matcher m = p.matcher(number);
		
		return m.matches();
	}
	
	public static boolean evalExpression(String expression) {
		Pattern p = Pattern.compile("\\d+,?\\d*[*/+-]\\d+,?\\d*");
		Matcher m = p.matcher(expression);
		
		return m.matches();
	}
	
}
