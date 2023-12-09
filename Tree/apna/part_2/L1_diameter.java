package Tree.apna.part_2;

public class L1_diameter {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int lc = count(root.left);
        int rc = count(root.right);
        return lc + rc + 1;
    }
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int ls = sum(root.left);
        int rs= sum(root.right);
        return ls + rs + root.data;
    }

    // public static int diamter(Node root){
    //     if(root == null) {
    //         return 0;
    //     }
    //     int ld = diamter(root.left);
    //     int lh = height(root.left);
    //     int rd = diamter(root.right);
    //     int rh = height(root.right);

    //     int selfdia = lh+rh+1;

    //     return Math.max(selfdia,Math.max(ld,rd));

    // }


    static class Info {
        int dia;
        int ht;

        public Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int dia= Math.max(Math.max(leftInfo.dia, rightInfo.dia),leftInfo.ht+1+rightInfo.ht);

        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(dia, ht);
    }

    public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diameter(root).dia);
    }
}
