public class L1_intro {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        // int marks[] = new int [50];

        // passing array as an arguments

        int marks[] = {97,98,99};
        update(marks);

        // print out marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }

        System.out.println();

        
    }
}