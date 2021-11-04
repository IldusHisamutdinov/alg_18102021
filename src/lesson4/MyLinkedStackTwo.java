package lesson4;

import java.util.NoSuchElementException;

public class MyLinkedStackTwo<T> {
    private MyLinketList<T> list;

    public MyLinkedStackTwo() {
        this.list = new MyLinketList<>();
    }

    public void push(T item) {
        list.insertFirst(item);
    }
    // удалить
    public T pop() {
      return list.deleteFirst();
    }

    // просмотр последнего элемента
    public T peek() {
        return list.getFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String toString(){
        return list.toString();
    }
}
