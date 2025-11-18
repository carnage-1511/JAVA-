package DAY_1;

import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sq = n * n;
        String s = Long.toString(sq); 
        int len = s.length()
        boolean kp = false;
        for (int i = 1; i < len; i++) {
            String leftPart = s.substring(0, i);
            String rightPart = s.substring(i);

            long left = Long.parseLong(leftPart);
            long right = Long.parseLong(rightPart);
            if (left + right == n) {
                 if (left != 0 && right != 0) {
                 if (left + right == n) {
                    return true;
                }
            }
                kp = true;
                break;
            }

        
        }
        sc.close();

        

        if (kp) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean isKaprekar(int n) {
        if (n == 1) return true;          // 1 is considered Kaprekar


        // Try splitting at every possible position
        
            // Both parts must be non-zero
            if (left != 0 && right != 0) {
                if (left + right == n) {
                    return true;
                }
            }
        }
        return false;
    }
}
