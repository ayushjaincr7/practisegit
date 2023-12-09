package Bitwise.kunal;

public class L1_even_odd {
    public static void main(String[] args) {
        int n = 67;
        System.err.println(isOdd(n));
        int[] arr = {2,3,3,4,2,6,4};
        System.err.println(ans(arr));
    // magic Number
        int n=6;
        int base = 5;
        int ans = 0;
        while(n>0){
            int last = n&1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
    }
    private static boolean isOdd(int n){
        return (n&1) == 1;
    }
    // unique number
    private static int ans(int[] arr){
        int unique = 0;

        for(int n: arr){
            unique^=n;
        }
        return unique;
    }


}
