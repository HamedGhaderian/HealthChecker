package com.company.utils;

public class CommonUtils {

    //
    public static final String EMAIL_PATTERN = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    public static boolean isCellNumberValid(String number) {
        if (number != null && !number.isEmpty()) {
            if (number.length() == 11 && number.startsWith("09")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEmailValid(String email) {
        if (email != null && !email.isEmpty()) {
            if (email.matches(EMAIL_PATTERN)) {
                return true;
            }
        }
        return false;
    }


}
