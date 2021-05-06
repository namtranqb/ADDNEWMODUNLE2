import java.util.Arrays;
public class MyStack<E>{
    public final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private E[] elements;

    public MyStack() {
       this.elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyStack(int size, E[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public void push(E e){
        if(size >= elements.length ){
            ensureCape();
        }
        elements[size++] = e;
    }


    public void displayMyStack(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");

        }
    }

    public E pop(){
        if(size < 0){
            System.out.println("Stack is Empty");
            return null;
        }
        E temp = elements[size - 1];
        elements[size - 1] = null;
        size --;
        return temp;
    }

    public E peek(){
        if(size < 0){
            System.out.println("Stack is Empty");
            return null;
        }
        E temp = elements[size - 1];
        return temp;
    }

    private void ensureCape(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }

}
