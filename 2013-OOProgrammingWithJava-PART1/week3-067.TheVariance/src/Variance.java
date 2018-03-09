import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int item : list) {
            sum = sum + item;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double length = list.size();
        return sum(list) / length;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);
        double num = 0;
        for (double item : list) {
            num = num + Math.pow((item - avg), 2);
        }
        return num /(list.size() - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
