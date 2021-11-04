package lesson4;
// Реализовать MyLinkedStack используя класс MyLinkedList
import java.util.NoSuchElementException;

public final class MyLinkedStack<T> {
    private Node first;
    private Node last;
    private int size;

    private class Node {
        T value;
        Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public T getValue() { return value; }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }

    public void push(T item) {
        Node newNode = new Node(item, first);
        first = newNode;
        size++;
    }
    // удалить
    public T pop() {
        T temp = peek();
        first = first.getNext();
        size--;
        return temp;
    }
    // просмотр последнего элемента
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("empty");
        }
        return first.getValue();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = first;
        for (int i = 0; i < size; i++) {
            sb.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
