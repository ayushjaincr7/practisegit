package GreedyAppr.apna;
import java.util.*;

public class L2_fractionalKnapsack {
    public static void main(String[] args) {
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        int w = 50;

        double[][] ratio = new double[value.length][2];
        // 0th col-> idx; 1th col -> ratio

        for(int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int finalVal = 0;
        for(int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if(capacity >= weight[idx]) {
                finalVal += value[idx];
                capacity -= weight[idx];
            } else {
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(finalVal);
    }
}
