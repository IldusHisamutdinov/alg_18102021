package lesson4;

public class Main {
    public static void main(String[] args) {

//        MyLinkedStack<Integer> mls = new MyLinkedStack<>();
//        mls.push(4);
//        mls.push(5);
//        mls.push(6);
//        mls.push(7);
//        mls.push(8);
//        System.out.println(mls + " Стек дом");
//
//        System.out.println(mls.pop());
//        System.out.println(mls.pop());
//        System.out.println(mls.pop());
//        System.out.println(mls.pop());
//
//        System.out.println(mls.peek());
//        System.out.println(mls.peek());

//        System.out.println(mls + " Стек дом");

        MyLinkedStackTwo<Integer> mls = new MyLinkedStackTwo<>();
        mls.push(4);
        mls.push(5);
        mls.push(6);
        mls.push(7);
        mls.push(8);
        System.out.println(mls + " Стек дом");
        System.out.println(mls.peek());
        System.out.println(mls.pop());
        System.out.println(mls.pop());
        System.out.println(mls.pop());
        System.out.println(mls.pop());
        System.out.println(mls.toString());
    }
}
