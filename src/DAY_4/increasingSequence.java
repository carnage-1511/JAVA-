package DAY_4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class increasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int prev = Integer.MIN_VALUE;
        System.out.println("Enter " + n + " elements of the array: ");
        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();
            if (current > prev) {
                arr.add(current);
                prev = current;
            }
        }

        System.out.println("The increasing sequence is: " + arr);
        sc.close();
    }
}
