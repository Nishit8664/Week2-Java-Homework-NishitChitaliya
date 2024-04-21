package week2homework;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                           //Scanner
        System.out.println("Enter your full name in upper case: ");
        String upperCase = scanner.nextLine();
        convert(upperCase);                                                 //Calling convert method
    }

    //Static method
    public static void convert(String upperCase) {
        String lowerCase = upperCase.toLowerCase();                         //Converting to lower case
        System.out.println("Your name in lower case: " + lowerCase);
    }
}
