// Floyd's cyclic finding alogrithm
// slow and fast approach is applied



public class LOOP {
    public class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public Node head;
    public Node tail;

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Moves one node at a time
            fast = fast.next.next;    // Moves two nodes at a time
            
            if (slow == fast) {
                return true;    // Cycle exists
            }
        }
        
        return false;   // Cycle doesn't exist
    }

// remove a loop/cycle in a ll





    
    public static void main(String args[]) {
        LOOP link = new LOOP();
        
        // Creating a linked list with a cycle
        link.head = link.new Node(1);
        link.head.next = link.new Node(2);
        link.head.next.next=link.head;   // Creating a cycle by pointing the last node to the head
        
        boolean hasCycle = link.isCycle();
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}
