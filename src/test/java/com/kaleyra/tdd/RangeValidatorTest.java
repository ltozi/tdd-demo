package com.kaleyra.tdd;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class RangeValidatorTest {
	static Random r = new Random();

	@Test
	public void shouldValidateRangeCorrectly() {
		// Arrange
		
		for (int i = 0; i<500; i++) {
		RangeValidator rv = new RangeValidator(i, i+20);
		// Act
		rv.validate(i +  r.nextInt(20));
		}
		// Assert (it is correct!)
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldValidateRangeError() {
		// Arrange
		RangeValidator rv = new RangeValidator(0, 400);
		// Act
		rv.validate(- r.nextInt(400));
		// Assert (it is correct!)
	}

}
