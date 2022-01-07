package linkedlist.questions;

public class QuestionsMain {
    public static void main(String[] args) {
        Questions q = new Questions();

        // Question 1
        LinkedList llA1 = new LinkedList();
        llA1.createLL(1);
        llA1.insertNode(2);
        llA1.insertNode(3);
        llA1.insertNode(2);
        llA1.insertNode(5);
        llA1.traversalLL();
        q.deleteDups(llA1);
        llA1.traversalLL();

        // Question 2
        LinkedList llA2 = new LinkedList();
        llA2.createLL(1);
        llA2.insertNode(2);
        llA2.insertNode(3);
        llA2.insertNode(4);
        llA2.insertNode(5);
        llA2.traversalLL();
        Node node2 = q.nthToLast(llA2, 2);
        System.out.println(node2.value);

        // Question 3
        LinkedList llA3 = new LinkedList();
        llA3.createLL(1);
        llA3.insertNode(9);
        llA3.insertNode(5);
        llA3.insertNode(10);
        llA3.insertNode(2);
        llA3.traversalLL();
        LinkedList result3 = q.partition(llA3, 4);
        result3.traversalLL();


        // Question 4
        LinkedList llA4 = new LinkedList();
        llA4.insertNode(7);
        llA4.insertNode(1);
        llA4.insertNode(6);
        LinkedList llB4 = new LinkedList();
        llB4.insertNode(5);
        llB4.insertNode(9);
        llB4.insertNode(2);
        LinkedList result4 = q.sumLists(llA4, llB4);
        result4.traversalLL();

        // Question 5
        LinkedList llA5 = new LinkedList();
        llA5.insertNode(3);
        llA5.insertNode(1);
        llA5.insertNode(5);
        llA5.insertNode(9);
        LinkedList llB5 = new LinkedList();
        llB5.insertNode(2);
        llA5.insertNode(4);
        llA5.insertNode(6);

        q.addSameNode(llA5, llB5, 7);
        q.addSameNode(llA5, llB5, 2);
        q.addSameNode(llA5, llB5, 1);
        Node inter = q.findIntersection(llA5, llB5);
        System.out.println(inter.value);
    }
}
