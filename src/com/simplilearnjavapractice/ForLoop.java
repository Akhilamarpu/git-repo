package com.simplilearnjavapractice;

public class ForLoop {
	public static void main(String[] args) {
        // Example 1: Simple for loop to print numbers from 1 to 5
        System.out.println("Example 1: Printing numbers from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // To move to the next line

        // Example 2: Using for loop to iterate through an array
        System.out.println("\nExample 2: Iterating through an array");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // To move to the next line

        // Example 3: Nested for loop to print a pattern
        System.out.println("\nExample 3: Nested for loop for a pattern");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


