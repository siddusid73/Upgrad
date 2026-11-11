package DSA.Binary_Trees;

class Tree_node{
    int data;
    Tree_node left;
    Tree_node right;

    Tree_node(int data){
        this.data = data;
    }
}

public class PreOrderTraversal {
    //Root-->left-->right
    public static void preorder(Tree_node root){
        if(root == null){
            return;
        }

        System.out.println(root.data + "");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Tree_node root = new Tree_node(1);
        
        root.left = new Tree_node(2);
        root.right = new Tree_node(3);

        root.left.left = new Tree_node(4);
        root.left.right = new Tree_node(5);

        root.right.right = new Tree_node(6);

        preorder(root);
    }
}
