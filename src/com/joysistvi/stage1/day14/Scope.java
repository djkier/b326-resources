package com.joysistvi.stage1.day14;

public class Scope {
    public static void main(String[] args) {
        System.out.println(name);
        printName();
    }

    static String name = "Winter";

    public static void printName() {
        System.out.println(name);
    }
}
