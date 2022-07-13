package Buoi3.BTVN;

class Element {
    int data;
    Element next;
    Element (int x) {
        data = x;
        next = null;
    }

    Element(int x, Element e1Next) {
        data = x;
        next = e1Next;
    }
}

class SLL {
    Element head;
    SLL() {
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertAtFront(int x) {
        if (isEmpty()) {
            head = new Element(x);
        } else {
            head = new Element(x, head);
        }
    }

    void insertAtRear(int x) {
        if (isEmpty()) {
            head = new Element(x);
        } else {
            Element e = head;
            while (e.next != null) {
                e = e.next;
            }
            e.next  = new Element(x);
        }
    }

    void printAll() {
        Element e = head;
        if (e != null) {
            System.out.println(e.data);
            e = e.next;
        }
        while (e != null) {
            System.out.println("," + e.data);
            e = e.next;
        }
    }

    int deleteFromFront() {
        if (isEmpty()) {
            return -1;
        }
        int x = head.data;
        head = head.next;
        return x;
    }

    int deleteFromRear() {
        if (isEmpty()) {
            return -1; }
        int x;
        Element e = head;
        Element _e = head;
        while (e.next != null) {
            _e = e;
            e = e.next;

        }

        x = e.data;
        if (head == e) {
            head = null;
        } else {
            _e.next = null;
        }
        return x;
    }


}