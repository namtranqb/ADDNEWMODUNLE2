import java.util.LinkedList;
import java.util.Stack;

public class MyStack<E> {
    private LinkedList<E> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public static void main(String[] args) {
        Stack<Integer> color = new Stack<>();
        color.push(20);
        color.push(30);
        color.push(40);
        color.push(50);
        color.push(60);
        System.out.println(color);
        System.out.println("****************************");

        Stack<Integer> myColor = new Stack<>();
        for(int i  = color.size() -1;i >= 0;i--) {
            myColor.push(color.pop());
        }
        System.out.println(myColor);

    }
}
