package week2homework;

import java.util.Scanner;

/**
 * 5.Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Programme5 {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        Programme5 programme5 = new Programme5();
        addition(a, b);                     //Calling addition method
        substraction(a, b);                 //Calling substraction method
        programme5.multiplication(a, b);    //Calling multipliction method using object
        programme5.division(a, b);          //Calling division method using object
    }

    //Static methods
    public static void addition(int a, int b) {
        int ans = a + b;
        System.out.println("Addition of two numbers " + a + " and " + b + " = " + ans);
    }

    public static void substraction(int a, int b) {
        int ans = a - b;
        System.out.println("Substraction of two numbers " + a + " and " + b + " = " + ans);
    }

    //Instance methods
    public void multiplication(int a, int b) {
        int ans = a * b;
        System.out.println("Multiplication of two numbers " + a + " and " + b + " = " + ans);
    }

    public void division(int a, int b) {
        double ans = a / b;
        System.out.println("Division of two numbers " + a + " and " + b + " = " + ans);
    }

}
