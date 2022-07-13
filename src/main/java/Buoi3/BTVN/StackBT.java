package Buoi3.BTVN;

import Buoi3.Array.SLLDemo;

import java.util.Stack;

public class StackBT extends SLL {
    public static void main(String[] args) {
        StackBT s = new StackBT();
        s.push(10);
        s.push(1);
        s.push(0);
        s.push(310);
        s.push(40);
        s.printAll();

    }

    void push(int x) {
        insertAtFront(x);
    }

    void pop() {
        deleteFromFront();
    }

}


