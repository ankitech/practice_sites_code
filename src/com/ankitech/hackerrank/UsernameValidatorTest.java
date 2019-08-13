package com.ankitech.hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsernameValidatorTest {

    @Test
    public void validateStartwithNumber() {
        assertFalse(UsernameValidator.validate("1Samantha"));
    }

    @Test
    public void validateLessThan8() {
        assertFalse(UsernameValidator.validate("Julia"));
    }

    @Test
    public void validateMoreThan30() {
        assertFalse(UsernameValidator.validate("gftien7465dfhtenfkmerfgbfkerfhncvkfekdgfjk5865df7df6"));
    }

    @Test
    public void validateStartWithUnderscore() {
        assertFalse(UsernameValidator.validate("_Julia007"));
    }

    @Test
    public void validateSpecialCharacter() {
        assertFalse(UsernameValidator.validate("Julia@007"));
    }

    @Test
    public void validatePositiveUsernames() {
        assertTrue(UsernameValidator.validate("Samantha"));
        assertTrue(UsernameValidator.validate("Samantha_21"));
        assertTrue(UsernameValidator.validate("JuliaZ007"));
    }
}