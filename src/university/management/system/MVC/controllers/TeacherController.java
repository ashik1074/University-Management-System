package university.management.system.MVC.controllers;

import university.management.system.MVC.Models.Teacher;

import java.sql.ResultSet;

public class TeacherController {
    ResultSet rs;
    Teacher tch= new Teacher();
    public void add(String a, String bb, String c, String d, String e, String ff, String g, String h, String i, String j, String k, String l, String m) {
        String q = "insert into teacher values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"')";
        tch.addTeacher(q);
    }

    public ResultSet get() {
        String sq="select * from teacher";
        rs=tch.getTeacher(sq);
        return rs;
    }

    public void AttendanceSet(String id, String dt, String f, String s) {
        String qry = "insert into attendance_teacher values("+ id +",'"+dt+"','"+f+"','"+s+"')";
        tch.setAttendance(qry);
    }

    public ResultSet AttendanceGet() {
        String q="select * from attendance_teacher";
        rs=tch.getAttendance(q);
        return rs;
    }

    public void delete(String a) {
        String q = "delete from teacher where emp_id = '"+a+"'";
        tch.deleteTeacher(q);
    }

    public void update(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l, String m) {
        String str = "update teacher set name='"+a+"',fathers_name='"+b+"',age='"+c+"', dob='"+d+"',address='"+e+"',phone='"+f+"',email='"+g+"',class_x='"+h+"',class_xii='"+i+"',aadhar='"+j+"',course='"+k+"',branch='"+l+"' where rollno='"+m+"'";
        tch.updateTeacher(str);
    }

    public ResultSet getSpecific(String aa) {
        String str = "select * from teacher where emp_id = '"+aa+"'";
        rs= tch.getTeacher(str);
        return rs;

    }
}
