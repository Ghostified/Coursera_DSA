import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
//import edu.princeton.cs.algs4.StdOut;
//import edu.princeton.cs.algs4.StdRandom;

public class HelloGoodbye {

    public static void main (String [] Args) {

        String firstName;
        String lastName;

        StdOut.println("Enter your first name");
        firstName = StdIn.readString();

        StdOut.println("Enter your second name");
        lastName = StdIn.readString();

        System.out.println("Hello " + firstName + " and " +  lastName + ".");
        System.out.println("Goodbye " + lastName + " and " + firstName + ".");
    }
}