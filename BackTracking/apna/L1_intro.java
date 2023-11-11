package BackTracking.apna;

public class L1_intro {
    // type of Backtracking
    // 1. Decision
    // 2. Optimization
    // 3. Enumeration

    // Backtracking - Arrays

    public static void changeArr(int arr[], int i, int val){
        // base case
        if(i==arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1); // fnx call step
        arr[i] = arr[i]-2; // backtracking step

    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    

    public static void main(String[] args) {
        int arr[] = new int [5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }

}
