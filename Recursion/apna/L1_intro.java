package Recursion.apna;
// using math
// f(x) = x^2
// f(f(x)) = x^2^2

// f(n) =  n * f(n-1)
//             |
//             ^ (n-1) * f(n-2)
// smaller instances of the same problem
// base case -> finally case

// flow
// 2 directions -> 1 Top To Down(towards Base Case)
//              -> 2 combine soln
public class L1_intro {
    // print decressing order
    public static void drec(int n){
        
        if(n==1){
            System.out.println(n);
            return;
        }
        
        System.out.println(n);
        drec(n-1);

        // Stack OverFlow
        // 1 parameter mem increased
        // too many cells
        // base cells

    }
    // print incressing order
    public static void incr(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        incr(n-1);
        System.out.println(n);
    }

    public static void main(String args[]){
        int n = 10;
        // drec(n);
        incr(n);
    }
}
