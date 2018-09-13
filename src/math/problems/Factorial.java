package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {


    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         */
        //iteration method
        int fact = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial(iteration) of " + n + " is " + fact);

        //recursion method
        int factorial = fact(n);
        System.out.println("Factorial(recursive) of "+n+ " is " + factorial);
    }
    static int fact(int n){
        int result;
        if (n==1){
            return 1;
        }else{
            result=n*fact(n-1);
            return result;
        }

    }
}
