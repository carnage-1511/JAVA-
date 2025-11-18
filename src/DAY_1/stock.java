package DAY_1;
import java.util.Scanner;
public class stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the previos month share price: ");
        float pm = sc.nextInt();
        System.out.print("Enter the current month share price: ");
        float cm = sc.nextInt();
        float percentage=((cm-pm)*100);
        if (percentage>10){
            System.out.println("Buy");}
        else if(percentage>=5 && percentage<=10){
            System.out.println("Hold");}
        else{
            System.out.println("Sell");}
       sc.close();
    
}}
