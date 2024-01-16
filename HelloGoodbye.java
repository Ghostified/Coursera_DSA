

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.lang.*;

public class HelloGoodbye {

    public static void main (String [] Args) {

        String firstName;
        String lastName;
// javac-algs4 and java-algs4
        // javac -cp path/to/algs4.jar YourJavaFile.java
        // "C:\Users\allan.branson\Downloads\algs4.jar"
        // javac HelloWorld.java
        // javac -cp C:\Users\allan.branson\Downloads\algs4.jar HelloWorld.java

        StdOut.println("Enter your first name");
        firstName = StdIn.readString();

        StdOut.println("Enter your second name");
        lastName = StdIn.readString();

        System.out.println("Hello " + firstName + " and " +  lastName + ".");
        System.out.println("Goodbye " + lastName + " and " + firstName + ".");
    }
}