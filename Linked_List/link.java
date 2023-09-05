package Linked_List;

public class link {
    
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
    static int size;

    public void addFirst(int data){
        // step1 => create new node
        Node newNode = new Node(data);
        size++;
 
        if(head==null){
            head = tail = newNode;
        }
        
        // step2 => new node next = head
        newNode.next = head;
        // step3 => head = newNode
        head = newNode;
    }

    public void addLast(int data){
        // step1 => create new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=head;
        }

        // step2

        tail.next = newNode;
        // step3

        tail = newNode;

    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }

    public void add(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        while(index-1>0){
            temp = temp.next;
            index--;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        
        
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empyt");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node temp = head;
        int s = size;
        while(s-2>0){
            temp = temp.next;
            s--;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public static void main(String args[]){
        link ll = new link();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(0,9);
        ll.print();
        System.out.println("\n"+size);
        System.out.println(ll.removeFirst());
        ll.print();
        System.out.println("\n"+ll.removeLast());
        ll.print();
    }



}
