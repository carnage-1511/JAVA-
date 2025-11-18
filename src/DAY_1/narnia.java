package DAY_1;
import java.util.Scanner;
public class narnia {
 public static void main(String[] args) {
    System.err.println("Welcome to Narnia");
    Scanner sc =new Scanner(System.in);
    System.out.print("enter your number:");
    int a=sc.nextInt();
    int b,c,d;
    int sum;
    b=a/10;
    c=b*10;
    d=a-c;
    sum=b+d;
    System.out.println("The Magical number is:"+sum);
    sc.close();
 
 }   
}