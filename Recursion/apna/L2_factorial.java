package Recursion.apna;

public class L2_factorial {

    // Factorial
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        // int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    // Time: O(n) 
    // space : O(n)
// ***********************************************
    // sum of first n natural numbers

    public static int sumN(int n){
        if(n==1){
            return 1;
        }
        return n+ sumN(n-1);
    }



    public static void main(String args[]){

        int n=5;
        System.out.println(fact(n));
        System.out.println(sumN(n));

    }
}
