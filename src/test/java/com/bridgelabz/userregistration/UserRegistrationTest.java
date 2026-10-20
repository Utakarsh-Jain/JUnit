package com.bridgelabz.userregistration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    private UserRegistration userRegistration;

    @BeforeEach
    void setUp() {
        userRegistration = new UserRegistration();
    }

    @Test
    @DisplayName("UC1: Valid First Name should return true")
    void givenValidFirstName_ShouldReturnTrue() {
        assertTrue(userRegistration.validateFirstName("Utkarsh"));
    }

    @Test
    @DisplayName("UC1: First Name starting with lowercase should return false")
    void givenFirstNameWithSmallLetter_ShouldReturnFalse() {
        assertFalse(userRegistration.validateFirstName("utkarsh"));
    }

    @Test
    @DisplayName("UC1: First Name with less than 3 characters should return false")
    void givenFirstNameWithLessThanThreeChars_ShouldReturnFalse() {
        assertFalse(userRegistration.validateFirstName("Ut"));
    }

    @Test
    @DisplayName("UC1: First Name containing special characters or digits should return false")
    void givenFirstNameWithSpecialCharOrDigits_ShouldReturnFalse() {
        assertFalse(userRegistration.validateFirstName("Utk@rsh"));
        assertFalse(userRegistration.validateFirstName("Utk123"));
    }

    @Test
    @DisplayName("UC1: Null First Name should return false")
    void givenNullFirstName_ShouldReturnFalse() {
        assertFalse(userRegistration.validateFirstName(null));
    }
}
