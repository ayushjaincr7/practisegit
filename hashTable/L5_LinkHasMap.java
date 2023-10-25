import java.util.LinkedHashMap;

public class L5_LinkHasMap {
    // key are insertion ordered
    // here doubly LL
    
    public static void main(String args[]){
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);

        System.out.println(hm);

    }
}
