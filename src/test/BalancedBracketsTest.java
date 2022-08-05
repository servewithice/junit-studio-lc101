package test;

import main.BalancedBrackets;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void testAStringOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testForNoBracketsWithNonEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void testOrderOfBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testForNoOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));

    }

    @Test
    public void testForNoClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testForBalancedBracketsWithCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code"));
    }

    @Test
    public void tesForOrderOfBracketsWithCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Code]Launch["));
    }

    @Test
    public void testForMultipleSetsOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void testForNestedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void testForNestedBracketsWithCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[]Code]"));
    }

    @Test(expected = NullPointerException.class)
    public void testForNull() {
        BalancedBrackets.hasBalancedBrackets(null);
        fail("Shouldn't get here, string cannot be null");
    }

}
