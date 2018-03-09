
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> words = new ArrayList();
        
        boolean done = false;
        
        while (!done) {
            System.out.println("Type a word:");
            String word = reader.nextLine();
            if (words.contains(word)) {
                done = true;
                break;
            } else {
                words.add(word);
            }
        }
        
        for (String w : words) {
            System.out.println(w);
        }
        
        System.out.println("You gave the word " + words.get(words.size() - 1) + " twice.");
        
    }
}
