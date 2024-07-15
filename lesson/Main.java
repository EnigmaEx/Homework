package Lesson_5;

import static Lesson_5.Lesson_5.*;

public class Main {

    public static void main(String[] args) {
        printThreeWords(); /*1 задание*/
        checkSumSign(-8, 6); /*2 задание*/
        printColor(89); /*3 задание*/
        compareNumbers(13, 9); /*4 задание*/
        System.out.println(isSumInRange(3, 17)); /*5 задание*/
        printPositiveOrNegative(-3); /*6 задание*/
        System.out.println(isNegative(-13)); /*7 задание*/
        printStringMultipleTimes("Aston", 2); /*8 задание*/
        System.out.println(isLeapYear(1985)); /*9 задание*/

        int[] binaryArray = {1, 0, 1, 0, 1, 1, 1}; /*10 задание*/
        invertBinaryArray(binaryArray);
        printArray(binaryArray);

        int[] hundredArray = fillArray(100); /*11 задание*/
        printArray(hundredArray);

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; /*12 задание*/
        multiplyElements(array);
        printArray(array);

        int[][] matrix = fillDiagonal(3); /*13 задание*/
        printMatrix(matrix);

        int[] filledArray = createArray(8, 2); /*14 задание*/
        printArray(filledArray);
    }
}