package sorting;
// theory
        // 5 4 1 3 2
        // oth turn
        // 4 5 1 3 2 swap
        // 4 1 5 3 2 swap
        // 4 1 3 5 1 swap
        // 4 1 3 2 5 swap
        // 1th turn
        // 4 1 3 2 5
        // 1 4 3 2 5 swap
        // 1 3 4 2 5 swap
        // 1 3 2 4 5 swap
        // 2nd turn
        // 1 3 2 4 5 no swap
        // 1 2 3 4 5 swap
        // 1 2 3 4 5 no swap
        // 3rd turn 
        // 1 2 3 4 5 


public class L1_BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] ={5, 4, 1, 3, 2};
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
