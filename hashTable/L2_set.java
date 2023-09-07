import java.util.HashMap;
import java.util.Set;

public class L2_set {
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        // Iterate
        // hm.entrySet();
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String key : keys) {
            System.out.println("key = "+key+", value = "+hm.get(key));
        }

    }
}
