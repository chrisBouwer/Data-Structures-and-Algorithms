package binarysearchtree;

/**
 *
 * @author VVF6HCS19 - Christiaan Bouwer
 */
public class BinarySearchTree {

    public static void main(String[] args) {
    BST tree = new BST();
    tree.insert(5);
    tree.insert(3);
    tree.insert(1);
    tree.insert(8);
    tree.insert(9);
    tree.insert(2);
    tree.insert(12);
    tree.insert(7);
    tree.insert(0);

    System.out.println("\nPreorder: ");
    tree.preorder();
    System.out.println("\nPostorder: ");
    tree.postorder();
    System.out.println("\nInorder: ");
    tree.inorder();
    }
}
