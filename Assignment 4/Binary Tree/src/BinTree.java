
class Node {
    public int data;
    public Node left, right;

    public Node(int key){
        data = key;
        left = null;
        right = null;
    }
}

public class BinTree {
Node root;

    boolean check(Node checkroot, Node leftroot, Node rightroot){
        

        //If the root is null it's a Binary Tree
        if(checkroot == null){
            return true;
        }

        if(checkroot.left == null && checkroot.right == null){
            return true;
        }

        //If the root is less than the left child it's NOT a Binary Tree
        if(checkroot.data < checkroot.left.data){
            return false;
        }

        //If the root is more than the left child it's NOT a Binary Tree
        if(checkroot.data > checkroot.right.data){
            return false;
        }

        

        return (check(checkroot.left, checkroot.left.left, root) && check(checkroot.right, root, checkroot.right.right));
    }



    public static void main(String[] args) throws Exception {
        BinTree tree = new BinTree();
        tree.root = new Node(65);
        tree.root.left = new Node(44); 
        tree.root.right = new Node(77);
        tree.root.left.left = new Node(21); 
        tree.root.left.right = new Node(47); 
        tree.root.right.left = new Node(64); 
        tree.root.right.right = new Node(83); 


        BinTree tree2 = new BinTree();
        tree2.root = new Node(65);
        tree2.root.left = new Node(77); 
        tree2.root.right = new Node(44);
        tree2.root.left.left = new Node(1); 
        tree2.root.left.right = new Node(2); 
        tree2.root.right.left = new Node(18); 
        tree2.root.right.right = new Node(12); 


        if(tree.check(tree.root, tree.root.left, tree.root.right)){
        System.out.println("The Binary Tree is Correct");
        }

        else{
        System.out.println("The Binary Tree is NOT Correct");  
        }

        if(tree2.check(tree2.root, tree2.root.left, tree2.root.right)){
            System.out.println("2: The Binary Tree is Correct");
            }
    
            else{
            System.out.println("2: The Binary Tree is NOT Correct");  
            }



    }
}
