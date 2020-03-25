package com.kaleyra.tdd;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;

public class RangeValidatorTest {
	static Random r = new Random();

	@Test
	public void rangeIsOk() {
		// Arrange
		RangeValidator rv = new RangeValidator(5, 20);

		// Act
		rv.validate(10);

		// Assert (it is correct!)
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldGiveErrorWhenMaxExceeded() {
		// Arrange
		RangeValidator rv = new RangeValidator(5, 20);

		// Act
		rv.validate(21);

		// Assert (it is correct!)
	}

	@Test
	public void validationOkBecauseMaxInclusive() {
		// Arrange
		RangeValidator rv = new RangeValidator(5, 20);

		// Act
		rv.validate(20);

		// Assert (it is correct!)
	}

	@Test
	public void validationOkBecauseMinInclusive() {
		// Arrange
		RangeValidator rv = new RangeValidator(5, 20);

		// Act
		rv.validate(5);

		// Assert (it is correct!)
	}

	@Test
	@Ignore //TODO see Junit best practice for providing multiple test data do a test case
	public void shouldValidateRangeCorrectly() {
		// Arrange

		for (int i = 0; i < 500; i++) {
			RangeValidator rv = new RangeValidator(i, i + 20);
			// Act
			rv.validate(i + r.nextInt(20));
		}
		// Assert (it is correct!)
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldValidateRangeError() {
		// Arrange
		RangeValidator rv = new RangeValidator(0, 400);
		// Act
		if (r.nextBoolean())
			rv.validate(-r.nextInt(400));
		else
			rv.validate(400 + r.nextInt(400));
		// Assert (it is correct!)
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldGiveErrorWhenValidatorHasExclusiveMax() {
		// Arrange
		RangeValidator rv = new RangeValidator(5, 20, false, false);

		// Act
		rv.validate(20);

		// Assert (it is correct!)
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldGiveErrorWhenValidatorHasExclusiveMin() {
		// Arrange
		RangeValidator rv = new RangeValidator(5, 20, false, false);

		// Act
		rv.validate(5);

		// Assert (it is correct!)
	}

}
