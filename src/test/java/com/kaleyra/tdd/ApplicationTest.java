package com.kaleyra.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;


public class ApplicationTest {


    @BeforeClass
    public static void setupOnceAtStartup() {
        System.out.println("Execute this only once...");
    }

    @Before
    public void setupBeforeEach() {
        System.out.println("Beftore each test...");
        System.out.println("Beftore each test...");
    }

    @After
    public void teardownAfterEach() {
        System.out.println("After each test...");
    }

    @Test
    public void shouldDoIfBlock() {
//        Arrange: The data used in a test should not depend on the environment in which the test is running. All the data needed for a test should be arranged as part of the test.

//        Act: Invoke the actual method under test.


//        Assert: A test method should test for a single logical outcome, implying that typically there
//        should be only a single logical assert. A logical assert could have multiple physical asserts as
//        long as all the asserts test the state of a single object. In a few cases, an action can update
//        multiple objects.

        System.out.println("IF");
    }

    @Test
    public void shouldDoElseBlock() {
        System.out.println("ELSE");

        String s = "";

        int expected = 18;
        int valueReturnedBySomeMethod = Integer.parseInt("19");

        assertNotNull(s);

        assertTrue("Expected that age is greater than 18", expected < valueReturnedBySomeMethod);
    }


}