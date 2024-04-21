package week2homework;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Programme15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of variable x: ");
        int x = scanner.nextInt();
        System.out.println("Enter value of variable y: ");
        int y = scanner.nextInt();
        m3(x, y);                                                //Calling static method
    }

    public static void m3(int x, int y) {
        System.out.println("Before swapping: x = " + x + " y = " + y);
        int temp = x;                                               // Use a temporary variable to store the value of x
        x = y;                                                      // Assign the value of y to x
        y = temp;                                                   // Assign the value of the temporary variable (the original value of x) to y
        System.out.println("After swapping: x = " + x + " y = " + y);
    }
}
