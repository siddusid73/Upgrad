package DSA.Binary_Trees;
//Breadth first traversal or level order traversal

import java.util.LinkedList;
import java.util.Queue;

class NodeTree {
    int data;
    NodeTree left, right;

    NodeTree(int data) {
        this.data = data;
    }
}

public class BFT {
    public static void BreadthFirstTraversal(NodeTree root) {
        if (root == null) {
            return;
        }
        Queue<NodeTree> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            NodeTree current = queue.poll();
            System.out.println(current.data + " ");
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    public static void main(String[] args) {
        NodeTree root = new NodeTree(10);

        root.left = new NodeTree(20);
        root.right = new NodeTree(30);

        root.left.left = new NodeTree(40);
        root.left.right = new NodeTree(50);

        root.right.left = new NodeTree(60);
        root.right.right = new NodeTree(70);
    }
}
