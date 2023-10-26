package Recursion.kunal.Easy;

public class L7_sumofdigit {
    public static void main(String args[]){
        System.out.println(pro(1342));
    }

    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }
    static int pro(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10)*pro(n/10);
    }
}
