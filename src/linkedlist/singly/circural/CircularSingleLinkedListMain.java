package linkedlist.singly.circural;

class CircularSingleLinkedListMain {
    public static void main(String[] args) {
        CircularSingleLinkedList csll = new CircularSingleLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(6, 1);
        csll.insertCSLL(7, 8);
        csll.traverseCSLL();
        csll.deleteCSLL();
        csll.traverseCSLL();
    }
}
