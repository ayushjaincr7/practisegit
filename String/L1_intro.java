import java.util.Scanner;

public class L1_intro {
    public static void main(String args[]){
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("abcd");

        // String are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        // next -> single word
        // nextLine -> full line

        name = sc.nextLine();
        System.out.println(name);

        // String Lengh
        System.out.println(name.length());

        // Concatenation

        System.out.println(name.concat(" "+str2));

        // CharAt
        System.out.println(name.charAt(1));
    }
}