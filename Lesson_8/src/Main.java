public class Main {
    public static void main(String[] args) {
        String[][] array1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] array2 = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"10", "11", "12"}
        };

        String[][] array3 = {
                {"1", "2", "3", "4"},
                {"5", "6", "X", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = processArray(array1);
            System.out.println("Сумма элементов массива 1: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            int result = processArray(array2);
            System.out.println("Сумма элементов массива 2: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            int result = processArray(array3);
            System.out.println("Сумма элементов массива 3: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4.");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Массив должен быть размером 4x4.");
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в данных массива", i, j);
                }
            }
        }

        return sum;
    }
}
