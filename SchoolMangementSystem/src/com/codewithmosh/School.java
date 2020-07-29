package com.codewithmosh;
import java.util.ArrayList;
import java.util.List;
public class School {
    private List<Teacher> teachers=new ArrayList<>();
    private List<Student> students=new ArrayList<>();

    private  static int totalearnedmoney;
    private  static int  totalspentmoney;

    public School() {
        this.totalearnedmoney = 0;
        this.totalspentmoney = 0;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public void addStudent(Student student){
        students.add(student);


    }



    public  static int getTotalearnedmoney() {
        return totalearnedmoney;
    }

    public static void setTotalearnedmoney(int totalearnedmoney) {
        School.totalearnedmoney  += totalearnedmoney;
    }

    public static int getTotalspentmoney() {
        return totalspentmoney;
    }

    public static void setTotalspentmoney(int totalspentmoney) {
        School.totalspentmoney += totalspentmoney;
    }
}
