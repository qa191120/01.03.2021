package com.example;

import org.junit.Test; // 4.12

import static junit.framework.TestCase.assertEquals;


public class CalculatorTest {

    //@Test(expected = ArithmeticException.class)
    @Test
    public void testAdd_small_numbers() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double actual_result = calculator.add(TestData.testAdd_small_numbers_a,
                TestData.testAdd_small_numbers_b);

        // Assert
        // compare between actual result and expected result
        //double expected_result = 7;

        assertEquals(TestData.testAdd_small_numbers_expected_result, actual_result);

        assertEquals("one", "one");
    }

    // test_min_...
    // test_mul_...
    // test_div_...
}
