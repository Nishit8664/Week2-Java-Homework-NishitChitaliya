package week2homework;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base length of triangle:  ");
        double b = scanner.nextDouble();
        System.out.println("Enter height of triangle:  ");
        double h = scanner.nextDouble();
        area(b, h);                                                 //Calling static method area
    }

    //Static method
    public static void area(double b, double h) {
        double a = (b * h) / 2;
        System.out.println("Area of triangle is " + a);

    }
}
