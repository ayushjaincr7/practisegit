package apna;

import java.util.Stack;

public class L4_pushBottom {
    // push At Bottom 
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    
    // Reverse String
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char cur = s.pop();
            result.append(cur);
        }

        return result.toString();
    }
    
    // Reverse a Stack
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // pushAtBottom(s, 4);
        reverseStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

        // String str = "HelloWorld";
        // System.out.println(reverseString(str));

    }
}
