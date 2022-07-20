package Buoi7.MethodRef;


import java.util.function.Function;

interface Sayable { void say();
}

interface getStudent {Student STUDENT(int id, String name);};

class Student {
    int id;
    String name;
    public Student() {

    }

    public Student(int id, String name) {
        System.out.println("id: " +id);
        System.out.println("Name: " + name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}

public class Demo {
    public static void saySomething() {
        System.out.println("Ha Thi Ngan");
    }

    public void inStance() {

        System.out.println("non-static mehod");
    }

    public static void main(String[] args) {
        // refer to static method
        Sayable sayable = Demo::saySomething; // Referring static method
// Calling interface method
        sayable.say();
//        refer to non-static method

        Sayable sayable1 = new Demo()::inStance;
        sayable1.say();
//        Constructor

        getStudent getStu = Student::new;
        getStu.STUDENT(1, "Ngan");

        getStudent getStu2 = Student::new;

    }


}

