package DSA.Binary_Trees;

import java.util.Stack;

//Implementation of Inorder Traversal using stack
class treeNode{
 int data;
    treeNode left;
    treeNode right;

    treeNode(int data){
        this.data = data;
    }
}

public class InOrderTraversal {
    //Travese --> left--root--right
   public static void inorder(treeNode root) {
    Stack<treeNode> stack = new Stack<>();
    treeNode current = root;

    while(current != null || !stack.isEmpty()){
        while(current != null){
            stack.push(current);
            current = current.left;
        }

        current = stack.pop();
        System.out.println(current.data+"");

        current = current.right;
    }
   }

   public static void main(String[] args) {
    treeNode root = new treeNode(1);

    root.left = new treeNode(2);
    root.right = new treeNode(3);

    root.left.left = new treeNode(4);
    root.left.right = new treeNode(5);

    root.right.right = new treeNode(6);

    System.out.println("Inorder Traversal:");
    inorder(root);
   }
}

