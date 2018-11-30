/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivandarmawan.example;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author BPS
 */
public class Greet {

    private String hello;
    private String name;

    /**
     * Constructor
     */
    Greet() {
        setHello("Hello");
    }

    /**
     * forms the Hello World Message.
     *
     * @return
     */
    public String formMessage() {
        Scanner keyboard = new Scanner(System.in);
        String message;
        System.out.print("Whats your name: ");
        setName(keyboard.next());
        message = hello + " " + getName();
        return message;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
