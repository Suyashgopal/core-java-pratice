// Functional programming - lambda, functional interface, method reference,
// Optional, streams

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// my own functional interface
interface Calculator {
    int operation(int a, int b);
}

public class FunctionalProgramming {
    public static void main(String[] args) {

        // lambda expression implementing the interface
        Calculator addition = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Add = " + addition.operation(5, 3));
        System.out.println("Multiply = " + multiply.operation(5, 3));

        // stream operations on a list
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // filter even numbers and print
        System.out.print("Even numbers: ");
        nums.stream()
            .filter(n -> n % 2 == 0)
            .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // sum using stream
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum = " + sum);

        // map - square each number
        List<Integer> squares = nums.stream()
                .map(n -> n * n)
                .toList();
        System.out.println("Squares = " + squares);

        // method reference for printing
        List<String> names = Arrays.asList("amit", "sonu", "ravi");
        names.forEach(System.out::println);

        // Optional class - avoids null pointer
        Optional<String> opt = Optional.of("hello");
        System.out.println("Optional value = " + opt.get());
        System.out.println("Is present? " + opt.isPresent());
    }
}
