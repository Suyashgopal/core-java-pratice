// Control flow statements - if else, switch, break, continue
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // if else if ladder for grade
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // switch case for day of week
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6:
            case 7: System.out.println("Weekend!"); break;
            default: System.out.println("invalid day");
        }

        // break and continue example
        // this loop prints numbers but skips 3 and stops at 8
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;   // skip printing 3
            }
            if (i == 8) {
                break;   // stop the loop here
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
