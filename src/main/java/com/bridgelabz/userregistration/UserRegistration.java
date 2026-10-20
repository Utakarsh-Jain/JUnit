package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    // UC1: First name starts with Cap and has minimum 3 characters
    private static final String FIRST_NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";

    // UC2: Last name starts with Cap and has minimum 3 characters
    private static final String LAST_NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";

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
}
