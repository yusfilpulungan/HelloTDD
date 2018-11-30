/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivandarmawan.example;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author BPS
 */
public class GreetTest {

    Greet greetInstance;

    public GreetTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.out.println("* GreetTest: Before method setUP()");
        greetInstance = new Greet();
    }

    @After
    public void tearDown() {
        System.out.println("* GreetTest: Method after tearDown()");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testFormMessage() {
        String expResult = "Hello Yusfil";
        String input = "Yusfil";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Scanner keyboard = new Scanner(System.in);

        String result = greetInstance.formMessage();

        System.out.println("* HelloWorldTest: Test method 1 testFormMessage");

        assertEquals(expResult, result);

        //fail("The test case is a prototype.");
    }
}
