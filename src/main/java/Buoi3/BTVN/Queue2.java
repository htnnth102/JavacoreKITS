package Buoi3.BTVN;

public class Queue2 {
    public static void main(String[] args) {
        System.out.println("Queue 2");
        Queue2 q = new Queue2();
        q.push(10);
        q.push(1);
        q.push(13);
        q.push(5);
        q.push(0);
        q.push(7);
        q.printAll();

    }

    SLL sll = new SLL();
    void push(int x) {

        sll.insertAtRear(x);
    }

    void pop() {

        sll.deleteFromRear();
    }

    void printAll() {
        sll.printAll();
    }
}

