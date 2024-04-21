package week2homework;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Programme7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                                   //Scanner
        System.out.println("Enter temperature value in degree Fahrenheit: ");
        double f = scanner.nextDouble();
        Programme7 programme7 = new Programme7();
        programme7.convert(f);                                                      //Calling method using object
    }

    //Instance method
    public void convert(double f) {
        double c = (f - 32) * 5 / 9;
        System.out.println("Temperature in degree Celsius is " + c + "°C");

    }
}
