package Buoi6.BTVN;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeMap;

public class NguoiGuiTien implements Comparable<NguoiGuiTien> {
    int id;
    String hoTen;
    String diaChi;
    String sdt;
    Date Dob;

    public NguoiGuiTien(int id, String hoTen, String diaChi, String sdt, Date dob) {
        this.id = id;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        Dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date dob) {
        Dob = dob;
    }
//
//    @Override
//    public int hashCode() {
//        return this.id;
//    }
//
    @Override
    public String toString() {
        return "NguoiGuiTien{" +
                "id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", sdt='" + sdt + '\'' +
                ", Dob=" + Dob +
                '}';
    }

    @Override
    public int compareTo(NguoiGuiTien o) {
        return (hoTen.compareToIgnoreCase(o.hoTen));
    }
    public static void main(String[] args) throws ParseException {
        DateFormat date = new SimpleDateFormat("dd/MM/yyy");
        NguoiGuiTien ps1 = new NguoiGuiTien(1,"Ha Thi Ngan", "Dia chi 1", "0987410194", date.parse("1/1/1999"));
        NguoiGuiTien ps2 = new NguoiGuiTien(2,"Ha Thi Ngan 2", "Dia chi 2", "0987410194", date.parse("1/10/1999"));
        NguoiGuiTien ps3 = new NguoiGuiTien(3,"Ha Thi Ngan 3", "Dia chi 3", "0987410194", date.parse("2/10/1999"));
        NguoiGuiTien ps4 = new NguoiGuiTien(4,"Ha Thi Ngan 4", "Dia chi 4", "0987410194", date.parse("21/1/1999"));
        NguoiGuiTien ps5 = new NguoiGuiTien(5,"Ha Thi Ngan 5", "Dia chi 5", "0987410194", date.parse("2/10/1999"));

        TreeMap<NguoiGuiTien, Double> tMap = new TreeMap<NguoiGuiTien, Double>();

        tMap.put(ps1, 2000000.0);
        tMap.put(ps2, 300000.0);
        tMap.put(ps3, 2400000.0);
        tMap.put(ps4, 1200000.0);
        tMap.put(ps5, 250000.0);

        NguoiGuiTien ps6 = new NguoiGuiTien(5,"Ha Thi Ngan 5", "Dia chi 5", "0987410194", date.parse("2/10/1999"));
        if (tMap.containsKey(ps6)) {
            System.out.println("Found");
        } else {
            tMap.put(ps6, 100.0);
        }


    }


}
