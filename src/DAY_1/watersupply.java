package DAY_1;
import java.util.Scanner;
public class watersupply {
public static void main(String[] args) {
    System.out.println("enter the amount of water consumed in litres:");
    Scanner sc=new Scanner(System.in);
    int litres=sc.nextInt();
    int bill;
    if (litres<=100){
        bill= litres*2 ;
    }
    else if (litres>100 && litres<=500){
        bill=(int)((100*2)+(litres-100)*1.5);
    }
    else{
        bill=(int) ((100 * 2)+(400 * 1.5)+((litres-500)*1));
    }
    System.out.println("the total water bill is:"+bill);
    sc.close();
}    
}
