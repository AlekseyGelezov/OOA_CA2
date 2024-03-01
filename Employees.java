/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooa_ca2;

/**
 *
 * @author aleksey
 */

public class Employees  {
    
    // INSTANCE FIELDS
    public String empName;
    public String empEmail;
    public int empNum;
    public int nextEmpNum;
    
    
    // CONSTRUCTOR INITILIASES DEFAULT VALUES FOR INSTANCE FIELDS
    public Employees()  {
    empName = "John Doe";
    empEmail = "jdoe@gmail.com";
    empNum = 0;
    }
    
    
    // CONSTRUCTOR INITILIASES PARAMETERS FOR INSTANCE FIELDS
    public Employees(String nameOfEmployee,String emailOfEmployee,int numOfEmployee)  {
    nameOfEmployee = empName;
    emailOfEmployee = empEmail;
    numOfEmployee = empNum;
    nextEmpNum++;
    }
    
    
    // GETTERS AND SETTERS FOR INSTANCE FIELDS
    public String getEmployeeName(String nameOfEmployee){
      return nameOfEmployee;
   }
    
    public String setEmployeeName(String nameOfEmployee) {
      return this.empName = nameOfEmployee;
   }
    
    public String getEmployeeEmail(String emailOfEmployee) {
      return emailOfEmployee;
   }
    
   public String setEmployeeEmail(String emailOfEmployee) {
      return this.empEmail = emailOfEmployee;
   }

   public int getEmployeeNum(int numOfEmployee) {
      return numOfEmployee;
   }
   
   public int setEmployeeNum(int numOfEmployee) {
      return this.empNum = numOfEmployee;
   }
    
   public int getnextEmpNum(int nextEmpNum) {
      return nextEmpNum;
   }

    
    
    
    
    
    

}