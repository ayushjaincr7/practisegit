package Recursion.kunal.Easy;

public class L1_intro {

    public static void main(String[] args){
        print1(1);
    }

    static void print1(int n){
        if(n==5){
            System.out.println(5);
            return;
        }

        System.out.print(n+" ");
        print1(n+1);
    }
}