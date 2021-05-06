import java.util.EmptyStackException;
import java.util.LinkedList;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfInteger();
        System.out.println("\n2. Stack of Strings");
        stackOfString();
    }
    private static void stackOfString(){
        MyGenericStack<String> color = new MyGenericStack();
        color.push("red");
        color.push("blue");
        color.push("green");
        color.push("black");
        color.push("pinky");
        color.push("gray");
        System.out.println("1.1 Size of colors after push operations: "+ color.size());
        System.out.print("1.2 Pop elements from colors: ");
        while (!color.isEmpty()){
            System.out.printf("%s"+"  ",color.pop());
        }
        System.out.println("\n1.3 Size of colors after pop operations: "+ color.size());
    }

    private static void stackOfInteger(){
        MyGenericStack<Integer> numbers = new MyGenericStack();
        numbers.push(10);
        numbers.push(15);
        numbers.push(14);
        numbers.push(13);
        numbers.push(12);
        numbers.push(11);
        System.out.println("1.1 Size of numbers after push operations: "+ numbers.size());
        System.out.print("1.2 Pop elements from numbers: ");
        while (!numbers.isEmpty()){
            System.out.printf("%s"+"  ",numbers.pop());
        }
        System.out.println("\n1.3 Size of colors after pop operations: "+ numbers.size());
    }

}
