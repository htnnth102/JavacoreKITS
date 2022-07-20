/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi6.ExCorrect;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
class Element {

    int id, amount;

    Element(String id, String amount) {
        this.id = Integer.parseInt(id.trim());
        this.amount = Integer.parseInt(amount.trim());
    }
}

class MinMax {
    private int min;
    private int max;
    MinMax(int m) {
        min = max = m;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

}

public class Main {

    public static void main(String[] args) {
        Map<Integer, MinMax> hm= new HashMap<>();
        File f = new File("data.dat");
        File outputF = new File("output.txt");
        try {
            readFromFile(f,hm);
            // Ghi ra file
            System.out.println("Tu lấy hm =>file");
            WriteToFile(outputF, hm);
            System.out.println(hm);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void readFromFile(File fName, Map<Integer,MinMax> hm) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(fName));
        String st = br.readLine();
        while (st != null) {
            // xử lý
            st = st.replace(".", "");
            String[] arr = st.split(";"); //id: amount;
            for (int i = 0; i < arr.length; i++) {
                String[] id_amount = arr[i].split(":");
                Element el = new Element(id_amount[0], id_amount[1]);
                MinMax mm=hm.get(el.id);
                if (mm==null)
                    hm.put(el.id, new MinMax(el.amount));
                else {
                    if (el.amount<mm.getMin()) mm.setMin(el.amount);
                    if (el.amount>mm.getMax()) mm.setMax(el.amount);
                }
            }
            st = br.readLine();
        }
    }

    static void WriteToFile(File f, Map<Integer,MinMax> hm ) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write(hm.size()+"");
        bw.newLine();
        for (Integer e : hm.keySet()) {
            bw.write(e+": ");
            bw.write(hm.get(e).getMax()+"");
            bw.write(",");
            bw.write(hm.get(e).getMin()+"");
            bw.newLine();
        }
        bw.close();
    }

}
