package Lesson_5;

import java.util.Arrays;

public class Lesson_5 {

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        boolean isPositive = (-8 + 6) >= 0;
        System.out.println(isPositive ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        int value = 89;
        String color = value <= 0 ? "Красный" : (value <= 100 ? "Желтый" : "Зеленый");
        System.out.println(color);
    }

    public static void compareNumbers() {
        int a = 13;
        int b = 9;
        String comparisonResult = a >= b ? "a >= b" : "a < b";
        System.out.println(comparisonResult);
    }

    public static boolean isSumInRange() {
        int a = 3;
        int b = 5;
        return a + b >= 10 && a + b <= 20;
    }


    public static void printPositiveOrNegative() {
        int number = -13;
        String positivity = number >= 0 ? "Число положительное" : "Число отрицательное";
        System.out.println(positivity);
    }

    public static boolean isNegative() {
        int number = 7;
        return number < 0;
    }

    public static void printStringMultipleTimes() {
        int  times = 2;
        String str = "Aston";
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear() {
        int year = 1985;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); // 9 задание
    }

    public static void invertBinaryArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
    }

    public static int[] fillArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void multiplyElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static int[][] fillDiagonal(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - i - 1] = 1;
        }
        return matrix;
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
