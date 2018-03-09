
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        
        int guessCount = 0;
        boolean guessed = false;
        
        while (guessed == false) {
            System.out.println("Guess a number:");
            int guess = Integer.parseInt(reader.nextLine());
            guessCount++;
            String total = ", guesses made: " + guessCount;
            
            if (guess > numberDrawn) {
                System.out.println("The number is lesser" + total);
            } else if (guess < numberDrawn) {
                System.out.println("The number is greater" + total);
            } else {
                guessed = true;
            }
        }
        
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
