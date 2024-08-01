package org.example;

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int number = 5;
        System.out.printf("Factorial %d = %d%n", number, factorial.getFactorial(number));
    }
}