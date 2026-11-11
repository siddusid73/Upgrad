package DSA.Binary_Trees;

class Node_tree {
    int data;
    Node_tree left, right;

    Node_tree(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BST {
    Node_tree root;

    BST() {
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
    

    public static void main(String[] args) {
        BST bst = new BST();

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

    }
}
