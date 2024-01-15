import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

    public static void main (String[] Args) {
        String champion = " ";

        int i = 0;
        while (StdIn.isEmpty()) {
            String currentWord = StdIn.readString();
            i++;

            if (StdRandom.bernoulli(1.0/i)) {
                champion = currentWord;
            }
        }
        System.out.println("The random word is : " + champion);
    }
}
