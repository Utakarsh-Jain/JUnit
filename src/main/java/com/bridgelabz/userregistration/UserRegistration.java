package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    // UC1: First name starts with Cap and has minimum 3 characters
    private static final String FIRST_NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";

    // UC2: Last name starts with Cap and has minimum 3 characters
    private static final String LAST_NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";

    // UC3: Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,4}){1,2}$";

    public boolean validateFirstName(String firstName) {
        if (firstName == null) {
            return false;
        }
        return Pattern.matches(FIRST_NAME_REGEX, firstName);
    }

    public boolean validateLastName(String lastName) {
        if (lastName == null) {
            return false;
        }
        return Pattern.matches(LAST_NAME_REGEX, lastName);
    }

    public boolean validateEmail(String email) {
        if (email == null) {
            return false;
        }
        return Pattern.matches(EMAIL_REGEX, email);
    }
}
