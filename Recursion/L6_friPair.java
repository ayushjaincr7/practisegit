package Recursion;

public class L6_friPair {

    public static int pairing(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        // single
        // pairing
        return pairing(n-1)+(n-1)*pairing(n-2);
    }

    public static void main(String args[]){

        System.out.println(pairing(3));
    }
}
