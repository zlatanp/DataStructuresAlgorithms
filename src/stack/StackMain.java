package stack;

class StackMain {
  public static void main(String[] args) {
    StackLinkedList llStack = new StackLinkedList();
    llStack.push(1);
    llStack.push(2);
    llStack.push(3);

    StackArray aStack = new StackArray(2);
    aStack.push(1);
    aStack.push(2);
    aStack.push(3);

    llStack.deleteStack();
    aStack.deleteStack();
  }
}
