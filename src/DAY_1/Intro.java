package DAY_1;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter ASCII value: ");
            int ascii = scanner.nextInt();
            char character = (char) ascii;
            System.out.println( ascii + " - " + character);
        }
    }
}
