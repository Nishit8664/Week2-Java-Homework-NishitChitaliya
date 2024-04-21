package week2homework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * . Write a Java Program to print as below.
 * "+------------------------+"
 * "|                        |"
 * "|     CORNER STORE       |"
 * "|                        |"
 * "| 2015-03-29   04:38PM   |"
 * "|                        |"
 * "| Gallons:       10.870  |"
 * "| Price/gallon: $ 2.089  |"
 * "|                        |"
 * "| Fuel total:  $ 22.71   |"
 * "|                        |"
 * "+------------------------+"
 */
public class Programme20 {
    public static void main(String[] args) {
        fuel();
    }

    public static void fuel() {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm");
        String datetime = dateTime.format(format);
        System.out.println("Enter how much gallons fuel you take: ");
        double gallons = scanner.nextDouble();
        double price = 2.089;
        double total = gallons * price;
        System.out.println("\"+------------------------+\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"|     CORNER STORE       |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"|   " + datetime + "    |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| Gallons:       " + gallons + "   |\"");
        System.out.println("\"| Price/gallon: $ " + price + "  |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| Fuel total:  $" + total + " |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"+------------------------+\"");
    }
}
