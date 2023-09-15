package Recursion;

public class L3_fibonacci {
    
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fib(n-1)+fib(n-2);
    }
// **********************************************
    // sorted or not

    public static boolean isSorted(int arr[], int i){
        if (i==arr.length-1){
            return true;
        }
    
       if(arr[i] >arr[i+1]){
        return false;
       }
       
       return isSorted(arr, i+1);
    }

    // ***************************************
        // First Occurence
        public static int firOcc(int arr[], int key, int i) {
            if (i == arr.length) {
                return -1; // Key not found in the array
            }
            if (arr[i] == key) {
                return i; // Key found at index i
            }
            return firOcc(arr, key, i + 1); // Recursively search the rest of the array
        }
        



    public static void main(String args[]){
        int n=5;
        System.out.println(fib(n));
        int arr[] = {3,1,4,5,6};
        System.out.println(isSorted(arr, 0));
        System.out.println(firOcc(arr, 4, 0));
    }
}
