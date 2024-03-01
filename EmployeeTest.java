/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooa_ca2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aleksey
 */
public class EmployeeTest extends Employees{
    /**
     *
     * @param args
     */
    
    // projectGroup ARRAY STORES EMPLOYEE OBJECTS
    public static void main(String[] args) {
    ArrayList<String> projectGroup = new ArrayList<String>();
    ArrayList<Integer> empNum = new ArrayList<Integer>();
         
        Employees EmployeeObj1 = new Employees();
        Employees EmployeeObj2 = new Employees();
        Employees EmployeeObj3 = new Employees();
        
//        EmployeeObj1.fill("Joe Bloggs" + "jb@gmail.com");
//        EmployeeObj2.fill("Anna Banana" + "ab@gmail.com");
//        EmployeeObj3.fill("Tom Thumb" + "tb@gmail.com");
       


        // EMPLOYEE OBJECTS, FILLED WITH DETAILS 
        String EmployeeObj1Name = EmployeeObj1.getEmployeeName("Joe Bloggs"), 
               EmployeeObj1Email = EmployeeObj1.getEmployeeEmail("jb@gmail.com");
        
        
        int EmployeeObjectNum1 = EmployeeObj1.getEmployeeNum(123);


        String EmployeeObj2Name = EmployeeObj2.getEmployeeName("Anna Banana"), 
               EmployeeObj2Email = EmployeeObj2.getEmployeeEmail("ab@gmail.com");
        
        int EmployeeObjectNum2 = EmployeeObj2.getEmployeeNum(321);


        String EmployeeObj3Name = EmployeeObj3.getEmployeeName("Tom Thumb"), 
               EmployeeObj3Email = EmployeeObj3.getEmployeeEmail("tt@gmail.com");
        
        int EmployeeObjectNum3 = EmployeeObj3.getEmployeeNum(213);

        
        
        
        // EMPLOYEE OBJECTS ARE ADDED TO projectGroup ARRAY
        projectGroup.add(EmployeeObj1Name);
        projectGroup.add(EmployeeObj1Email);
        empNum.add(EmployeeObjectNum1);
        
        projectGroup.add(EmployeeObj2Name);
        projectGroup.add(EmployeeObj2Email);
        empNum.add(EmployeeObjectNum2);
        
        projectGroup.add(EmployeeObj3Name);
        projectGroup.add(EmployeeObj3Email);
        empNum.add(EmployeeObjectNum3);

        
        
        
        // CHECKS IF EMPLOYEE NUMBER IS MATCHES DETAILS
        if(empNum.contains(123)) {
        List<String> m = new ArrayList<String>();
            System.out.println(EmployeeObj3Name);
            System.out.println(EmployeeObj3Email);
            m.add(EmployeeObj3Name);
            m.add(EmployeeObj3Email);
        }else{
            System.out.println("This employee does not exist.");
        }
    }
}
