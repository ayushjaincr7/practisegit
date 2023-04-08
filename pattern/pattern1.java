package pattern;

public class pattern1 {
    public static void main(String args[]){
        //  star pattern
        // for(int i = 1; i<=4; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }


        //  inverted star pattern
        // int n = 4;
        // for(int i = 1; i<=4; i++){
        //     for(int s = 1; s<=(n-i+1); s++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // half pyramid
        // for(int i = 1; i<=4; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        char ch = 'A';
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }   
}
