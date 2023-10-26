package Recursion.kunal.array;

public class L2_find {
    public static void main(String[] args) {
        
    }

    static boolean find(int[]arr, int target, index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arrl, target, index+1);
    }
    static int findIndex(int[]arr, int target, index){
        if(index == arr.length){
            return  -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arrl, target, index+1);
    }
    static int findIndexLast(int[]arr, int target, index){
        if(index == -1){
            return  -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndexLast(arrl, target, index-1);
    }
}
