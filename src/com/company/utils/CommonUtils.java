package com.company.utils;

public class CommonUtils {
    public static boolean isCellNumberValid(String number) {
        if (number != null && !number.isEmpty()) {
            if (number.length() == 11 && number.startsWith("09")) {
                return true;
            }
        }
        return false;
    }
}
