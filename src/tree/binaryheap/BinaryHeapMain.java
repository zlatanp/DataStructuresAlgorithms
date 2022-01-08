package tree.binaryheap;

public class BinaryHeapMain {
    public static void main(String[] args) {
        BinaryHeap bhTree = new BinaryHeap(5);
        bhTree.insert(10, "Max");
        bhTree.insert(5, "Max");
        bhTree.insert(15, "Max");
        bhTree.insert(1, "Max");
        bhTree.extractHeadOfBP("Max");
        bhTree.levelOrder();
    }
}
