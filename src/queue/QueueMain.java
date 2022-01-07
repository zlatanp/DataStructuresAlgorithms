package queue;

public class QueueMain {
    public static void main(String[] args) {
        QueueArray aQueue = new QueueArray(2);
        aQueue.enQueue(1);
        aQueue.enQueue(2);
        aQueue.enQueue(3);

        aQueue.deleteQueue();

        QueueLinkedList llQueue = new QueueLinkedList();
        llQueue.enQueue(1);
        llQueue.enQueue(2);
        llQueue.enQueue(3);

        llQueue.deleteQueue();

        CircularQueue cQueue = new CircularQueue(3);
        cQueue.enQueue(1);
        cQueue.enQueue(2);
        cQueue.enQueue(3);

        cQueue.deleteQueue();
    }
}
