package hashing.apna.Problem;

import java.util.HashMap;

public class L4_Itinerary {
    public static Character getStart(HashMap<Character,Character> tickets){
        HashMap<Character,Character> revMap = new HashMap<>();

        for(Character key : tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }

        for(Character key: tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key; 
            }
        }
        return null;

    }
    public static void main(String[] args) {
        HashMap<Character,Character> tickets = new HashMap<>();
        tickets.put('C','B');
        tickets.put('M','D');
        tickets.put('G','C');
        tickets.put('D','G');

        Character start = getStart(tickets);

        System.out.print(start);
        for(Character key: tickets.keySet()){
            System.out.print(" -> "+tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}
