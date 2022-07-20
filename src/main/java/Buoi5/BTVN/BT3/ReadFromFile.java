package Buoi5.BTVN.BT3;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String inputFile = "student.txt";
        BufferedReader br = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            br = new BufferedReader(new FileReader(inputFile));
            String s;
            String[] rs;
            while ((s = br.readLine()) != null) {
                rs = s.split(",");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            br.close();
        }

//        try {
//            ObjectInputStream objectInput
//                    = new ObjectInputStream(new FileInputStream(inputFile));
//            while (true) {
//                Student student = (Student) objectInput.readObject();
//
//                System.out.print(student.getName() + "\t");
//                System.out.print(dateFormat.format(student.getBirthday()) + "\t");
//                System.out.print(student.getGender() + "\t");
//                System.out.print(student.getAge() + "\t");
//                System.out.println(student.getGrade());
//            }
//        } catch (EOFException eof) {
//            System.out.println("Reached end of file");
//        } catch (IOException e){}
//        catch(ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
    }
}
