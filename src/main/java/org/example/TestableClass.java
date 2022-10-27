package org.example;

public class TestableClass {
  public int getValue(int i) {
    if (i == Integer.MAX_VALUE)
      throw new IllegalArgumentException("int too big");
    else
      return i + 1;
  }
}
