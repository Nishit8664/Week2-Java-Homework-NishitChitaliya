package week2homework;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3 {

    //Static variable
    static int b = 20;

    //Instance variable
    int a = 10;

    public static void main(String[] args) {
        Programme3 programme3 = new Programme3();
        m2();
        programme3.m1();
    }

    //Static method
    public static void m2() {
        Programme3 programme3 = new Programme3();
        System.out.println(b + programme3.a);
    }

    //Instance method
    public void m1() {
        Programme3 programme3 = new Programme3();
        System.out.println(programme3.a + b);
    }
}
