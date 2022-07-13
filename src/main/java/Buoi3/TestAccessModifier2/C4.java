package Buoi3.TestAccessModifier2;

import Buoi3.TestAccessModifier.C1;

public class C4 extends C1 {
    public static void main(String[] args) {
        C4 o = new C4();
        System.out.println("C4 is running");
        System.out.println(o.x);
        System.out.println(o.y);
//        System.out.println(o.z); => Loi vi default
//        System.out.println(o.u); => Loi vi private
        o.m();

    }
}
