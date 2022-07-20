package collections.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

class Student1
{
    public String code;
    private String name;
    public Integer score;
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Student1(String code, String name, Integer score) {
        this.code = code;
        this.score = score;
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "(Ma SV: " + code + ", Ho ten:" + name + ", Diem TBL " + score + ")";
    }

//    public int compareTo(Object other)
//    {
//          Student otherStu = (Student) other;
//          return code.compareTo(otherStu.code);
//    }
     public int compareTo(Student1 other)
    {
        return code.compareTo(other.code);
    }

}
