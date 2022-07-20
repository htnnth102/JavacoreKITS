package Buoi6.HashSet;

import java.util.HashSet;

public class Demo implements Comparable<Demo> {
    private  String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Demo d1 = new Demo("Ngan", 10);
        Demo d2 = new Demo("Thi", 13);
        Demo d3 = new Demo("Ha", 16);
        Demo d4 = new Demo("Ngoc", 30);

        Demo d5 = new Demo("Thi", 13);

    }

    @Override
    public int compareTo(Demo o) {
        return 0;
    }
}
