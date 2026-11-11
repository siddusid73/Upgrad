package DSA.Binary_Trees;

import java.util.Stack;

class Tree_Node{
    int data;
    Tree_Node left;
    Tree_Node right;

    Tree_Node(int data){
        this.data = data;
    }
}
public class PostOrder {
    public static void postorder(Tree_Node root){
        if(root==null){
            return;
        }

        Stack<Tree_Node> stack1 = new Stack<>();

        Tree_Node current = root;
        Tree_Node lastVisitedNode = null;

        while(current!=null || !stack1.isEmpty()){

            // go to leftmost node
            while(current!=null){
                stack1.push(current);
                current = current.left;
            }

            Tree_Node peekNode = stack1.peek();

            // If right child exists then move to the right subtree
            if(peekNode.right!=null && lastVisitedNode!=peekNode.right){
                current = peekNode.right;
            }else{
                System.out.print(peekNode.data+" ");

                lastVisitedNode = stack1.pop();
            }
        } 
    }

    public static void main(String[] args) {
        Tree_Node root = new Tree_Node(1);

        root.left = new Tree_Node(2);
        root.right = new Tree_Node(3);

        root.left.left = new Tree_Node(4);
        root.left.right = new Tree_Node(5);

        root.right.right = new Tree_Node(6);

        System.out.print("Post Order Traversal: ");
        postorder(root);
    }
}
