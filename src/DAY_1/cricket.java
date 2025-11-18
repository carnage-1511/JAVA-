package DAY_1;

import java.util.Scanner;

public class cricket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth of the ground: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println("Area of carpet is: " + area);
        System.out.println("Length of the rope is: " + perimeter);
        sc.close();
    }
}
