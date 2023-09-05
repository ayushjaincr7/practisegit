package Linked_List.que;

public class q1 {
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

    public int itrSearch(int key){
        Node temp  = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }

    public void revList(){
        Node cur = tail= head;
        Node prev = null;
        Node next;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;

        }
        head = prev;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }

    public static void main(String args[]){
        q1 ll = new q1();
        
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll.itrSearch(1));
        System.out.println(ll.recSearch(3));
        ll.print();
        System.out.println("\n");
        ll.revList();
        ll.print();
    }
}
