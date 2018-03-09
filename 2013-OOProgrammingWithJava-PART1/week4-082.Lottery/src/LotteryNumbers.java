import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();
        // Write the number drawing here using the method containsNumber()
        for (int i = 0; i < 7; i++) {
            boolean contains = true;
            while (contains) {
                int potential = random.nextInt(39) + 1;
                if (!this.containsNumber(potential)) {
                    this.numbers.add(potential);
                    contains = false;
                }
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
