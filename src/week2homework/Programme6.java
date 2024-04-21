package week2homework;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.
 * (Formula of Area A=PI*r*r).
 */
public class Programme6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);               //Scanner
        System.out.println("Enter radius of circle: ");
        float r = scanner.nextFloat();
        double PI = 3.14;
        area(PI, r);                                             //Calling area method
    }

    public static void area(double PI, float r) {
        double a = PI * r * r;
        System.out.println("Area of circle having radius " + r + " is " + a);

    }
}
