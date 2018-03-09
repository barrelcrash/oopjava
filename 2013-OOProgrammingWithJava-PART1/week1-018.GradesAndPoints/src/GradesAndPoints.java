
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]:");
        int number = Integer.parseInt(reader.nextLine());
        String grade;
        
        if (number >= 50) {
            grade = "5";
        } else if (number >= 45) {
            grade = "4";
        } else if (number >= 40) {
            grade = "3";
        } else if (number >= 35) {
            grade = "2";
        } else if (number >= 30) {
            grade = "1";
        } else {
            grade = "failed";
        }
        
        System.out.println("Grade: " + grade);
    }
}
