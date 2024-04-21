package week2homework;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Programme18 {
    public static void main(String[] args) {
        calculation();
    }

    public static void calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        int add = a + b;                            //Addition of two numbers
        int sub = a - b;                            //Substraction of two numbers
        int mul = a * b;                            //Multiplication of two numbers
        int div = a / b;                            //Division of two numbers
        int mod = a % b;                            //Remainder of two numbers
        System.out.println("  ");
        System.out.println(+a + " + " + b + " = " + add);
        System.out.println(+a + " - " + b + " = " + sub);
        System.out.println(+a + " * " + b + " = " + mul);
        System.out.println(+a + " / " + b + " = " + div);
        System.out.println(+a + " % " + b + " = " + mod);


    }
}
