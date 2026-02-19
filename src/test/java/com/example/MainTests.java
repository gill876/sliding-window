package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTests {

  @Test
  @DisplayName("1 + 1 = 2")
  void slideThroughShortWord() {
    assertEquals(2, Main.decrementingSlidingWindow("hello"), "1 + 1 should equal 2");
  }
}
