
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int big;
        if (number1 > number2) {
            big = number1;
        } else {
            big = number2;
        }
        if (number3 > big) {
            big = number3;
        }
        return big;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}