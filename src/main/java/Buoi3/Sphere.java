package Buoi3;

public class Sphere {
    public static void main(String[] args) {
        Sphere1 sp1 = new Sphere1();
        System.out.println(sp1);
    }
}

class Sphere1 extends Demo {
    protected String name;
    public Sphere1() {
        super(5);
        name = "name";
    }
}
