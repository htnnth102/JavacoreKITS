package Buoi5.BTVN.BT3;

public class Student {
    String fullname;
    String hometown;
    int yearOfBirth;
    float grade;

    public Student(String fullname, String hometown, int yearOfBirth, float grade) {
        this.fullname = fullname;
        this.hometown = hometown;
        this.yearOfBirth = yearOfBirth;
        this.grade = grade;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
