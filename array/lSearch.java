package array;

public class lSearch {
    public static int linearSearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int marks[] = {2,4,6,8,10,12,14,16};
        int key = 20;
        int index = linearSearch(marks, key);
        if(index == -1){
            System.out.println("Not Found!");
        }
        else{
            System.out.println("Key is at index : " + index);
        }
        System.out.println(Integer.MAX_VALUE);
    }
    
}
