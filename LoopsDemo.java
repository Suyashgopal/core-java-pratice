// Loops in java - for, while, do-while
public class LoopsDemo {
    public static void main(String[] args) {

        // for loop - multiplication table of 5
        System.out.println("Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // while loop - sum of numbers from 1 to 10
        int n = 1;
        int sum = 0;
        while (n <= 10) {
            sum = sum + n;
            n++;
        }
        System.out.println("Sum 1 to 10 = " + sum);

        // do while - runs atleast once
        int count = 100;
        do {
            System.out.println("this runs even though count is big, count=" + count);
        } while (count < 5);

        // nested loop to print a star pattern
        // pattern of stars going up
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
