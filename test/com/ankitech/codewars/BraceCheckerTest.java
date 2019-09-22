package com.ankitech.codewars;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BraceCheckerTest {

    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid1() {
        assertTrue(checker.isValid("()"));
    }

    @Test
    public void testValid2() {
        assertTrue(checker.isValid("(){}[]"));
    }

    @Test
    public void testValid3() {
        assertTrue(checker.isValid("([{}])"));
    }

    @Test
    public void testInvalid1() {
        assertFalse(checker.isValid("[(])"));
    }

    @Test
    public void testInvalid2() {
        assertFalse(checker.isValid("(}"));
    }

    @Test
    public void testInvalid3() {
        assertFalse(checker.isValid("[({})](]"));
    }

    @Test
    public void testInvalid5() {
        assertFalse(checker.isValid("{"));
    }

}