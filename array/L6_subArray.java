public class L6_subArray {
    public static void subArray(int [] numbers){
        int ts = 0;
        int max = Integer.MIN_VALUE;
         for(int i=0; i<numbers.length; i++){
            for(int j= i; j<numbers.length;j++ ){
                int sum = 0;
                for(int k=i; k<=j;k++){
                    System.out.print(numbers[k]+" ");
                    sum += numbers[k];
                }
                System.out.println("\t\t\t sum-->  "+sum);
                if(sum>max){
                    max = sum;
                }
                ts++;
                System.out.println();
            }
            System.out.println();
         }
         System.out.println("Total numbers : "+ ts);
         System.out.println("Max :"+ max);
    }
    public static void main(String args[]){

        int numbers[] ={2,4,6,8,10};

        subArray(numbers);

    }
}
