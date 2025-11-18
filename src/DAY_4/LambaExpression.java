package DAY_4;

public class LambaExpression {
    interface add{
        int sum(int a, int b );

    }

    public class example{
        public static void main(String[] args) {
            add addition = (a,b) -> a+b;
            int result = addition.sum(5, 10);
            System.out.println("The sum is: " + result);
        }
    }
    
}
