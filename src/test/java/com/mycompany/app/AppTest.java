package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public void testFound() {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(8, 9, 10, 11, 12, 13, 14));
        assertTrue(new App().search(array1, array2, 4, 2));
    }

    public void testNotFound() {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(8, 9, 10, 11, 12, 13, 14));
        assertFalse(new App().search(array1,array2, 5, 5));
    }

    public void testEmptyArray() {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        assertFalse(new App().search(array1,array2, 1, 3));
    }

    public void testNull() {
        assertFalse(new App().search(null, null, 4, 1));
    }
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
