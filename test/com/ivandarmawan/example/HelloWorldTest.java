/*
 * dzone.com/articles/introduction-to-the-unit-testing-technique-using-j
 */
package com.ivandarmawan.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ivand
 */
public class HelloWorldTest {
    
    HelloWorld helloWorldInstance;
    
    public HelloWorldTest() {
    }
    
    @Before
    public void setUp() {
        System.out.println("* HelloWorldTest: Before method setUP by Jali() by hasta");
        helloWorldInstance = new HelloWorld();
    }
    
    @After
    public void tearDown() {
        System.out.println("* HelloWorldTest: After method tearDown()");
    }

    /**
     * Test of formMessage method, of class HelloWorld.aasdasdasdasd
     */
    //hastaa ini
    @Test
    public void testFormMessage() {
        String expResult = "Hello World";
        String result = helloWorldInstance.formMessage();
        
        System.out.println("* HelloWorldTest: Test method 1 testFormMessage");
        
        assertEquals(expResult, result);
        
        //fail("The test case is a prototype.");
    }
    
}
