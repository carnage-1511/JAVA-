package DAY_1;
import java.util.Scanner;
public class newspaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbernumber of copies sold: ");
        int w = sc.nextInt();
        System.out.print("Enter the cost per copy: ");
        int x = sc.nextInt();
        System.out.print("Enter the manufacturing cost per copy: ");
        int y = sc.nextInt();
        int profit = ((w*x)-(w*y)-100);
        System.out.println("total profits on sunday's is: " + profit);
       
        sc.close();
    }       
    
}
