package com.learning.tightcoupling;

public class Student {

    private  MathTeacher teacher;

    public Student() {
        teacher = new MathTeacher();
    }

    public  void learn() {
        teacher.teach();
    }
}
