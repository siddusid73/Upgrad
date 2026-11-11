package DSA.Binary_Trees;

import java.util.Stack;

class tree_Node{
    int data;
    tree_Node left;
    tree_Node right;

    tree_Node(int data){
        this.data = data;
    }
}
public class PreOrderTraverseIterative {
    public static void preorder(tree_Node root) {
        if(root == null){
            return;
        }

        Stack<tree_Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            tree_Node current = stack.pop();
            System.out.println(current.data+ " ");

            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left != null){
                stack.push(current.left);
            }
        }
    }

    public static void main(String[] args) {
        tree_Node root = new tree_Node(1);

        root.left = new tree_Node(2);
        root.right = new tree_Node(3);

        root.left.left = new tree_Node(4);
        root.left.right = new tree_Node(5);

        root.right.right = new tree_Node(6);

        preorder(root);
    }
}
