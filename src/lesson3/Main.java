package lesson3;

public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(5);
//        stack.push(15);
//        stack.push(25);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Expression expression = new Expression("(5+7) -[] + ({t+4})");
//        System.out.println(expression.checkBracket());

//        MyQueue<Integer> queue = new MyQueue<>();
//        queue.insert(4);
//        queue.insert(14);
//        queue.insert(24);
//        queue.insert(34);
//        queue.insert(44);
//        queue.insert(54);
//
//        System.out.println(queue);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//
//        System.out.println(queue);


//        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();
//        mpq.insert(6);
//        mpq.insert(16);
//        mpq.insert(2);
//        mpq.insert(3);
//        mpq.insert(7);
//        mpq.insert(5);
//        mpq.insert(9);
//        System.out.println(mpq);
//
//        System.out.println(mpq.remove());
//        System.out.println(mpq.remove());
//        System.out.println(mpq.remove());
//        System.out.println(mpq.remove());
//        System.out.println(mpq);

        MyDeque<Integer>deque = new MyDeque<>();
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        System.out.println(deque);
        deque.insertRight(11);
        deque.insertRight(12);
        deque.insertRight(13);
        System.out.println(deque);
    }
}
