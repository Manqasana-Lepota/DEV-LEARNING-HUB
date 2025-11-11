package com.learning;

import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.selectAllRows();

        studentDAO.deleteStudentRecord(4);
    }
}
