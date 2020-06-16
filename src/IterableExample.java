import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.io.*;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return this.data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

}

class ListIterator<T> implements Iterator<T> {

    Node<T> current;

    public ListIterator(List<T> list) {
        current = list.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T data = current.getData();
        current = current.getNext();

        return data;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

}

class List<T> implements Iterable<T> {

    Node<T> head, tail;

    public void add(T data) {
        Node<T> node = new Node<T>(data, null);
        if (head == null) {
            tail = head = node;
        } else {
            tail.setNext(node);
            tail = node;
        }

    }

    public Node<T> getHead() {
        return this.head;
    }

    public Node<T> getTail() {
        return this.tail;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(this);
    }

}

public class IterableExample {
    public static void main(String[] args) {
        List<String> list = new List<String>();
        list.add("harsh");
        list.add("tarak");
        list.add("mumbai");

        // Iterator<String> it = list.iterator();

        for (String str : list) {
            System.out.println(str);
        }

        Collection<String> collection = getCollectionFromIterable(list);
        System.out.println(collection);
    }

    public static <T> Collection<T> getCollectionFromIterable(Iterable<T> it) {

        Collection<T> cll = new ArrayList<T>();
        
        // for (T t : it) {
        //     cll.add(t);
        // }

        //it.forEach(cll :: add);

        //return StreamSupport.stream(it.spliterator(),false).collect(Collectors.toList());

        return StreamSupport.stream(it.spliterator(),false).collect(Collectors.toList());

    }

}