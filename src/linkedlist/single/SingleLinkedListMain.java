package linkedlist.single;

class SingleLinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList sLL = new SingleLinkedList();
        sLL.createSinglyLinkedList(5);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 3);
        sLL.insertInLinkedList(8, 4);
        sLL.insertInLinkedList(9, 0);
        sLL.traverseSinglyLinkedList();
        sLL.deleteSLL();
        sLL.traverseSinglyLinkedList();
    }
}
