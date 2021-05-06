import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }

    public void ensureCape(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(E element){
        if( size == elements.length){
            ensureCape();
        }elements[size ++] = element;
    }

    public void add(int index,E element){
        for (int i = size; i >= index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size ++;
    }

    /**
     * remove object data in Array list at index
     * @param index
     * @return new Array list after remove
     */
    public E remove(int index) {
        for (int i = index; i < size; i++) {
            int temp = (int) elements[i];
            elements[i] = elements[i +1];
            elements[i+1] = temp;
        }
        return (E) elements;
    }
    public int getSize(){
        return size;
    }
    public E get(int i){
        if(i < 0 || i > getSize()){
            throw new IndexOutOfBoundsException("index > size");
        }
        return (E) elements[i];
    }

    public void printFullList(){
        for (Object i: elements
             ) {
            System.out.print(i+" ");
        }

    }
    public void printList(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]+" ");
        }
    }

    public E clone(Object[] elments){
        MyList<E> newElements = new MyList<E>(size);{
            for (int i = 0; i < elements.length; i++) {
                newElements.add(this.get(i));
            }
        }
        return (E) newElements;
    }



}
