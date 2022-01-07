package linkedlist.questions;

import java.util.HashSet;

public class Questions {

  /*
    Remove Dups
    Write a method to remove duplicates from an unsorted linked list.
   */
  public void deleteDups(LinkedList ll) {
    HashSet<Integer> hs = new HashSet();
    Node current = ll.head;
    Node prev = null;
    while (current != null) {
      int curval = current.value;
      if (hs.contains(curval)) {
        prev.next = current.next;
        ll.size--;
      } else {
        hs.add(curval);
        prev = current;
      }
      current = current.next;
    }
  }

  /*
    Return Nth to Last
    Implement algorithm to find the Nth to last element of a single linked list
   */
  public Node nthToLast(LinkedList ll, int n) {
    Node p1 = ll.head;
    Node p2 = ll.head;
    for (int i =0 ; i<n; i++) {
      if (p2 == null) return null;
      p2 = p2.next;
    }
    while (p2 != null) {
      p1 = p1.next;
      p2 = p2.next;
    }
    return p1;
  }

  /*
    Partition
    Write code to partition a linked list around a value X,
    such that all nodes less than X come before all nodes greater than od equal to X
   */
  public LinkedList partition(LinkedList ll, int x) {
    Node currentNode = ll.head;
    ll.tail = ll.head;
    while (currentNode != null) {
      Node next = currentNode.next;
      if (currentNode.value < x) {
        currentNode.next = ll.head;
        ll.head = currentNode;
      } else {
        ll.tail.next = currentNode;
        ll.tail = currentNode;
      }
      currentNode = next;
    }
    ll.tail.next = null;
    return ll;
  }

  /*
    Sum Lists
    You have two numbers represented by a linked list, where each node contains a single digit.
    The digits are stored in reverse order, such that 1's digit is at the head of the list.
    Write a function that adds the two numbers and returns the sum as a linked list.
   */
  public LinkedList sumLists(LinkedList llA, LinkedList llB) {
    Node n1 = llA.head;
    Node n2 = llB.head;
    int carry = 0;
    LinkedList resultLL = new LinkedList();
    while (n1 != null || n2 != null) {
      int result = carry;
      if (n1 != null) {
        result += n1.value;
        n1 = n1.next;
      }
      if (n2 != null) {
        result += n2.value;
        n2 = n2.next;
      }
      resultLL.insertNode(result%10);
      carry = result / 10;
    }
    return resultLL;
  }

  /*
    Intersection
    Given two single linked lists, determine if the two lists intersect.
    Return the intersecting node. Note that the intersection is defined based on reference, not value.
    That is, if the Kth node of the first linked list is the exact same node (by reference) as the Jth node
    of the second linked list, then they are intersecting.
   */
  public Node getKthNode(Node head, int k) {
    Node current = head;
    while (k>0 && current != null) {
      current = current.next;
      k--;
    }
    return current;
  }

  // Intersection Method
  public Node findIntersection(LinkedList list1, LinkedList list2) {
    if (list1.head == null || list2.head == null) return null;
    if (list1.tail != list2.tail) {
      return null;
    }
    Node shorter = new Node();
    Node longer = new Node();
    if (list1.size > list2.size) {
      longer = list1.head;
      shorter = list2.head;
    } else {
      longer = list2.head;
      shorter = list1.head;
    }

    longer = getKthNode(longer, Math.abs(list1.size-list2.size));
    while (shorter != longer) {
      shorter = shorter.next;
      longer = longer.next;
    }
    return longer;

  }

  // Add same node
  public void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
    Node newNode = new Node();
    newNode.value = nodeValue;
    llA.tail.next = newNode;
    llA.tail = newNode;
    llB.tail.next = newNode;
    llB.tail = newNode;

  }



}
