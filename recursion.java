import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //System.out.println(factorial(num));
        System.out.println(factorialrecursion(num));
    }
    public static long factorial(int num){
        long result = 1;
        for (int i = 1; i<=num;i++){
            result *= i ;
        }
        return result ;
    }

    public static long factorialrecursion(int num){
        if (num == 0){
            return 1 ;
        }
        return num*factorialrecursion(num - 1);
    }
}