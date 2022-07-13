package Buoi3.Array;

class Element {
    int data;
    Element next; // tham chieu den phan tu tiep theo
    Element( int x ) {
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
    SLL () {
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
            e.next = new Element(x);
        }
    }

    void printAll() {
        Element element = head;
            if (element != null) {
                System.out.print(element.data);
                element = element.next;
            }
            while (element != null) {
                System.out.print("," + element.data);
                element = element.next;
            }
    }

    public int deleteFromFront() {
        if (isEmpty())
            return -1;
        int x = head.data;
        head = head.next;
        return x;
    }

    int deleteFromRear() {
        if (isEmpty()) {
            return -1;
        }
        int x;
        Element e = head, _e = head;
        while ( e.next != null) {
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
    void printfLastIndex() {
        Element e = head;
        while (e.next != null) {
            e = e.next;
        }
        System.out.println(e.data);
    }

    boolean Kiemtra() {
        Element e = head;
//        danh sach null se sais
        if (e == null) return false;
        while (e.next != null) {
            if (e.data < e.next.data) {
                return false;
            }
            e = e.next;
        }
        return true;
    }
}
public class SLLDemo {
    public static void main(String[] args) {
        SLL sll = new SLL(); // tao mot danh sach rong
        // Chen vao , lay ra (xoa)
        sll.insertAtFront(7);
        sll.insertAtFront(3);
        sll.insertAtRear(20);
//        System.out.println(sll.Kiemtra());
//        sll.printAll();
        int y = sll.deleteFromFront();
        System.out.println("Deleted element: " + y);
        sll.printAll();
        int lastIndex = sll.deleteFromRear();
        System.out.println("\nDeleted element: " + lastIndex);
        sll.printAll();

    }
}
