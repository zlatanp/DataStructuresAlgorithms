package tree.binarysearchtree;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(1);
        binarySearchTree.insert(13);
        binarySearchTree.insert(31);
        binarySearchTree.insert(41);
        binarySearchTree.insert(14);
        binarySearchTree.insert(51);
        binarySearchTree.insert(14);
        binarySearchTree.insert(12);

        binarySearchTree.search(binarySearchTree.root, 3);
        binarySearchTree.preOrder(binarySearchTree.root);
    }
}
