package hashing.apna;

import java.util.TreeMap;

public class L4_treeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> thm = new TreeMap<>();
        thm.put("India", 100);
        thm.put("China", 150);
        thm.put("US", 50);
        System.out.println(thm);
    }
}
