package String;

public class L4_stringFun {
    public static void main(String args[]){
        String s1 = "Tony";
        // s1 and s2 point to same tony 
        String s2 = "Tony";
        // s1 and s3 not point to same tony s3 create new tony
        String s3 = new String("Tony");

        // here we checking objects
        if(s1 == s2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
        if(s1 == s3){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
        if(s1.equals(s3)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

        // substring

        String str= "HellowWorlds";

        String substr = "";

        // for(int i=0; i<3;i++){
        //     substr+= str.charAt(i);
        // }

        // System.out.println(substr);
        System.out.println(str.substring(0, 5));
        
}
}
