package week2homework;

import java.util.Scanner;

/**
 * 19. Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog
 */
public class Programme19 {
    public static void main(String[] args) {
        convert();                                                 //Calling convert method
    }

    //Static method
    public static void convert() {
        Scanner scanner = new Scanner(System.in);                           //Scanner
        System.out.println("Enter any string in upper case: ");
        String upperCase = scanner.nextLine();
        String lowerCase = upperCase.toLowerCase();                         //Converting to lower case
        System.out.println("String in lower case: " + lowerCase);
    }

}
