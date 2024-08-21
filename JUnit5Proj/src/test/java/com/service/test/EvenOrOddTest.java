package com.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.service.EvenOrOdd;

class EvenOrOddTest {

	@ParameterizedTest
	@CsvSource(value = { "10,even", "5,odd", "12,even", "15,odd" }) // csv - comma separated values
	void testEvenOrOddNumber(Integer input, String expected) {
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		String actualResult = evenOrOdd.evenOrOddNumber(input);
		assertEquals(expected, actualResult);
	}

}
