package com.BridzLabs;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author BALU
 * JUnit Test case for validating the return statement
 * Validating with Multiple run cases
 */
public class MoodAnalyserTest {

	//Test case for Sad Mood
	@Test
	public void givenMessgae_WhenSad_ShouldReturn_Sad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(); //passed message to constructor
		String mood = moodAnalyser.analyseMood("I am in Sad Mood");
		Assert.assertEquals("SAD", mood);
	}
	
	//Test case for Sad Mood
	@Test
	public void givenMessage_whenNotSad_shouldReturn_Happy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(); //passed message to constructor
		String mood = moodAnalyser.analyseMood("I am in any Mood");
		Assert.assertEquals("HAPPY", mood);
	}
	
}