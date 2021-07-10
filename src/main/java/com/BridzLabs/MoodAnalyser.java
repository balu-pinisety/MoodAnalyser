package com.BridzLabs;

/**
 * @author BALU
 * Program to Handle custom Exceptions by Mood Analyzer Problem
 */
public class MoodAnalyser {
	
	private String message;

	/**
	 * Default Constructor without parameter
	 */
	public MoodAnalyser() {
		
	}
	
	/**
	 * Constructor for the class with parameter
	 * @param message
	 */
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	/**
	 * Ability to check the given string in the given message
	 * @return HAPPY or SAD
	 */
	public String analyseMood() {
		if (message==null) return null;
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
	
}