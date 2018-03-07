package com.xck.controller;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().getClass().getClassLoader().getResource("com/xck/controller"));
    }
}
