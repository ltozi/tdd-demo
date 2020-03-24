package com.kaleyra.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateEmailTest {

	@Test
	public void validateCorrect() {
		ValidateEmail ve = new ValidateEmail();
		ve.validate("a.b@c.d");
		ve.validate("a.b@c#d.e");
	}

	@Test(expected = IllegalArgumentException.class)
	public void validateError() {
		ValidateEmail ve = new ValidateEmail();
		ve.validate("a.#b@cd.e");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void validateError2() {
		ValidateEmail ve = new ValidateEmail();
		ve.validate("@a.d");
	}

}
