package com.module.buildtool;

import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        try {
            return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
        } catch (NumberFormatException exception) {
            System.out.println("Some numbers are not valid.");
            return false;
        }
    }
}
