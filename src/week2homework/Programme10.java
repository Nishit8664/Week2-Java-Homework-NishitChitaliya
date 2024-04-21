package week2homework;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its multiplication table up to 10.
 */
public class Programme10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        Programme10 programme10 = new Programme10();
        programme10.m1(num);                            //Calling m1 method using object
    }

    //Instance method
    public void m1(int num) {
        for (int i = 1; i <= 10; i++) {                 //For loop to print 10 statements
            System.out.println(num + " * " + i + " = " + num * i);
        }

    }
}