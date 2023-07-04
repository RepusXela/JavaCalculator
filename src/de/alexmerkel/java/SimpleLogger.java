package de.alexmerkel.java;

import java.util.logging.Logger;

public class SimpleLogger {
	
	static Logger myLogger = Logger.getAnonymousLogger()
			;
	public static void logInfo(String message) {
		myLogger.info(message);
	}
	
	public static void logInfo(double message) {
		myLogger.info(Double.toString(message));
	}
}
