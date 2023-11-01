package Recursion.kunal.array;


import java.util.ArrayList;

// Array Linear search

public class L2_find {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,5,6,7};
        System.out.println(findAllIndex2(arr, 5, 0));
    }

    static boolean find(int[]arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
    static int findIndex(int[]arr, int target, int index){
        if(index == arr.length){
            return  -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }
    static int findIndexLast(int[]arr, int target, int index){
        if(index == -1){
            return  -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndexLast(arr, target, index-1);
    }
    // ArrayList<Integer> list = new ArrayList<>();
    // static int findAllIndex(int[]arr, int target,int index){
    //     if(index == arr.length){
    //         return  -1;
    //     }
    //     if(arr[index] == target){
    //         list.add(index);
    //     }
    //     findIndexLast(arrl, target, index-1);
    // }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    // return the recursion

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
