package com.module.buildtool;

public class App {
    public static void main(String[] args) {
        boolean areNumbersPositive = Utils.isAllPositiveNumbers("12", "79");
        System.out.println(areNumbersPositive);
    }
}