package hashing.apna;

import java.util.HashSet;

import java.util.Iterator;

public class L5_hashSet {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();

        // set.add(1);
        // set.add(2);
        // set.add(4);
        // set.add(2);
        // set.add(1);
        // System.out.println(set);
        // set.remove(2);
        // if(set.contains(2)){
        //     System.out.println("set contains");
        // }else{
        //     System.out.println("set doesn't contain");
        // }
        // set.clear();
        // System.out.println(set.size());
        // System.out.println(set.isEmpty());

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for(String city: cities){
            System.out.println(city);
        }

    }
}
