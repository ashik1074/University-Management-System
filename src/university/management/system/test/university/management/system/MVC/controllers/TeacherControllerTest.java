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
public class TeacherControllerTest {
    conn c=new conn();
    public TeacherControllerTest() {
    }
     /**
     * Test of add method, of class TeacherController.
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
        TeacherController instance = new TeacherController();
        instance.add(a, bb, c, d, e, ff, g, h, i, j, k, l, m);
        // TODO review the generated test code and remove the default call to fail.
        
       }catch(Exception e){
           fail("The test case is a prototype.");   
       }
    }

    /**
     * Test of get method, of class TeacherController.
     */
    @Test
    public void testGet() {
        try{
            System.out.println("get");
        TeacherController instance = new TeacherController();
        String sq="select * from teacher";
        ResultSet expResult = c.s.executeQuery(sq);
        ResultSet result = instance.get();
        ResultSet temp = instance.get();
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
     * Test of AttendanceSet method, of class TeacherController.
     */
    @Test
    public void testAttendanceSet() {
       try{ 
           System.out.println("AttendanceSet");
        String id = "";
        String dt = "";
        String f = "";
        String s = "";
        TeacherController instance = new TeacherController();
        instance.AttendanceSet(id, dt, f, s);
        // TODO review the generated test code and remove the default call to fail.
       }catch(Exception e){
           fail("The test case is a prototype.");
       }
    }

    /**
     * Test of AttendanceGet method, of class TeacherController.
     */
    @Test
    public void testAttendanceGet() {
        try{System.out.println("AttendanceGet");
        TeacherController instance = new TeacherController();
           String q="select * from attendance_teacher";
        ResultSet expResult = c.s.executeQuery(q);
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
     * Test of delete method, of class TeacherController.
     */
    @Test
    public void testDelete() {
        try{System.out.println("delete");
        String a = "";
        TeacherController instance = new TeacherController();
        instance.delete(a);
        // TODO review the generated test code and remove the default call to fail.
        }catch(Exception e){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of update method, of class TeacherController.
     */
    @Test
    public void testUpdate() {
       try{ System.out.println("update");
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
        TeacherController instance = new TeacherController();
        instance.update(a, b, c, d, e, f, g, h, i, j, k, l, m);
        // TODO review the generated test code and remove the default call to fail.
       }catch(Exception e){
           fail("The test case is a prototype.");
       }
    }

    /**
     * Test of getSpecific method, of class TeacherController.
     */
    @Test
    public void testGetSpecific() {
        try{
            System.out.println("getSpecific");
        String aa = "";
        TeacherController instance = new TeacherController();
        String str = "select * from teacher where emp_id = '"+aa+"'";
        ResultSet expResult = c.s.executeQuery(str);
        
        ResultSet result = instance.getSpecific(aa);
         ResultSet temp = instance.getSpecific(aa);
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
    
}
