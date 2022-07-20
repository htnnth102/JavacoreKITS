package Buoi5.SerialBeanMyDemo;

import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) {
        File f = new File("D:\\Java&Database\\Demo\\src\\main\\java\\Buoi5\\SerialBeanMyDemo\\test.txt");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(f));
            while (true) {
                Employee e = (Employee) objectInputStream.readObject();
                System.out.print("Name "+ e.getName() + "\t");
                System.out.print("Age "+e.getAge() + "\t");
                System.out.print("Gender " + e.isGender() + "\t");
                System.out.println("Salary " + e.getSalary() + "\t");
            }
        }catch (EOFException eof) {
            System.out.println("Reached end of file");

       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }

    }
}
