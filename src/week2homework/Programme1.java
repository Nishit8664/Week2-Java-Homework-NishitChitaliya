package week2homework;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

// Two instance variables
public class Programme1 {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        Programme1 programme1 = new Programme1();
        programme1.m1();
    }

    //Instance method
    public void m1() {
        Programme1 programme1 = new Programme1();
        System.out.println(programme1.a + programme1.b);
    }
}
