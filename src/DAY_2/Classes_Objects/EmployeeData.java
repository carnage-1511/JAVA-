package DAY_2.Classes_Objects;

import java.util.Scanner;

public class EmployeeData {
    class EMP{
    private String name;
    private double salary;




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        double salary =sc.nextDouble();
        double newsalary= sc.nextDouble();
        EMP emp= new EMP();

        emp.salary=1000;
        sc.close();
    }

    }
    
}
