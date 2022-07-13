package Buoi3;

public class AMDemo {
}

class A {
    private int x = 10;
    int A() {
        return x;
    }

}

class B {
    void b1() {
        A a = new A();
//        System.out.println(a.x);
//        Loi do x private cannot accessed from other class
    }
}

class C extends A {

}