package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var reader = new Scanner(System.in);
        System.out.println("How old are you:");
        var age = reader.nextFloat();
        var dogYears = age*7;
        System.out.println("wow you are "+age + " That is " + dogYears+ " in dog years");
    }
}

