package com.learning.loosecoupling;

public class Student {
    private Teacher teacher;

    // Dependency Injection using setter methods
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void learn() {
        teacher.teach();
    }
}
