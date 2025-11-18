package DAY_4;

import java.util.Scanner;

public class reverse {
    public reverse(char[] str, int start,int end){
        while (start<end){
            char temp= str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = sc.next();

        char[] str = input.toCharArray();


        int len = str.length;
        int mid = len / 2;

        // Reverse the first half, then the second half
        reverse(str, 0, mid - 1);
        reverse(str, mid, len - 1);
        String result = new String(str);

        System.out.println("the first reverse: " + result);
        sc.close();
        

    }
    private static void reverse(char[] str, int mid, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    }
    
}
