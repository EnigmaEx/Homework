package lesson;

public class Lesson_5 {

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple"); /*1 задание*/
    }

    public static void checkSumSign() {
        int a = 2, b = 4;
        System.out.println((a + b) >= 0 ? "Сумма положительная" : "Сумма отрицательная"); /*2 задание*/
    }

    public static void printColor() {
        int value = 56;
        System.out.println(value <= 0 ? "Красный" : value <= 100 ? "Желтый" : "Зеленый"); /*3 задание*/
    }

    public static void compareNumbers() {
        int a = 13, b = 9;
        System.out.println(a >= b ? "a >= b" : "a < b"); /*4 задание*/
    }

    public static boolean isSumInRange() {
        int a = 3, b = 17;
        return a + b >= 10 && a + b <= 20; /*5 задание*/
    }

    public static void printPositiveOrNegative() {
        int number = -3;
        System.out.println(number >= 0 ? "Число положительное" : "Число отрицательное"); /*6 задание*/
    }

    public static boolean isNegative() {
        int number = -7;
        return number < 0; /*7 задание*/
    }

    public static void printStringMultipleTimes() {
        String str = "AQA";
        int times = 4;
        for (int i = 0; i < times; i++) System.out.println(str); /*8 задание*/
    }

    public static boolean isLeapYear() {
        int year = 1754;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); /*9 задание*/
    }

    public static void invertBinaryArray() {
        int[] binaryArray = {0, 0, 1, 0, 1, 0, 1}; /*10 задание*/
        for (int i = 0; i < binaryArray.length; i++) binaryArray[i] = binaryArray[i] == 0 ? 1 : 0;
        printArray(binaryArray);
    }

    public static void fillArray() {
        int length = 100;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) array[i] = i + 1; /*11 задание*/
        printArray(array);
    }

    public static void multiplyElements() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; /*12 задание*/
        for (int i = 0; i < array.length; i++) if (array[i] < 6) array[i] *= 2;
        printArray(array);
    }

    public static void fillDiagonal() {
        int size = 3;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) matrix[i][i] = matrix[i][size - i - 1] = 1; /*13 задание*/
        printMatrix(matrix);
    }

    public static void createArray() {
        int len = 8, initialValue = 2;
        int[] array = new int[len];
        for (int i = 0; i < len; i++) array[i] = initialValue; /*14 задание*/
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i : array) System.out.print(i + " ");
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) System.out.print(elem + " ");
            System.out.println();
        }
    }
}
