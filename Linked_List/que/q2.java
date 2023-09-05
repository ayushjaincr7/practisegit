package Linked_List.que;

public class q2 {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static  Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            size++;
            head = tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


// Find and Remove nth node from End
    public void deleteNthFromEnd(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            sz++;
            temp = temp.next;
        }

        if(n==sz){
            head = head.next;
            return;
        }
        // sz - n 

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }





    public static void main(String args[]){
        q2 ll = new q2();

        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(2);

        ll.print();

        ll.deleteNthFromEnd(2);

        ll.print();


        
    }

    
}
