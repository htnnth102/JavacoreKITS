package Buoi3;

interface ItfDemo {
    // java version < 8
    int x = 100; // tu dong hieu la public static final int x = 100;
    double methodA(); // ~~ public abstract
    double methodB();
}

interface interfaceDemo {
    int x = 10;
    double methodA();
    default void SayHello() {
        System.out.println("Say something!");
    }
}

interface interfaceInherit extends ItfDemo, interfaceDemo {

}
// truong hop ca hai interface co variables, method giong nhau thi phai goi ten bien theo ten interface vD: infDemo.x
class Cls1 implements ItfDemo, interfaceDemo {
    public Cls1() {
        System.out.println(interfaceDemo.x + "," + ItfDemo.x);
    }

    @Override
    public double methodA() {
        return 0;
    }

    @Override
    public double methodB() {
        return 0;
    }
}

//interface {
// blueprint;
// }

// => Interface giong nhu mot nguyen tac, mot chuan muc de thông qua đó các hệ thống trao đổi thông tin và giao tiếp với nhau
// =>