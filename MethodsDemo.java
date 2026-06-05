// Methods in java - defining, calling, parameters, return types, recursion

public class MethodsDemo {

    // method with no return, just prints
    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    // method that returns sum of two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // method to check even - returns boolean
    static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // recursion - factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   // base case
        }
        return n * factorial(n - 1);   // calls itself
    }

    public static void main(String[] args) {
        greet("Cognizant");

        int s = add(10, 20);
        System.out.println("Sum = " + s);

        System.out.println("Is 7 even? " + isEven(7));
        System.out.println("Is 8 even? " + isEven(8));

        // factorial using recursion
        System.out.println("Factorial of 5 = " + factorial(5));
    }
}
