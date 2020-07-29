package com.codewithmosh;
import java.util.List;
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private  int totalearnedmoney;
    private int  totalspentmoney;

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

    public void setTotalearnedmoney() {
        for (var item:students) {
            totalearnedmoney +=item.getPaidFees();
        }
    }

}
