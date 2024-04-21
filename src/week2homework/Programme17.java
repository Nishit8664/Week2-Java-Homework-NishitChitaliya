package week2homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 10
 */
public class Programme17 {
    public static void main(String[] args) {
        Programme17 programme17 = new Programme17();
        programme17.binary();
    }

    public void binary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String result = Integer.toBinaryString(decimal);    // Converting that resultant decimal into binary string\
        System.out.println("Binary number is: " + result);

    }

}
