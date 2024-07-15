package Lesson_5;

public class Lesson_5 {

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple"); /*1 задание*/
    }

    public static void checkSumSign(int a, int b) {
        System.out.println((a + b) >= 0 ? "Сумма положительная" : "Сумма отрицательная"); /*2 задание*/
    }

    public static void printColor(int value) {
        System.out.println(value <= 0 ? "Красный" : value <= 100 ? "Желтый" : "Зеленый"); /*3 задание*/
    }

    public static void compareNumbers(int a, int b) {
        System.out.println(a >= b ? "a >= b" : "a < b"); /*4 задание*/
    }

    public static boolean isSumInRange(int a, int b) {
        return a + b >= 10 && a + b <= 20; /*5 задание*/
    }

    public static void printPositiveOrNegative(int number) {
        System.out.println(number >= 0 ? "Число положительное" : "Число отрицательное"); /*6 задание*/
    }

    public static boolean isNegative(int number) {
        return number < 0; /*7 задание*/
    }

    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) System.out.println(str); /*8 задание*/
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); /*9 задание*/
    }

    public static void invertBinaryArray(int[] array) {
        for (int i = 0; i < array.length; i++) array[i] = array[i] == 0 ? 1 : 0; /*10 задание*/
    }

    public static int[] fillArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) array[i] = i + 1; /*11 задание*/
        return array;
    }

    public static void multiplyElements(int[] array) {
        for (int i = 0; i < array.length; i++) if (array[i] < 6) array[i] *= 2; /*12 задание*/
    }

    public static int[][] fillDiagonal(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) matrix[i][i] = matrix[i][size - i - 1] = 1; /*13 задание*/
        return matrix;
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) array[i] = initialValue; /*14 задание*/
        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) System.out.print(i + " "); /*14 задание*/
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) System.out.print(elem + " "); /*14 задание*/
            System.out.println();
        }
    }
}
