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
    // ****************************************
        // last Occurence
        public static int lasOcc(int arr[], int key, int i){
            if(i == arr.length){
                return -1;
            }
            int isFound = lasOcc(arr, key, i+1);
            if(isFound == -1 && arr[i] == key){
                return i;
            }
            return isFound;
        }


    public static void main(String args[]){
        int n=5;
        System.out.println(fib(n));
        int arr[] = {1,1,1,1,1};
        System.out.println(isSorted(arr, 0));
        System.out.println(firOcc(arr, 4, 0));
        System.out.println(lasOcc(arr, 1, 0));
    }
}
