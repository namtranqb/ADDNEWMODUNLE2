public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<Integer>();
        myStack.push(10);
        myStack.push(5);
        myStack.push(5);
        myStack.push(5);
        myStack.push(5);
        myStack.push(5);
        myStack.displayMyStack();
        System.out.println("\n******************");
        System.out.println("Pop: "+myStack.pop());
        myStack.displayMyStack();
        System.out.println("\n******************");
        System.out.println("Peek:  "+myStack.peek());


    }
}
