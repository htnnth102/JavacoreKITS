package Buoi4;

class Node {
    int key;
    Node left, right;
    Node (int x) {
        this.key = x;
        left = right = null;
    }
}

class BSTree {
    Node root;

    public  BSTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void insert(int x ) {
        if (isEmpty()) {
            root = new Node(x);
            return;
        }
        Node findNode = root, parent = null;
        while (findNode != null) {
            if (findNode.key == x ) {
                System.out.println(x + " da co trong cay");
                return;
            }
            parent = findNode;
            if (findNode.key > x) {
                findNode = findNode.left;
            } else {
                findNode = findNode.right;
            }
        }

        if (parent.key > x) {
            parent.left = new Node(x);
        } else {
            parent.right = new Node(x);
        }


    }

    void printTree(Node node) {
        if (node == null) {
            return;
        }
        printTree(node.left);
        System.out.print(node.key + " ");
        printTree(node.right);
    }
}
public class BinarySearch {
    public static void main(String[] args) {
        BSTree bst = new BSTree();
        bst.insert(8); bst.insert(3);
        bst.printTree(bst.root);
    }

}
