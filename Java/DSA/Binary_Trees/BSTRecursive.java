package DSA.Binary_Trees;

import java.util.*;

class Node_tree {
    int data;
    Node_tree left, right;

    Node_tree(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTRecursive {
    Node_tree root;

    BSTRecursive() {
        root = null;
    }

    public void insert(int key) {
        root = insertNode(root, key);
    }

    private Node_tree insertNode(Node_tree root, int key) {
        if (root == null) {
            root = new Node_tree(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertNode(root.left, key);
        } else if (key > root.data) {
            root.right = insertNode(root.right, key);
        }
        return root;
    }

    public void inorderTraversal() {
        inorder(root);
    }

    private void inorder(Node_tree root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data + "");
            inorder(root.right);
        }
    }

    public boolean search(int key) {
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(Node_tree root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return searchRecursive(root.left, key);
        }
        return searchRecursive(root.right, key);
    }

    // delete
    public void delete(int key) {
        root = deleteRecursive(root, key);
    }

    private Node_tree deleteRecursive(Node_tree root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.data) {
            root.left = deleteRecursive(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRecursive(root.right, key);
        } else {
            // case 1 Node is a leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 node has only right child
            if (root.left == null) {
                return root.right;
            }
            // case 2 node has only left node
            if (root.right == null) {
                return root.left;
            }
            // case 3 Node has two children then find inorder successor
            Node_tree successor = findMinimumNode(root.right);

            // copy successor value into current node
            root.data = successor.data;

            // delete successor
            root.right = deleteRecursive(root.right, successor.data);

        }
        return root;
    }

    public int findMinimum() {
        if (root == null) {
            throw new IllegalStateException("The BST is Empty");

        }
        return findMinimumNode(root).data;
    }

    private Node_tree findMinimumNode(Node_tree root) {
        Node_tree current = root;

        while (current.left != null) {
            current = current.left;

        }
        return current;
    }

    ///preorder
    public void preorderTraversal() {
        preorder(root);
    }

    // Root-->left-->right
    public static void preorder(Node_tree root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data + "");
        preorder(root.left);
        preorder(root.right);
    }

    // postorder
    public void postorderTraversal() {
        postorder(root);
    }

    public static void postorder(Node_tree root) {
        if (root == null) {
            return;
        }

        Stack<Node_tree> stack1 = new Stack<>();

        Node_tree current = root;
        Node_tree lastVisitedNode = null;

        while (current != null || !stack1.isEmpty()) {

            // go to leftmost node
            while (current != null) {
                stack1.push(current);
                current = current.left;
            }

            Node_tree peekNode = stack1.peek();

            // If right child exists then move to the right subtree
            if (peekNode.right != null && lastVisitedNode != peekNode.right) {
                current = peekNode.right;
            } else {
                System.out.print(peekNode.data + " ");

                lastVisitedNode = stack1.pop();
            }
        }
    }

    public static void main(String[] args) {
        BSTRecursive bst = new BSTRecursive();

        bst.insert(50);
        bst.insert(30);
        bst.insert(40);
        bst.insert(20);
        bst.insert(70);
        bst.insert(60);
        bst.insert(10);
        bst.insert(90);

        System.out.println("Inorder Traversal:");
        bst.inorderTraversal();
        System.out.println(bst.search(20));

        System.out.println("Delete 30");
        bst.delete(20);

        System.out.println("Delete 20");
        bst.delete(30);

        System.out.println("Inorder:");
        bst.inorderTraversal();
        System.out.println("Preorder:");
        bst.preorderTraversal();
        System.out.println("Postorder:");
        bst.postorderTraversal();
    }
}
