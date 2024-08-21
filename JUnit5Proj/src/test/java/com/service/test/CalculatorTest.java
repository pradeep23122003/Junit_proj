package com.service.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.service.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int actualResult = calc.add(10, 5);
		int expectedResult = 15;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		int actualResult = calc.multiply(10, 5);
		int expectedResult = 50;
		assertEquals(expectedResult, actualResult);
	}

}
