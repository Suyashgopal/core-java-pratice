// Exception handling - try catch finally, and custom exception

import java.util.Scanner;

// custom exception class
class AgeNotValidException extends Exception {
    public AgeNotValidException(String msg) {
        super(msg);
    }
}

public class ExceptionHandling {

    // method that throws our custom exception
    static void checkAge(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age must be 18 or above");
        }
        System.out.println("Age is valid, you can register");
    }

    public static void main(String[] args) {

        // try catch for arithmetic exception
        try {
            int a = 10;
            int b = 0;
            int c = a / b;   // this will throw exception
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Error: cant divide by zero");
        } finally {
            System.out.println("finally block always runs");
        }

        // array index out of bounds
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);   // index 5 doesnt exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: array index out of range");
        }

        // using custom exception
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (AgeNotValidException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
