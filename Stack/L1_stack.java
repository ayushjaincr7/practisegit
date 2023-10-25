import java.util.*;
public class L1_stack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.add(34);
        stack.add(45);
        stack.add(2);
        stack.add(9);
        stack.add(18);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        

    }
}