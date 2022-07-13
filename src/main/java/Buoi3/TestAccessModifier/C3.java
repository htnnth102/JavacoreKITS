package Buoi3.TestAccessModifier;

public class C3 extends C1{
    public static void main(String[] args) {
        C3 o = new C3();
        System.out.println("C3 is running...");
        System.out.println(o.z);
        System.out.println(o.x);
        System.out.println(o.y);
        o.m();

    }

}

