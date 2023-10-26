package Recursion.kunal.Easy;

public class L6_fac {
    public static void main(String args[]){
        System.out.println(fac(5));
    }

    static int fac(int n){
        if(n==1) return 1;
        return n * fac(n-1);
    }

    static int sum(int n){
        if(n==1)return 1;
        return n+sum(n-1);
    }
}
