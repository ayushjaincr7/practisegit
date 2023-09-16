package Recursion;

public class L4_print {
// O(n)
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x * power(x,n-1);
    }
// O(log n)
    public static int optimpow(int a, int n){
        
        if(n==0){
            return 1;
        }
        // O(n)
        // int halfPowerSq = optimpow(a, n/2) * optimpow(a, n/2);
        // O(log n)
        int halfPower = optimpow(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        if(n%2 != 0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }
    
    public static void main(String args[]){
        System.out.println(power(2, 5));
        System.out.println(optimpow(2, 5));
    }
}
