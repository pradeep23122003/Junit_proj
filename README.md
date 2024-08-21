## **JUnit 5 Tool**

## **What is Unit Testing**

Unit Testing is a type of software testing where individual units of a software are tested.  
The purpose of unit testing is to validate that each unit of the software code performs as expected.  
Unit testing is done during the development phase of an application by the developers.

## **JUnit Framework Introduction**

JUnit is a free and open-source Unit Testing framework for Java applications.  
JUnit was developed by Kent Beck and Erich Gamma.

## **JUnit 5 Annotations**

- `@Test`
- `@ParameterizedTest`
- `@ValueSource`
- `@CsvSource`
- `@Disabled`

## **JUnit Assertions**

JUnit 5 assertions are used to validate the expected output with the actual output of a test case.  
Assertions are static methods that we call in the test case methods to verify the expected behavior.  
All JUnit Jupiter assertions are present in the `org.junit.jupiter.Assertions` class.

## **JUnit Assertion Methods**

- `assertEquals()` and `assertNotEquals()`
- `assertTrue()` and `assertFalse()`
- `assertNull()` and `assertNotNull()`
- `assertThrows()`

## **Example Application**

1. **Create a Maven Project**  
   Click Next

2. **In Catalog Select:** Internal  
   In Artifact Id Select : `maven-archetype-quickstart`  
   Click Next

3. **Group Id:** junit5  
   **Artifact Id:** JUnit5Proj  
   **Package:** com.service  
   Click Finish

   Note: Change the JRE version to "1.8" in Build path

4. **Add the following dependency in `pom.xml` file of JUnit5Proj**

    ```xml
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
    ```
