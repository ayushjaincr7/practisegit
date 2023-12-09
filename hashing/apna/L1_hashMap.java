package hashing.apna;

import java.util.HashMap;
import java.util.Set;

public class L1_hashMap {
    
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // Get - O(1)
        System.out.println(hm.get("India"));

        // ContainsKey - o(1)
        System.out.println(hm.containsKey("Indonesia"));

        // Remove - o(1)
        System.out.println(hm.remove("China"));

        System.out.println(hm);

        // Size
        System.out.println(hm.size());
        // Is Empty
        System.out.println(hm.isEmpty());
        // cleared
        // hm.clear();
        // System.out.println(hm.isEmpty());


        // set
        // iterate
        // hm.entrySet --- similar
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key="+k+", value="+hm.get(k));
        }


    }
    
}
