package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class TestableClassTest {

  @ParameterizedTest
  @CsvSource(value = {"1,2", "2,3", "3,4", "4,5", "5,6", "6,7"})
  void whenGiven4Returns5(int testValue, int expectedValue) {
    //Arrange
    TestableClass testableClass = new TestableClass();

    //Act
    int actualValue = testableClass.getValue(testValue);

    //Assert
    Assertions.assertEquals(expectedValue, actualValue);
  }

}
