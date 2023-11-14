package LinkedList.apna;

public class L1_Node {
    
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
    public static int size;

    // ********* ADD FIRST ************* O(1)

    public void  addFirst(int data){
        // step1 = create a new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        // step2 = newNode next = head
        newNode.next = head;
        // step3 = head = newNode
        head = newNode;
    }

    // ********* ADD Last ************* O(1)

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
       
        tail.next = newNode;
        tail=newNode;
    }

    // ********* print ************* 

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    // ********* Add in the middle *************  1->2->3->4
 
    public void addMiddle(int index, int data){
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // ********* Remove First **********

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size ==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // ********* Remove Last **********

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
 
    //  ******* search(iterative) ********************

    public int search(int key){
        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.data == key){
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }
 
    //  ******* search(Recursive) ********************
    public int helper(Node head, int key) {
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx ==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);

    }
 
    public static void main(String[] args) {
        L1_Node ll = new L1_Node();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.addMiddle(2, 9);
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.removeFirst());
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.removeLast());
        ll.print();
        System.out.println(ll.search(3));
        System.out.println(ll.recSearch(3));
    }
}
