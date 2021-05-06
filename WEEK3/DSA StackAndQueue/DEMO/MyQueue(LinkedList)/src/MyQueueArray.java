import java.util.Arrays;

public class MyQueueArray<E> {
    private int size = 0;
    private E[] myQueueArray;
    public final int DEFAULT_CAPACITY = 5;

    public MyQueueArray() {
        myQueueArray = (E[]) new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity() {
        int newSize = myQueueArray.length * 2;
        myQueueArray = Arrays.copyOf(myQueueArray, newSize);
    }

    public boolean isEmpty(E e){
        return (myQueueArray.length == 0)? true: false;

    }

    public void push(E e){
        if(size == DEFAULT_CAPACITY ){
            ensureCapacity();
        }
        myQueueArray[size] = e;
        size ++;


    }

//    public E pop(){
//
//    }

    public void display(){
        for (int i = 0;i< size;i++) {
            System.out.println(myQueueArray[i]);
        }
    }

    public static void main(String[] args) {
        MyQueueArray<String> myQueueArray = new MyQueueArray<>();
        myQueueArray.push("Nam");
        myQueueArray.push("Ky");
        myQueueArray.push("Khoi");
        myQueueArray.push("Nghia");
        myQueueArray.display();
    }
}
