package DSA.Binary_Trees;

class TreeNode{
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data){
        this.data = data;
        left = right = null;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public TreeNode getLeft(){
        return left;
    }

    public void setLeft(TreeNode left){
        this.left = left;
    }

    public TreeNode getRight(){
        return right;
    }

    public void setRight(TreeNode right){
        this.right = right;
    }


}
public class BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode node2 = new TreeNode(21);
        TreeNode node3 = new TreeNode(23);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(34);
        TreeNode node6 = new TreeNode(43);
        TreeNode node7 = new TreeNode(56);

        root.setLeft(node2);
        root.setRight(node3);
        
        node2.setLeft(node4);
        node3.setRight(node5);

        node3.setRight(node7);
        node3.setLeft(node6);

        inorder(root);
    }

    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.getLeft());
        System.out.print(root.getData());
        inorder(root.getRight());
    }
}
