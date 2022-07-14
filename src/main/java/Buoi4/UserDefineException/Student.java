package Buoi4.UserDefineException;

import javax.ws.rs.container.Suspended;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    String name;
    int age;

    void ValidateStudentAge(int age) throws StudentStoreException {
        if (age < 18) {
            throw new StudentStoreException("Illegal age");
        }

    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Vui long nhap thong tin sinh vien");
            System.out.println("Ten sinh vien: ");
            String _name = sc.nextLine();
            int _age = sc.nextInt();
            sc.nextLine();
            Student s = new Student();
            s.name = _name;
            s.age = _age;
            s.ValidateStudentAge(_age);
            System.out.println("Mot con vit");
            System.out.println("Ten: " + s.name + " Tuoi: " +s.age);

        }
        catch (StudentStoreException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("This is finally code block");
        }

    }
}
