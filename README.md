#JUnit 5 tool
What is Unit Testing
Unit Testing is a type of software testing where individual units of a software are tested
The purpose of unit testing is to validate that each unit of the software code performs as expected
Unit testing is done during the development phase of an application by the developers
JUnit Framework Introduction
JUnit is a free and open source Unit Testing framework for Java applications
JUnit was developed by Kent Beck and Erich Gamma
JUnit5 Annotations
@Test @ParameterizedTest @ValueSource @CsvSource @Disabled

JUnit Assertions
JUnit5 assertions are used to validate the expected output with the actual output of a test case
Assertions are static methods that we call in the test case methods to verify the expected behavior
All JUnit Jupiter assertions are present in org.junit.jupiter.Assertions class
JUnit Assertion Methods
assertEquals() and assertNotEquals()
assertTrue() and assertFalse()
assertNull() and assertNotNull()
assertThrows() Example Application
Create a Maven Project Click Next

In Catalog Select: Internal In Artifact Id Select : maven-archetype-quickstart

Click Next

Group Id : junit5 Artifact Id : JUnit5Proj package : com.service

Click Finish

Note: Change the JRE version to "1.8" in Build path

Add the following dependency in pom.xml file of JUnit5Proj

	<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>5.5.2</version>
			<scope>test</scope>
	</dependency>

	<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-params</artifactId>
			<version>5.5.2</version>
			<scope>test</scope>
	</dependency>

	<dependency>
			<groupId>org.junit.platform</groupId>
			<artifactId>junit-platform-runner</artifactId>
			<version>1.5.2</version>
			<scope>test</scope>
	</dependency>
Create a class "Calculator" in com.service package of src/main/java

Calculator.java
package com.service;

public class Calculator { public Integer add(Integer n1, Integer n2) { return n1+n2; } public Integer multiply(Integer n1, Integer n2) { return n1*n2; } }

To create JUnit test cases for Calculator class

Right click on Calculator.java -> New -> Other -> Java -> JUnit -> JUnit Test Case


package : com.service.test

Name : CalculatorTest

Click Next

Make check mark to "add()" and "multiply()" and click Finish



CalculatorTest.java
-------------------
package com.service.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.service.Calculator;
public class CalculatorTest {

@Test
public void testAdd() {
	Calculator calc = new Calculator();
	int actualResult = calc.add(10,5);
	int expectedResult = 15;
	assertEquals(expectedResult,actualResult);
}

@Test
public void testMultiply() {
	Calculator calc = new Calculator();
	int actualResult = calc.multiply(10,5);
	int expectedResult = 50;
	assertEquals(expectedResult,actualResult);
}
}

Run the test case Right click on CalculatorTest.java -> Run As -> JUnit Test
Parameterized Test using @ValueSource
PalindromeCheck.java
package com.service;

public class PalindromeCheck { public boolean isPalindrome(String str) { String reverse = ""; for(int i=str.length()-1;i>=0;i--) reverse = reverse + str.charAt(i); if (str.equals(reverse)) return true; else return false; } }

Test case for PalindromeCheck.java
PalindromeCheckTest.java
package com.service.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest; import org.junit.jupiter.params.provider.ValueSource;

import com.service.PalindromeCheck;

class PalindromeCheckTest {

@ParameterizedTest
@ValueSource(strings = {"madam","liril","radar","racecar","java"})
void testIsPalindrome(String str) {
	PalindromeCheck pc = new PalindromeCheck();
	boolean actual = pc.isPalindrome(str);
	assertTrue(actual);
}
}

Parameterized Test using @CsvSource
csv => comma separated values

EvenOrOdd.java
package com.service;

public class EvenOrOdd { public String evenOrOddNumber(Integer number) { if (number % 2 == 0) return "even"; else return "odd"; } }

EvenOrOddTest.java
package com.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest; import org.junit.jupiter.params.provider.CsvSource;

import com.service.EvenOrOdd;

class EvenOrOddTest {

@ParameterizedTest
@CsvSource(value= {"10,even","5,odd","12,even","15,odd"})//csv - comma separated values
void testEvenOrOddNumber(Integer input, String expected) {
	EvenOrOdd evenOrOdd = new EvenOrOdd();
	String actualResult = evenOrOdd.evenOrOddNumber(input);
	assertEquals(expected,actualResult);
}
}

assertThrows()
StringConvert.java
package com.service;

public class StringConvert { public static Integer convertToInt(String str) { if (str == null || str.trim().length() == 0) throw new IllegalArgumentException("Given String should not be null or empty"); return Integer.valueOf(str); } }

StringConvertTest.java
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
