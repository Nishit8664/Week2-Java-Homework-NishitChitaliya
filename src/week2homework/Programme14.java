package week2homework;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data: Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme14 {
    public static void main(String[] args) {
        Programme14 programme14 = new Programme14();
        programme14.ans();                              //Calling instance method using object
    }

    //Instance method
    public void ans() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height rectangle: ");
        double height = scanner.nextDouble();
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
    }
}
