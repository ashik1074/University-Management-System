package university.management.system.MVC.controllers;
import university.management.system.MVC.Models.Student;
import java.sql.ResultSet;

public class StudentController {
    ResultSet rs;
    Student stu= new Student();

    public void add(String a,String bb,String c, String d, String e, String ff, String g, String h, String i, String j, String k,String l, String m){
        String q = "insert into student values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"')";
        stu.addStudent(q);
    }
    public ResultSet getSpecific(String a){
        try {
            String str = "select * from student where rollno = '"+a+"'";
            rs= stu.getStudent(str);
            return rs;
        }catch (Exception e){
        }
        return rs;
    }

    public ResultSet get(){
        try {
            String s1 = "select * from student";
            rs= stu.getStudent(s1);
            return rs;
        }catch (Exception e){
        }
        return rs;
    }
    public void delete(String a){
        try {
            String q = "delete from student where rollno = '"+a+"'";
           stu.deleteStudent(q);
        }catch (Exception e){
        }

    }
    public void AttendanceSet(String id, String dt, String f,String s ){
        try {
            String qry = "insert into attendance_student values("+ id +",'"+dt+"','"+f+"','"+s+"')";
            stu.setAttendance(qry);

        }catch (Exception e){
        }
    }
    public ResultSet AttendanceGet(){
        try {
            String q="select * from attendance_student";
            rs=stu.getStudent(q);
            return rs;
        }catch (Exception e){
        }
        return rs;
    }

    public void update(String a, String b, String c, String d,String e, String f, String g, String h, String i, String j, String k, String l, String m) {
        String str = "update student set name='"+a+"',fathers_name='"+b+"',age='"+c+"', dob='"+d+"',address='"+e+"',phone='"+f+"',email='"+g+"',class_x='"+h+"',class_xii='"+i+"',aadhar='"+j+"',course='"+k+"',branch='"+l+"' where rollno='"+m+"'";
        stu.updateStudent(str);
    }

}
