import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        boolean done = false;
        
        while (!done) {
            System.out.println("Type a word:");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                done = true;
                break;
            } else {
                words.add(word);
            }
        }
        
        Collections.reverse(words);
        
        for (String w : words) {
            System.out.println(w);
        }
    }
}
