import java.util.TreeMap;

public class L6_treeMap {
    // keys are sorted
    // put,get, remove are O(logn)
    // red black Trees

    public static void main(String args[]){
        TreeMap<String, Integer> hm = new TreeMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);

        System.out.println(hm);
    }
}
