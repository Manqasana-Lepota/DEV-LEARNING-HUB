package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

    private String collegeName;

    @Autowired
    private Principal principal;

    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;

    @Value("${college.Name}")
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void test() {
        principal.principalInfo();
        teacher.teach();
        System.out.println("My College name is: " + collegeName );
        System.out.println("Testing this methods");
    }

}
