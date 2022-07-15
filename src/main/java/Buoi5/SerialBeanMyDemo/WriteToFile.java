package Buoi5.SerialBeanMyDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        try {
            File f = new File("D:\\Java&Database\\Demo\\src\\main\\java\\Buoi5\\SerialBeanMyDemo\\testDemo2.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
                File file = f;
                ObjectOutputStream objOutput = null;
                try {
                    objOutput = new ObjectOutputStream(new FileOutputStream(f));
                    Employee e1 = new Employee("Ha Thi Ngan", 25, false, 10000000);
                    Employee e2 = new Employee("Ngan Thi Ha", 52, true, 20000000);
                    objOutput.writeObject(e1);
                    objOutput.writeObject(e2);
                } catch (IOException e) {
                }
                finally {
                    objOutput.close();
                }
            } else {
                System.out.println("File already exists");
            }
        }
        catch (IOException e) {
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
