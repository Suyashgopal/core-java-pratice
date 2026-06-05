// Operators and Expressions
// arithmetic, relational, logical, assignment operators

import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // arithmetic
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));   // integer division
        System.out.println("a % b = " + (a % b));    // remainder

        // relational operators
        System.out.println("a > b ? " + (a > b));
        System.out.println("a == b ? " + (a == b));

        // logical operators
        boolean res = (a > 0) && (b > 0);
        System.out.println("both positive? " + res);
        System.out.println("atleast one positive? " + ((a > 0) || (b > 0)));

        // assignment operator with shortcut
        int c = a;
        c += 10;   // same as c = c + 10
        System.out.println("c after += 10 is " + c);

        // operator precedence - multiply happens before add
        int result = a + b * 2;
        System.out.println("a + b * 2 = " + result);

        // not closing scanner, program ends anyway
    }
}
