package Linked_List;

import java.util.LinkedList;



public class l1 {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        // create new node
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
         //step2 --> newNode next = head

        newNode.next = head; 

        // step3 -- head = newNode
        head = newNode;

        

    }
    
    public static void main(String args[]){
        l1 ll = new l1();
        ll.addFirst(1);
        ll.addFirst(2);

    }

}
