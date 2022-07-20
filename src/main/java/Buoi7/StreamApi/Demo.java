package Buoi7.StreamApi;

import javax.ws.rs.container.Suspended;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Student implements Comparable {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        return  this.score -  ((Student)o).getScore() ;
    }

//    @Override
//    public boolean equals(Object o) {
////        https://javadevcentral.com/java-stream-distinct-by-property
//    }
}

class Employee implements Comparable {
    private String name;
    private String email;
    private boolean gender;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public Employee(String name, String email, boolean gender, int age) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return this.age - ((Employee)o).getAge();
    }
}
public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ngan", 80));
        list.add(new Student("Ngan 1", 85));
        list.add(new Student("Ngan 2", 83));
        list.add(new Student("Ngan 3", 82));
        list.add(new Student("Ngan 4", 82));
        list.add(new Student("Ngan 5", 82));
        list.add(new Student("Ngan 6", 81));
        list.add(new Student("Ngan 6", 81));
        List<Student> listGoodStudent = list.stream()
                .filter(s -> s.getScore() >= 81)
                .collect(Collectors.toList());

        listGoodStudent.stream().forEach(student -> System.out.println(student.toString()));

        double avg = list.stream()
                .mapToInt(s -> s.getScore())
                .average().getAsDouble();
        System.out.println("Average score: " + Math.round(avg));

//        Stream Aggergate Function

        List<Employee> eList = new ArrayList<>();
        eList.add(new Employee("Ngan", "htnnthhtn@gmail.com", true, 22));
        eList.add(new Employee("Ngan1", "htnnttn@gmail.com", true, 53));
        eList.add(new Employee("Ngan2", "89nnthhtn@gmail.com", false, 21));
        eList.add(new Employee("Han3", "htn78htn@gmail.com", false, 19));
        eList.add(new Employee("Ngan4", "htnnt576tn@gmail.com", true, 27));

        eList.stream()
                .filter(e -> e.getAge() < 20)
                .forEach(System.out::println);

        eList.stream()
                .mapToInt(e -> e.getAge())
                .forEach(age -> System.out.print(age + "- "));
        eList.stream()
                .map(e -> e.getEmail().split("@"))
                .forEach(email -> System.out.println(email[0]));
        eList.stream()
                .sorted()
                .forEach(e -> System.out.println(e.toString()));
        System.out.println("==========================");
        eList.stream()
                .sorted((e1, e2) -> e2.getEmail().compareTo(e2.getEmail()))
                .forEach(System.out::println);
//        Limit
        System.out.println("===========================");
        eList.stream()
                .sorted()
                .limit(2)
                .forEach(employee -> System.out.println(employee.toString()));
//  Skip
        System.out.println("The highest-scored student is");
        list.stream()
                .sorted()
                .map(e -> e.getScore())
                .skip(list.size()-1)
                .forEach(System.out::println);
////        Distinct Mark of Student
//        System.out.println("===========================");
//        List<Student> distMark = list.stream()
//                .filter(distinctByKey(s -> s.getScore()))
//                .collect(Collectors.toList());
//        System.out.println(distMark.toString());
//Distinct
        int[] numbers = {12,12,14,1,11,15,20};
        System.out.println("=========================");
        Arrays.stream(numbers).distinct().forEach(System.out::println);

        //    allMatch

        boolean areAllMorethan82 = list.stream()
                .allMatch(p -> p.getScore()>82);
        System.out.println("All the students got more than 82 " + areAllMorethan82);

//    anyMatch

        boolean anyMorethan82 = list.stream()
                .anyMatch(s -> s.getScore() > 82);
        System.out.println("Any students got more than 82?? => " + anyMorethan82);

        //    noneMatch

        boolean noUnder80 = list.stream()
                .noneMatch(s -> s.getScore() < 80);
        System.out.println("No students got under 80 ? " + noUnder80);

//         count
        long totalMorethan83 = list.stream()
                .filter(s -> s.getScore() > 83)
                .count();
        System.out.println(totalMorethan83 + " students got more than 83");
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }


}
