/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system.MVC.controllers;

import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;
import university.management.system.conn;

/**
 *
 * @author rbsam
 */
public class StudentControllerTest {
    conn c=new conn();
    public StudentControllerTest() {
    }
    /**
     * Test of add method, of class StudentController.
     */
    @Test
    public void testAdd() {
        try{
            System.out.println("add");
        String a = "";
        String bb = "";
        String c = "";
        String d = "";
        String e = "";
        String ff = "";
        String g = "";
        String h = "";
        String i = "";
        String j = "";
        String k = "";
        String l = "";
        String m = "";
        StudentController instance = new StudentController();
        instance.add(a, bb, c, d, e, ff, g, h, i, j, k, l, m);
        }catch(Exception e){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getSpecific method, of class StudentController.
     */
    @Test
    public void testGetSpecific() {
        try{
            System.out.println("getSpecific");
            String a = "";
            StudentController instance = new StudentController();
            String str = "select * from student where rollno = '"+a+"'";
            ResultSet expResult = c.s.executeQuery(str);
            ResultSet result = instance.getSpecific(a);
            ResultSet temp=instance.getSpecific(a);
            boolean flag=true;
            while(temp.next()){
                if(result.next()==expResult.next()){
                }else{
                  flag=false;
                }
            }
            if(flag){
            }else{
                fail("The test case is a prototype.");
            }
        }catch(Exception e){
            
        }
    }

    /**
     * Test of get method, of class StudentController.
     */
    @Test
    public void testGet() {
      try{  
        System.out.println("get");
        StudentController instance = new StudentController();
         String s1 = "select * from student";
        ResultSet expResult = c.s.executeQuery(s1);
        ResultSet result = instance.get();
        ResultSet temp=instance.get();
        boolean flag=true;
            while(temp.next()){
                if(result.next()==expResult.next()){
                }else{
                  flag=false;
                }
            }
            if(flag){
            }else{
                fail("The test case is a prototype.");
            }
        }catch(Exception e){
            
        }
    }

    /**
     * Test of delete method, of class StudentController.
     */
    @Test
    public void testDelete() {
      try{  System.out.println("delete");
        String a = "";
        StudentController instance = new StudentController();
        instance.delete(a);
        // TODO review the generated test code and remove the default call to fail.
        
      }catch(Exception e){
        fail("The test case is a prototype.");  
      }
    }

    /**
     * Test of AttendanceSet method, of class StudentController.
     */
    @Test
    public void testAttendanceSet() {
         try{ 
             System.out.println("AttendanceSet");
        String id = "";
        String dt = "";
        String f = "";
        String s = "";
        StudentController instance = new StudentController();
        instance.AttendanceSet(id, dt, f, s);
      }catch(Exception e){
        fail("The test case is a prototype.");  
      }
    }

    /**
     * Test of AttendanceGet method, of class StudentController.
     */
    @Test
    public void testAttendanceGet() {
       try{
        
        System.out.println("AttendanceGet");
        StudentController instance = new StudentController();
          String q="select * from attendance_student";
        ResultSet expResult = c.s.executeQuery(q);;
        ResultSet result = instance.AttendanceGet();
       ResultSet temp = instance.AttendanceGet();
       boolean flag=true;
            while(temp.next()){
                if(result.next()==expResult.next()){
                }else{
                  flag=false;
                }
            }
            if(flag){
            }else{
                fail("The test case is a prototype.");
            }
        }catch(Exception e){
            
        }
    }

    /**
     * Test of update method, of class StudentController.
     */
    @Test
    public void testUpdate() {
      try{  System.out.println("update");
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        String e = "";
        String f = "";
        String g = "";
        String h = "";
        String i = "";
        String j = "";
        String k = "";
        String l = "";
        String m = "";
        StudentController instance = new StudentController();
        instance.update(a, b, c, d, e, f, g, h, i, j, k, l, m);
      }catch(Exception e){
        fail("The test case is a prototype.");
    }
    }
    
}
