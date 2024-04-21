package week2homework;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class Programme16 {
    public static void main(String args[]) {
        binary();
    }

    public static void binary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first binary number: ");
        String x = scanner.nextLine();
        System.out.println("Input second binary number: ");
        String y = scanner.nextLine();
        int num1 = Integer.parseInt(x, 2);         // converting binary string into integer(decimal number)
        int num2 = Integer.parseInt(y, 2);         // converting binary string into integer(decimal number)
        int sum = num1 + num2;                          // Adding those two decimal numbers and storing in sum
        String result = Integer.toBinaryString(sum);    // Converting that resultant decimal into binary string
        System.out.println("Sum of two binary numbers: " + result);
    }


}
