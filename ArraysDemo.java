// Arrays - 1D and 2D arrays
public class ArraysDemo {
    public static void main(String[] args) {

        // one dimensional array
        int[] numbers = {45, 12, 78, 3, 99, 23};

        // print all using for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // find the largest number
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number is " + max);

        // sum of all using enhanced for loop
        int total = 0;
        for (int x : numbers) {
            total += x;
        }
        System.out.println("Sum of array = " + total);

        // two dimensional array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
