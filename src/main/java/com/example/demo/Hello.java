package com.example.demo;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

import java.sql.*;

public class Hello {
    public static void main(String[] args) {

        Hello hello = new Hello();
        hello.start();
    }

    private void start() {
        UserDatabase userDatabase = new UserDatabase();
        try {
            userDatabase.getName(1);
        } catch (UserNotFoundException | InternalSystemException | DatabaseException e) {
            e.printStackTrace();
        }

        try {
            div(1, 0);
        }catch(InputCantZeroValueException e){
            System.out.println("Error");
        }
    }

    private double div(int a, int b){
        if(b != 0){
            return a/b;
        }
        throw new InputCantZeroValueException();
    }
}

class UserDatabase {
    public String getName(int id) throws UserNotFoundException,InternalSystemException, DatabaseException {
        try {
            Class.forName("mysql.xxx");
            Connection conn = DriverManager.getConnection("url");

            PreparedStatement prestatement = conn.prepareStatement("Select * FROM TABLE");
            ResultSet res = prestatement.executeQuery();
            if(res.next())
            {
                return res.getString("NAME");
            }
            throw new UserNotFoundException();

        } catch (ClassNotFoundException e) {
            throw new InternalSystemException();
        } catch (SQLException e) {
            throw new DatabaseException();
        }
        //return null;
    }


}