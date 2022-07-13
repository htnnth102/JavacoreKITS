package Buoi3;

public class Slide40 {
    public static void main(String[] args) {
        Animal a1, a2, a3;
        a1 = new Animal();
        a2 = new Dog();
        a3 = new BabyDog();
        a1.eat();
        a2.eat();
        a3.eat();
    }

}
class Animal {
    void eat() {
        System.out.println("Hello");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Hello from the other side");
    }
}

class BabyDog extends Dog {
    void eat() {
        System.out.println("Mot con vit xoe ra hai cai canh");
    }
}

