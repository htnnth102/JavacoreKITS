package Buoi6;

import java.text.ParseException;
import java.util.*;
import java.util.concurrent.CompletionException;

public class Generics {
// <T> Tham so cua lop
//    Co the truy cap ngau nhien do cac phan tu trong mang duoc cap phat ở các ô nhớ có địa chỉ liên tiếp
//
    public static void main(String[] args) throws ParseException {
//        List<String> lst = new ArrayList<>();
//        lst.add("ST1");
//        lst.add("ST1");
//        lst.add("ST4");
//        lst.add("ST2");
        List<Employee> employeeList = new ArrayList<Employee>();
        Employee e = new Employee("Ngan", 18, false, 100000);
        Employee e1= new Employee("Ngan Ha", 22, false, 140000);
        Employee e2= new Employee("Ngan Ha", 22, false, 140000);
        Employee e3= new Employee("Ngan Ha", 22, false, 140000);
        Employee e4= new Employee("Ngan Ha", 22, false, 140000);

        employeeList.add(e);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

//        Collections.sort(employeeList);
        //        contain method
//        truoc khi contain phai xem lai ben Student co override ham equal hay khong
//        => neu khong override thi tra ve false vi khi do se so sanh hai dia chi chu khong so sanh gia tri

        Employee eTm = new Employee("Ngan", 18, false, 100000);
        boolean exit = employeeList.contains(eTm);
        if (exit) {
            System.out.println("Co");
        } else {
            System.out.println("Khong");
//            false vi ben class Employee khong ghi de ham equals nen contain so sanh dia chi => Khong ton tai hai Obj co chung dia chi

        }






    }
}
