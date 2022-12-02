package OOP_Seminar3;

import java.util.Iterator;

public class LinkedList<T> implements Iterator<Node> {
    private Node current;

    public LinkedList(Node first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node next() {
        Node temp = current;
        current = current.getNext();
        return temp;
    }
}