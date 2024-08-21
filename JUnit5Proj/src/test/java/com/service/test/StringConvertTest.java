package com.service.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.service.StringConvert;

class StringConvertTest {

	@Test
	void testConvertToInt() {
		String str = null;
		assertThrows(IllegalArgumentException.class, () -> StringConvert.convertToInt(str));
	}
}
