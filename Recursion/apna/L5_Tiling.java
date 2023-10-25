package Recursion;

public class L5_Tiling {

    public static int tilingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        // n-1 -> vertical 
        // n-2 -> horizontal 
        return tilingProblem(n-1)+tilingProblem(n-2);
    }
    // ************************************************ ////

    // Remove duplicates in a String
    public static void removeDuplicate(String st, int idx, StringBuilder newSt, boolean map[]) {
        if (idx == st.length()) {
            System.out.println(newSt);
            return;
        }
        char currChar = st.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicate(st, idx + 1, newSt, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(st, idx + 1, newSt.append(currChar), map);
        }
    }


    
    public static void main(String args[]){
        System.out.println(tilingProblem(4));

        removeDuplicate("appnnacollege", 0, new StringBuilder(""), new boolean[26]);
    }
}
