package string;

public class palindrome {
    public static void main(String args[]){
        // String str = "racercar";
        // int n = str.length();
        // for(int i = 0; i< (n/2); i++){
        //     if(str.charAt(i) != str.charAt(n-1-i)){
        //         System.out.println(false);
        //         continue;
        //     }
        // }
        // System.out.println(true);

        // string comparsion
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if (s1 == s2){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        // if (s1 == s3){
        //     System.out.println("equal");
        // }
        // else {
        //     System.out.println("not equal");
        // }
        if (s1.equals(s3)){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }


    }
}
