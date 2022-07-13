package Buoi3.TestAccessModifier2;

import Buoi3.TestAccessModifier.C1;

public class C5 {
    public static void main(String[] args) {
        C1 o = new C1();
        System.out.println("C5 is running");
        System.out.println(o.x);
//        => Vi chi co x la public
    }
}
