package binarysearchtree;

/**
 *
 * @author VVF6HCS19 - Christiaan Bouwer
 */
class BST {

    TreeNode root;

    public BST() {
        root = null;
    }

    void insert(int value) {
        root = insert(root, value);

    }

    TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode();
            root.setData(value);
            root.setLeft(null);
            root.setRight(null);
        } else if (value < root.getData()){
            //insert in left subtree
            root.setLeft(insert(root.getLeft(), value));
        } else if (root.getData() < value){
            //insert in right subtree
            root.setRight(insert(root.getRight(), value));
        }
        return root;
    }
    
    void preorder(){
        preorder(root);
    }
    
    void preorder(TreeNode root){
        if (root != null) {
            System.out.println(root.getData() + ", ");
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }
    
    void postorder(TreeNode root){
        if (root != null) {
        }
    }
}
