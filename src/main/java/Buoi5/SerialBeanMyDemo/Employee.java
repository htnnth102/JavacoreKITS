package Buoi5.SerialBeanMyDemo;

import java.io.Serializable;

public class Employee implements Serializable, Comparable<Employee> {
    String name;
    int age;
    boolean gender;
    double salary;

    public Employee(String name, int age, boolean gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee() {

    }


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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        int compareVal = this.name.compareTo(o.name);
        return compareVal;
    }
}
