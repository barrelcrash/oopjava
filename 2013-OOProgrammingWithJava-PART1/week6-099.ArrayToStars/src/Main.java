
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for (int number : array) {
            String stars = "";
            for (int i = 0; i < number; i ++) {
                stars += "*";
            }
            System.out.println(stars);
        }
    }
}
