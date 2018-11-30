/*
 * dzone.com/articles/introduction-to-the-unit-testing-technique-using-j
 */
package com.ivandarmawan.example;

import com.sun.prism.paint.Gradient;

/**
 *
 * @author ivand
 */
public class HelloTDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        HelloWorld helloWorld = new HelloWorld();
//        System.out.println(helloWorld.formMessage());
          Greet greet = new Greet();
          System.out.println(greet.formMessage());
    }
    
}
