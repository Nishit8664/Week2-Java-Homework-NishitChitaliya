package week2homework;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme
 */
public class Programme4 {
    //Two static variables
    static int a = 10;
    static int b = 1;

    //Two instance variables
    String name = "Nishit ";
    String surname = "Chitaliya";

    public static void main(String[] args) {
        Programme4 programme4 = new Programme4();
        m1();
        programme4.m2();
    }

    //Static method
    public static void m1() {
        Programme4 programme4 = new Programme4();
        System.out.println(a - b);
        System.out.print(programme4.name);
        System.out.println(programme4.surname);

    }

    //Instance method
    public void m2() {
        System.out.println(Programme4.a - Programme4.b);

        //Calling instance variables into instance method without object
        System.out.print(name);
        System.out.print(surname);

    }
}
