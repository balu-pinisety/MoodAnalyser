package com.BridzLabs;

/**
 * @author BALU Program to Handle custom Exceptions by Mood Analyzer Problem
 */
public class MoodAnalyser {
	
	/**
	 * Ability to check the given string in the given message
	 * @param message
	 * @return HAPPY or SAD
	 */
	public String analyseMood(String message) {
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
	
}