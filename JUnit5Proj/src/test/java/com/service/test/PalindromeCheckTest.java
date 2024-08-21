package com.service.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.service.PalindromeCheck;

class PalindromeCheckTest {

	@ParameterizedTest
	@ValueSource(strings = { "madam", "liril", "radar", "racecar" })
	void testIsPalindrome(String str) {
		PalindromeCheck pc = new PalindromeCheck();
		boolean actual = pc.isPalindrome(str);
		assertTrue(actual);
	}

	@ParameterizedTest
	@ValueSource(strings = { "java", "hello", "world", "example" })
	void testIsNotPalindrome(String str) {
		PalindromeCheck pc = new PalindromeCheck();
		boolean actual = pc.isPalindrome(str);
		assertFalse(actual);
	}
}
