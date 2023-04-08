package string;

public class substring {
    public static String substring(String str, int si, int ei){
        String substr="";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str = "HelloWorld";

        System.out.println(str.substring(0,1));
       // str1.compareTo(str2)
        //    0: equal
        //    <0: str1<str2
        //    >0: str1>str2  
        // 2 comparetoIgnoreCase()

        // StringBuilder
        // StringBuilder sb = new StringBuilder("Hw");
        // for(char ch='a'; ch<='z';ch++){
        //     sb.append(ch);
        // }
        // Character.toUpperCase(0)


    }
    
}
