package String;

import java.util.Scanner;

public class L2_Palindrome {

    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0; i<str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("False");
                break;
            }
        }
        
    }
}
