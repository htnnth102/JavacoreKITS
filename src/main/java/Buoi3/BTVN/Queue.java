package Buoi3.BTVN;

public class Queue{
    public static void main(String[] args) {
        Queue q = new Queue();
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

        sll.deleteFromFront();
    }

    void printAll() {
        sll.printAll();
    }
}
