package week2homework;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Programme2 {

    //Static variables
    static int a = 5;
    static String Name = "Nishit";

    public static void main(String[] args) {
        m1();
    }

    //Static method
    public static void m1() {
        System.out.println(a * a);
        System.out.println(Name);
    }
}
