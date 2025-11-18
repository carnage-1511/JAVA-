package DAY_2.ControlStatements;

import java.util.Scanner;

public class super_quiz_bee{
    public static void main(String[] args) {
        System.out.println("Welcome to the Super Quiz Bee!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the registration code:");
        int n = sc.nextInt();
        if (n < 10) {
            System.out.println("Invalid registration number");
            sc.close();
            return;
        }
        int lastDigit = n % 10; 
        while (n>=10) {
            n /= 10;
        }
        int diff=Math.abs(lastDigit - n);
        System.err.println("The difference between the first and last digit is: " + diff);
        sc.close();
    }
        
}
