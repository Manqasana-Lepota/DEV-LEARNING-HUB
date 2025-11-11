package com.learning;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.sql.*;

public class StudentDAO {

    private String driver;
    private String url;
    private String username;
    private String password;

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public void setDriver(String driver) {
        System.out.println("setting driver.........");
        this.driver = driver;
    }

    public void setUrl(String url) {
        System.out.println("setting url.........");
        this.url = url;
    }

    public void setUsername(String username) {
        System.out.println("setting username.........");
        this.username = username;
    }

    public void setPassword(String password) {
        System.out.println("setting password.........");
        this.password = password;
    }

    @PostConstruct
    public void init() throws SQLException, ClassNotFoundException {
        System.out.println();
        System.out.println("Inside the custom init method");
        System.out.println();
        getStudentJDBCConnection();

    }

    public void getStudentJDBCConnection() throws ClassNotFoundException, SQLException {

        System.out.println("Creating StudentDB connection...");
        System.out.println();
        //load driver
        Class.forName(driver);

        //get connection
        connection = DriverManager.getConnection(url, username, password);
    }

    public void selectAllRows() throws ClassNotFoundException, SQLException {
        System.out.println("Retrieving data from database............");

        //execute query
        statement = connection.createStatement();

        resultSet = statement.executeQuery("SELECT * FROM collegeDB.StudentInfo");

        while (resultSet.next()) {
            int studentId = resultSet.getInt(1);
            String studentName = resultSet.getString(2);
            String course = resultSet.getString(3);
            double fees = resultSet.getDouble(4);
            String foodType = resultSet.getString(5);

            System.out.println(studentId + " " + studentName + " " + course + " " + fees + " " + foodType);
            System.out.println();


        }

    }

    public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException {

        //execute query
        statement = connection.createStatement();

        statement.executeUpdate("DELETE from collegeDB.StudentInfo where Student_id = " + studentId);
        System.out.println("Record deleted with the id " + studentId);


    }

    public void closeConnection() throws SQLException {

        //closing the connection
        connection.close();
    }

    @PreDestroy
    public void destroy() throws SQLException {

        //Clean up job
        System.out.println("inside destroy method");
        closeConnection();

    }


}
