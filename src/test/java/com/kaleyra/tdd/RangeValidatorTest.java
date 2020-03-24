package com.kaleyra.tdd;

import org.junit.Test;
import com.kaleyra.tdd.RangeValidator;

import static org.junit.Assert.*;

public class RangeValidatorTest {
    @Test
    public void shouldGiveErrorWhenEmpty() {
        //Arrange
        RangeValidatorTest emptyTest = new RangeValidatorTest();
        //Act
        assertNotEquals(emptyTest, "");
        //Assert
    }

    @Test
    public void shouldGiveErrorWhenNull() {
        //Arrange
        RangeValidatorTest nullTest = new RangeValidatorTest();
        //Act
        assertNotNull(nullTest);

        //Assert
    }

    @Test
    public void shouldBeBelowMax() {
        //Arrange
        RangeValidatorTest maxRangeTest = new RangeValidatorTest();
        //Act

        //Assert
    }

    @Test
    public void shouldBeAboveMin() {
        //Arrange
        RangeValidatorTest minRangeTest = new RangeValidatorTest();
        //Act

        //Assert
    }
}
