public class L4_binarySearch {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end=numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

// Reverse an Array

    public static void reverseArray(int[] numbers){
        int first = 0, last = numbers.length-1;
        while(first<last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 1;
        System.out.println(binarySearch(numbers, key));
        for (int i : numbers) {
            System.out.print(i+" ");
        }
        reverseArray(numbers);
        System.out.println();
        for (int i : numbers) {
            System.out.print(i+" ");
        }
    }
}
