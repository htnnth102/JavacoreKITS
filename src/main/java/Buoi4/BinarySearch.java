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

//    Delete method khong de quy
//    TH1 và 2 xóa node hợp vào một trường hợp: nút chứa X có ít nhất một nút con null
//    => NÚt chứa x có ít nhất một nút con null: đặt tham chiếu từ nút cha của x đến con bên kia của x

    Node findNode(int x) {
        Node node = root;
        if (node == null ) return null;
        while (node != null && node.key !=x) {
            if (node.key > x) {
                node = node.left;
            } else node = node.right;
        }
        return node;
    }

    boolean delete(int x) {
        Node nX=root, parentX = null;
        while (nX != null && nX.key !=x) {
            if (nX.key > x) {
                nX = nX.left ;
            } else {
                nX = nX.right;
            }
        }
        if (nX == null) return false;
        if (nX.left== null || nX.right == null  ) {
            if (parentX == null) {
                root = root.right;
                if (root.left != null) {
                    root = root.left;
                }
            }
            if (parentX.key > x) {
                parentX.right = nX.right;
                if (nX.left != null) {
                    parentX.right = nX.left;
                }
            } else {
                parentX.left = nX.right;
                if (nX.left != null) {
                    parentX.left = nX.left;
                }
            } }
            else {
                Node rightNode = nX.right, leftMost = nX.right, parent = null;
                while ((leftMost.left != null)) {
                    parent = leftMost;
                    leftMost = leftMost.left;
                }
            nX.key = leftMost.key;
            if (parent == null) {
                    nX.right = leftMost.right;
                } else  {
                    parent.left = leftMost.right;
                }
            }
//            truong hop ca hai con deu khac null
//            1.
            return true;

//
//        if (nX == null) {
//            return false;
//        }
//        if (nX.left == null || nX.right == null) {
//
//        }
//        return false;
    }
}
public class BinarySearch {
    public static void main(String[] args) {
        BSTree bst = new BSTree();
        bst.insert(8); bst.insert(3);
        bst.delete(8); bst.insert(18); bst.insert(23);
        bst.insert(82); bst.insert(4);
        bst.printTree(bst.root);
    }

}
