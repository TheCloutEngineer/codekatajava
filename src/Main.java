//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        print2DArrays(array); // 1 2 3
                              // 4 5 6
                              // 7 8 9

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArrays(array1); // 1 2 3 4 5 6 7 8 9


    }

    private static void print2DArrays(int[][] matrix) {
        for(int i = 0; i <= matrix.length - 1; i++) {
            // Outer loop for rows
            for ( int j = 0; j <= matrix[i].length - 1; j++) {
                // Inner loop for columns
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

    private static int findFirstPrimeNumber(int[] array) {
        for (int number : array) {
            if (isPrime(number)) {
                return number;
            }
        }
        return -1;
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int findIndexOfTargetElement(int[] array, int target) {
        for (int j : array) {
            if (j == target) {
                return j;
            }
        }
        return -1;
    }

    private static void printEveryOtherElement(int[] array) {

        for (int i = 0; i < array.length; i += 2) {
            System.out.println(i);
        }
    }


    private static void printArraysBackWards(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            System.out.println(array[i]);
        }
    }

    private static void printArrays(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}