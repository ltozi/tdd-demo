package com.kaleyra.tdd;

import java.lang.*;

public class RangeValidator implements Validator<Integer> {

	private Integer min;
	private Integer max;

	public RangeValidator(Integer min, Integer max) {
		this.min = min;
		this.max = max;
	}

	@Override
	public void validate(Integer arg) throws IllegalArgumentException {
		 if (arg < min) throw new IllegalArgumentException("too low value");

		 if (arg > max) throw new IllegalArgumentException("too high value");
		
	}
}
