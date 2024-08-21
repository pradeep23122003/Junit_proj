package com.service;

public class StringConvert {
	public static Integer convertToInt(String str) {
		if (str == null || str.trim().length() == 0)
			throw new IllegalArgumentException("Given String should not be null or empty");
		return Integer.valueOf(str);
	}
}
