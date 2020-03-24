package com.kaleyra.tdd;

import org.hamcrest.core.AnyOf;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.internal.matchers.Any;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ApplicationTest {


    @BeforeClass
    public static void setupOnceAtStartup() {
        System.out.println("Execute this only once...");
    }

    @Before
    public void setupBeforeEach() {
        System.out.println("Beftore each test...");
    }

    @After
    public void teardownAfterEach() {
        System.out.println("After each test...");
    }

    @After
    public void settingNullCriticalObject() {
        System.out.println("Setting null that");
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

    @Test
    public void shouldReturnEmptyUserIfUserNotFound() throws Exception {
        //        Arrange: The data used in a test should not depend on the environment in which the test is running. All the data needed for a test should be arranged as part of the test.
        Application application = new Application();

        //        Act: Invoke the actual method under test.
        User emptyUser = application.queryForUser(null);

        //        Assert: A test method should test for a single logical outcome, implying that typically there
        //        should be only a single logical assert. A logical assert could have multiple physical asserts as
        //        long as all the asserts test the state of a single object. In a few cases, an action can update
        //        multiple objects.
        assertNotNull(emptyUser);
    }

    @Test
    public void shouldReturnUserWhenNameIsProvided() throws Exception {
        //Arrange: The data used in a test should not depend on the environment in which the test is running. All the data needed for a test should be arranged as part of the test.
        DBservice mockDbService = mock(DBservice.class);

        User user = new User();
        user.setAge(35);

        when(mockDbService.load(anyString())).thenReturn(user);

        Application application = new Application(mockDbService);

        //        Act: Invoke the actual method under test.
        User emptyUser = application.queryForUser("luigi");

        //Assert
        assertNotNull(emptyUser);
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenAgeLowerThanLimit() throws Exception {
        //Arrange: The data used in a test should not depend on the environment in which the test is running. All the data needed for a test should be arranged as part of the test.
        DBservice mockDbService = mock(DBservice.class);
        User user = new User();
        user.setAge(8);

        when(mockDbService.load(anyString())).thenReturn(user);

        Application application = new Application(mockDbService);

        //        Act: Invoke the actual method under test.
        User emptyUser = application.queryForUser("luigi");

        //Assert
        assertNotNull(emptyUser);
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenAgeHigherThanLimit() throws Exception {
        //Arrange: The data used in a test should not depend on the environment in which the test is running. All the data needed for a test should be arranged as part of the test.
        DBservice mockDbService = mock(DBservice.class);
        User user = new User();
        user.setAge(144);

        when(mockDbService.load(anyString())).thenReturn(user);

        Application application = new Application(mockDbService);

        //        Act: Invoke the actual method under test.
        User emptyUser = application.queryForUser("Daniele");

        //Assert
        assertNotNull(emptyUser);
    }
}