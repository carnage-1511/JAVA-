package DAY_1;

import java.util.Scanner;

public class MinimumTravelTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of floors in the building,v1,v2");
        int floors=sc.nextInt();
        int v1=sc.nextInt();
        int v2=sc.nextInt();
        double stairs=(Math.sqrt(2.0)*floors)/v1;
        double elevator=(floors*2.0)/v2;
        if(stairs<elevator){
            System.out.println("Stairs");
        }
        else{
            System.out.println("Elevator");
        }
        sc.close();
}
}