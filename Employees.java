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
    public String name;
    public String email;
    public int empNum;
    public int nextEmpNum;
    
    public Employees()  {
    name = "John Doe";
    email = "jdoe@gmail.com";
    empNum = 0;
    
    }
    
    public Employees(String nameOfEmployee,String emailOfEmployee,int numOfEmployee)  {
    nameOfEmployee = name;
    emailOfEmployee = email;
    numOfEmployee = empNum;
    nextEmpNum++;
    }
    
    public String getEmployeeName(String nameOfEmployee){
      return nameOfEmployee;
   }
    
    public void setEmployeeName(String nameOfEmployee) {
      this.name = nameOfEmployee;
   }
    
    public String getEmployeeEmail(String emailOfEmployee) {
      return emailOfEmployee;
   }
    
   public void setEmployeeEmail(String emailOfEmployee) {
      this.email = emailOfEmployee;
   }

   public int getEmployeeNum(int numOfEmployee) {
      return numOfEmployee;
   }
   
   public void setEmployeeNum(int numOfEmployee) {
      this.empNum = numOfEmployee;
   }
    
   public int getnextEmpNum(int nextEmpNum) {
      return nextEmpNum;
   }
    
    
    
    
    

}