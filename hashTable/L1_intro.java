import java.util.HashMap;

public class L1_intro {
    public static void main(String args[]){
        // hashmap
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        // unorder -> not follow order
        System.out.println(hm);
        
        // get
        int population = hm.get("India");
        System.out.println(population);
        // key is not exit then get give null;

        // Containskey
        System.out.println(hm.containsKey("Japan"));

        // Remove
        int delete = hm.remove("China");
        System.out.println(delete);
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isEmpty
        // clear() -> to clean all key
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}


// hashing -->
//             (1)map -->   --> hashMap
//                          --> linked hashMap
//                          --> treemap

//             (2)set -->   --> hashSet
//                          --> Linked hashSet
//                          --> treeset


// hashMap
// (key, value)
// key is unique


// operations
// put(key, value)  -> O(1) : add if key exist -> replace
// get(key)         -> O(1) : 
// containsKey(key) -> O(1)
// remove(key)      -> O(1)

