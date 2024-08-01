package org.example;

import org.junit.jupiter.api.*;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    private Factorial factorial;

    @BeforeAll
    static void startMsg() {
        System.out.println("Start test");
    }

    @AfterAll
    static void endMsg() {
        System.out.println("End test");
    }

    @BeforeEach
    void beforeEachTest() {
        factorial = new Factorial();
    }

    @AfterEach
    void afterEachTest() {
        factorial = null;
    }

    @Test
    void testFactorial() {
        assertAll("Factorial test",
                () -> {
                    System.out.println("Factorial 0 = " + factorial.getFactorial(0));
                    assertEquals(BigInteger.ONE, factorial.getFactorial(0), "Factorial 0");
                },
                () ->
                {
                    System.out.println("Factorial 1 = " + factorial.getFactorial(1));
                    assertEquals(BigInteger.ONE, factorial.getFactorial(1), "Factorial 1");

                },
                () -> {
                    System.out.println("Factorial 5 = " + factorial.getFactorial(5));
                    assertEquals(BigInteger.valueOf(120), factorial.getFactorial(5), "Factorial 5");
                },
                () -> {
                    System.out.println("Factorial 20 = " + factorial.getFactorial(20));
                    assertEquals(new BigInteger("2432902008176640000"), factorial.getFactorial(20), "Factorial 20");
                },
                () -> assertThrows(IllegalArgumentException.class, () -> factorial.getFactorial(-1), "Factorial -1")
        );
    }
}