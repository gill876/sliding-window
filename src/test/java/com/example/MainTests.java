package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MainTests {

  @Test
  void testDecrementingSlidingWindow() {
    final String[] expected_string = {
        "helloworld",
        "helloworl",
        "elloworld",
        "hellowor",
        "elloworl",
        "lloworld",
        "hellowo",
        "ellowor",
        "lloworl",
        "loworld",
        "hellow",
        "ellowo",
        "llowor",
        "loworl",
        "oworld",
        "hello",
        "ellow",
        "llowo",
        "lowor",
        "oworl",
        "world",
        "hell",
        "ello",
        "llow",
        "lowo",
        "owor",
        "worl",
        "orld",
        "hel",
        "ell",
        "llo",
        "low",
        "owo",
        "wor",
        "orl",
        "rld",
        "he",
        "el",
        "ll",
        "lo",
        "ow",
        "wo",
        "or",
        "rl",
        "ld"
    };

    assertThat(Main.decrementingSlidingWindow("helloworld")).isEqualTo(expected_string);
  }
}
