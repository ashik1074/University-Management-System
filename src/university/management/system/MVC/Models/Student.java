package university.management.system.MVC.Models;

import university.management.system.conn;

import java.sql.ResultSet;

public class Student {
    conn c = new conn();
    ResultSet rs;
    public Student(){

    }
    public void addStudent(String q){
        try {
            c.s.executeUpdate(q);

        }catch (Exception e){
        }

    }
    public ResultSet getStudent(String q){
        try {
           rs= c.s.executeQuery(q);
           return rs;
        }catch (Exception e){
        }
        return rs;
    }
    public void deleteStudent(String q){
        try {
            c.s.executeUpdate(q);
        }catch (Exception e){
        }

    }
    public void setAttendance(String q){
        try {
            c.s.executeUpdate(q);

        }catch (Exception e){
        }
    }
    public ResultSet getAttendance(String q){
        try {
            rs=c.s.executeQuery(q);
            return rs;
        }catch (Exception e){
        }
        return rs;
    }
    public ResultSet getRoll(String q){
        try {
            rs=c.s.executeQuery(q);
            return rs;


        }catch (Exception e){
        }
        return rs;
    }
    public void updateStudent(String q){
        try {
            c.s.executeUpdate(q);

        }catch (Exception e){
        }

    }
}
