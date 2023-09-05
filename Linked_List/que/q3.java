package Linked_List.que;

public class q3 {
    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = tail = newNode;
    } else {
        newNode.next = head;
        head = newNode;
    }
}

public void print(){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp= temp.next;
        }
    System.out.println();
    }
// slow-fast tech
// slow = head -> +1
// fast = head -> +2



// Palindrome

// find midNode
// 2nd half of reverse
// check if 1st half == 2nd half

public Node findMid (Node head){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
}
void palindrome(Node head){
    
}

    public static void main(String args[]){
        q3 list = new q3();
        list.addFirst(1);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(1);
        list.print();
    }
}
