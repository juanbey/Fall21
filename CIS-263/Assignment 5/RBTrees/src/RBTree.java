
public class RBTree{

    
class Node {

    //1 is red 0 is black
    public Integer data, color;
    public Node left, right, parent;

    
     Node sentinel;

    public Node(int key, int rOb, Node p){
        data = key;
        left = sentinel;
        right = sentinel;
        parent = p;
        color = rOb;
    }

    public Node(int key){
        data = key;
        left = sentinel;
        right = sentinel;
        parent = sentinel;
        color = 0;
    }

    public Node(){
        data = null;
        left = null;
        right = null;
        parent = null;
        color = 0;

    }
}

    Node root;

    void rotateR(Node toRot){
        Node y = toRot.left;
        toRot.left = y.right;
        if(y.right != null){
            y.right.parent = toRot;
        }

        y.parent = toRot.parent;

        if(toRot.parent == null){
            this.root = y;
        }

        else if(toRot == toRot.parent.right){
            toRot.parent.right = y;
        }

        else{
            toRot.parent.left = y;
        }
        y.right = toRot;
        toRot.parent = y; 
    }

    void rotateL(Node toRot){
        Node y = toRot.right;
        toRot.right = y.left;
        if(y.left != null){
            y.left.parent = toRot;
        }

        y.parent = toRot.parent;

        if(toRot.parent == null){
            this.root = y;
        }

        else if(toRot == toRot.parent.left){
            toRot.parent.left = y;
        }

        else{
            toRot.parent.right = y;
        }
        y.left = toRot;
        toRot.parent = y;   
    }

    void setTree(){
        Node N1 = new Node(26);
        Node N2 = new Node(17, 1, N1);
        Node N3 = new Node(41, 0, N1);
        Node N4 = new Node(14, 0, N2);
        Node N5 = new Node(21, 0, N2);
        Node N7 = new Node(30, 1, N3);
        Node N8 = new Node(47, 0, N3);
        Node N9 = new Node(10, 1, N4);
        Node N10 = new Node(16, 0, N4);
        Node N11 = new Node(19, 0, N5);
        Node N12 = new Node(23, 0, N5);
        Node N13 = new Node(28, 0, N7);
        Node N14 = new Node(38, 0, N7);
        Node N15 = new Node(7, 0, N9);
        Node N6 = new Node(3, 1, N15);
        Node N16 = new Node(12, 0, N9);
        Node N17 = new Node(15, 1, N10);
        Node N18 = new Node(20, 1, N11);
        Node N19 = new Node(35, 1, N14);
        Node N20 = new Node(39, 1, N14);
        this.root = N1;
        this.root.left = N2;
        this.root.right = N3;
        this.root.left.left = N4;
        this.root.left.right = N5;
        this.root.left.left.left = N9;
        this.root.left.left.right = N10;
        this.root.left.left.right.left = N17;


        this.root.left.left.left.left = N15;
        this.root.left.left.left.right = N16;
        this.root.left.left.left.left.left = N6;
        this.root.left.right.left = N11;
        this.root.left.right.right = N12;
        this.root.left.right.left.right = N18;
        this.root.right.right = N8;
        this.root.right.left = N7;
        this.root.right.left.left = N13;
        this.root.right.left.right = N14;
        this.root.right.left.right.left = N19;
        this.root.right.left.right.right = N20;
    }

    
    void printTree(Node TreeN){
        if(TreeN == null){
            return;
        }
        if(TreeN.left != null && TreeN.right != null){
            System.out.println("   " + TreeN.data + "(" + TreeN.color +  ") ");
            System.out.println("    " +"/" + "\\" );
            System.out.println(TreeN.left.data + "(" + TreeN.left.color +  ") " + TreeN.right.data + "(" + TreeN.right.color +  ") ");


        }
      
        if(TreeN.left == null || TreeN.right == null){
            System.out.print(TreeN.data + "(" + TreeN.color +  ") ");
        }
        printTree(TreeN.left);
        printTree(TreeN.right);

        //System.out.println(this.root.data + " " + this.root.color);
      

    }
    




    public static void main(String[] args) throws Exception {
        RBTree tree = new RBTree();
        tree.setTree();
        tree.printTree(tree.root);
      
    }
}
