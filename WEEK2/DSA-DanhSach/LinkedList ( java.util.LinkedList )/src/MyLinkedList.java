//import com.sun.glass.ui.Clipboard;
//import java.util.LinkedList;

import java.util.Arrays;

public class MyLinkedList<E> {
    private Node head;
    public int numNodes = 0;

    public MyLinkedList() {
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }


    public void add(int index, E element) {
        if (index == 0)
            addFirst(element);
        else {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            Node newNode = new Node(element);
            temp.next = newNode;
            newNode.next = holder;
            numNodes++;
        }
    }


    public void addFirst(E e) {
        Node newNode = new Node(e);
        Node temp = head;
        newNode.next = temp;
        head = newNode;
        numNodes++;

    }

    public void addLast(E element){
        Node temp = head;
        for (int i = 0; i < getSize() && temp != null; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(element);
        temp.next = newNode;
        newNode.next = null;
        size ++;
    
    }

    public void remove(int index) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = holder.next;
        holder = null;
        numNodes--;
    }
    public boolean removeData(Object e){
        Node temp = head;
        Node holder;
        for(int i = 0; i < numNodes && temp.next != null; i ++){
            temp = temp.next;
            holder = temp.next;
            if(holder.data == e){
                Node replay = holder.next;
                temp.next = replay;
                holder = null;
                numNodes --;

            }
            return true ;
        }
        return false;

    }

    public E clone(){
        MyLinkedList newList = new MyLinkedList();
        Node temp = head;
        for(int i = 0; i < numNodes && temp.next != null; i ++) {
            temp = temp.next;
            newList.addLast(temp);
        }
    }

}


//    public int size(){
//
//    }
//


//
//    public int indexOf(E o){
//
//    }
//

//    public void ensureCapacity(int minCapacity){
//
//    }
//
//    public E get(int i){
//
//    }
//
//    public E getFirst(){
//
//    }
//
//    public E getLast(){
//
//    }
//
//    public void clear(){
//
//    }



