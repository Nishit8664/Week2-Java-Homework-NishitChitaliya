package week2homework;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Programme13 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float a = scanner.nextFloat();
        System.out.println("Enter second number: ");
        float b = scanner.nextFloat();
        System.out.println("Enter third number: ");
        float c = scanner.nextFloat();
        avg(a, b, c);                               //Calling static method
    }

    //Static method
    public static void avg(float a, float b, float c) {
        float d = (a + b + c) / 3;
        System.out.println("Average of three numbers " + a + ", " + b + " and " + c + " is " + d);
    }
}
