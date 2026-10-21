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

    // --- UC 1: First Name Tests ---
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

    // --- UC 2: Last Name Tests ---
    @Test
    @DisplayName("UC2: Valid Last Name should return true")
    void givenValidLastName_ShouldReturnTrue() {
        assertTrue(userRegistration.validateLastName("Jain"));
    }

    @Test
    @DisplayName("UC2: Last Name starting with lowercase should return false")
    void givenLastNameWithSmallLetter_ShouldReturnFalse() {
        assertFalse(userRegistration.validateLastName("jain"));
    }

    @Test
    @DisplayName("UC2: Last Name with less than 3 characters should return false")
    void givenLastNameWithLessThanThreeChars_ShouldReturnFalse() {
        assertFalse(userRegistration.validateLastName("Ja"));
    }

    @Test
    @DisplayName("UC2: Last Name containing special characters or digits should return false")
    void givenLastNameWithSpecialCharOrDigits_ShouldReturnFalse() {
        assertFalse(userRegistration.validateLastName("J@in"));
        assertFalse(userRegistration.validateLastName("Jain123"));
    }

    @Test
    @DisplayName("UC2: Null Last Name should return false")
    void givenNullLastName_ShouldReturnFalse() {
        assertFalse(userRegistration.validateLastName(null));
    }

    // --- UC 3: Email Tests ---
    @Test
    @DisplayName("UC3: Valid Email (abc.xyz@bl.co.in) should return true")
    void givenValidEmail_ShouldReturnTrue() {
        assertTrue(userRegistration.validateEmail("abc.xyz@bl.co.in"));
        assertTrue(userRegistration.validateEmail("abc@bl.co"));
    }

    @Test
    @DisplayName("UC3: Email missing @ symbol should return false")
    void givenEmailWithoutAtSymbol_ShouldReturnFalse() {
        assertFalse(userRegistration.validateEmail("abc.xyzbl.co.in"));
    }

    @Test
    @DisplayName("UC3: Email missing domain or TLD should return false")
    void givenEmailWithoutDomainOrTld_ShouldReturnFalse() {
        assertFalse(userRegistration.validateEmail("abc@"));
        assertFalse(userRegistration.validateEmail("abc@bl"));
    }

    @Test
    @DisplayName("UC3: Null Email should return false")
    void givenNullEmail_ShouldReturnFalse() {
        assertFalse(userRegistration.validateEmail(null));
    }

    // --- UC 4: Mobile Number Tests ---
    @Test
    @DisplayName("UC4: Valid Mobile Number (91 9919819801) should return true")
    void givenValidMobileNumber_ShouldReturnTrue() {
        assertTrue(userRegistration.validateMobile("91 9919819801"));
    }

    @Test
    @DisplayName("UC4: Mobile Number missing space should return false")
    void givenMobileNumberWithoutSpace_ShouldReturnFalse() {
        assertFalse(userRegistration.validateMobile("919919819801"));
    }

    @Test
    @DisplayName("UC4: Mobile Number with less than 10 digits should return false")
    void givenMobileNumberWithLessThanTenDigits_ShouldReturnFalse() {
        assertFalse(userRegistration.validateMobile("91 991981980"));
    }

    @Test
    @DisplayName("UC4: Mobile Number with more than 10 digits should return false")
    void givenMobileNumberWithMoreThanTenDigits_ShouldReturnFalse() {
        assertFalse(userRegistration.validateMobile("91 99198198012"));
    }

    @Test
    @DisplayName("UC4: Null Mobile Number should return false")
    void givenNullMobileNumber_ShouldReturnFalse() {
        assertFalse(userRegistration.validateMobile(null));
    }

    // --- UC 5: Password Rule 1 (Minimum 8 Characters) ---
    @Test
    @DisplayName("UC5: Password with 8 or more characters should return true")
    void givenPasswordWithMinEightCharacters_ShouldReturnTrue() {
        assertTrue(userRegistration.validatePassword("password123"));
        assertTrue(userRegistration.validatePassword("12345678"));
    }

    @Test
    @DisplayName("UC5: Password with less than 8 characters should return false")
    void givenPasswordWithLessThanEightCharacters_ShouldReturnFalse() {
        assertFalse(userRegistration.validatePassword("pass"));
    }

    @Test
    @DisplayName("UC5: Null Password should return false")
    void givenNullPassword_ShouldReturnFalse() {
        assertFalse(userRegistration.validatePassword(null));
    }
}
