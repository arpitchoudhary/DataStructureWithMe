package prac;

public class BST {

    BinaryTree root;

    static class BinaryTree {

        int data;
        BinaryTree left, right;

        BinaryTree(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    /**
     * method to create the BST with default values.
     *
     * @param values
     */
    public void createDefaultTree(int... values) {

        if (values.length < 0) {
            throw new IllegalArgumentException("can't be neg value");
        }

        root = new BinaryTree(values[0]);

        for (int i = 1; i < values.length; i++) {
            createTreeNode(root, values[i]);
        }


    }

    private void createTreeNode(BinaryTree root, int value) {

        BinaryTree temp = root;

        if (temp.data < value) {

            if (temp.left != null) {
                createTreeNode(temp.left, value);
            } else {
                temp.left = new BinaryTree(value);
            }
        } else {

            if (temp.right != null) {
                createTreeNode(temp.right, value);
            } else {
                temp.right = new BinaryTree(value);
            }

        }

    }

    /**
     * Pre-Order traversal of the BST
     *
     * @param root
     */
    public void preOrder(BinaryTree root) {

        if (root == null) {
            System.out.print("Tree is Empty");
            return;
        }

        System.out.print("  " + root.data);

        if (root.left != null) {
            preOrder(root.left);
        }

        if (root.right != null) {
            preOrder(root.right);
        }

    }

    /**
     * In-order traversal of the BST
     *
     * @param root
     */
    public void inOrder(BinaryTree root) {

        if (root == null) {
            System.out.print("Tree is Empty");
            return;
        }

        if (root.left != null) {
            preOrder(root.left);
        }

        System.out.print("  " + root.data);

        if (root.right != null) {
            preOrder(root.right);
        }

    }


    /**
     * method to delete the key from the BST.
     *
     */
//    public Node deleteNode(BinaryTree root, int key) {
//
//        if (root == null) {
//            System.out.println("Tree is empty");
//            return;
//        }
//
//        if(key < root.data){
//            root.left =
//        }
//
//    }

    public static void main(String... args) {

        BST tree = new BST();

        tree.createDefaultTree(50, 30, 20, 40, 70, 60, 80);

        tree.preOrder(tree.root);

        System.out.println(" ");

        tree.inOrder(tree.root);

    }

}
