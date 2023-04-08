package array;

public class bSearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14};
        int key = 10;
        int index = binarySearch(number, key);
        if(index == -1){
            System.out.println("Not Found!");
        }
        else{
            System.out.println("Key is at index : " + index);
        }

    }
}
