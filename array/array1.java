package array;

import java.util.*;

public class array1 {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String args[]){
        // datatype arrayname[] = new datatype[size]
        int marks[] = {97, 98, 99};
        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

    }
}
