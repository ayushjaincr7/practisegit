package hashing.apna;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class L6_linkedSet {
    
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);

        // treeSet
        TreeSet<String> ths = new TreeSet<>();
        ths.add("Delhi");
        ths.add("Mumbai");
        ths.add("Noida");
        ths.add("Bengaluru");
        System.out.println(ths);

    }
}
