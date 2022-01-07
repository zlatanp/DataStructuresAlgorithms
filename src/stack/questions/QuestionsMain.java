package stack.questions;

public class QuestionsMain {
    public static void main(String[] args) {
        ThreeInOne newStacks = new ThreeInOne(3);
        newStacks.push(0, 1);
        newStacks.push(0, 2);
        newStacks.push(1, 4);
        newStacks.push(1, 5);
        newStacks.push(2, 8);
        int result = newStacks.pop(1);
        System.out.println(result);
        int result1 = newStacks.peek(1);
        System.out.println(result1);


        StackMin minStack = new StackMin();
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
    }
}
