/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooa_ca2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author aleksey
 */
public class Company extends Employees {

// ARRAY LIST "STAFF" STORES EMPLOYEE DETAILS
Employees employees_resource = new Employees();
ArrayList<String> Staff = new ArrayList<String>();

// companyName FIELD
public String companyName;

public Company() {
  companyName = "Business Gnomes Ltd";
}

public Company(String nameOfCompany)  {
    nameOfCompany = companyName;
}







// AddNewStaff METHOD ADDS EMPLOYEES TO THE ARRAY LIST
public ArrayList<String> AddNewStaff(String empName, String empEmail, int empNum){
    employees_resource.getEmployeeName(empName);
    employees_resource.getEmployeeEmail(empEmail);
    employees_resource.getEmployeeNum(empNum);
    
    Staff.add(empName);
    Staff.add(empEmail);
    Staff.add(String.valueOf(empNum));
    System.out.println(Staff);
    return null;
}


// getStaffNumber METHOD COUNTS AMOUNT OF STAFF MEMBERS IN ARRAY LIST
public int getStaffNumber() {
    int size = Staff.size();
    return size;
}


// listEmployees METHOD LISTS ALL EMPLOYEES PRESENT IN ARRAY LIST
public String listEmployees(int empNum) {
    
    Iterator<String> it = Staff.iterator();
    int i = 0;
    do{
      if(Staff.contains(String.valueOf(empNum))){
          System.out.println("Employee found in list" + Staff);
      }
      else{
          System.out.println("Employee not found");
          
          
      }
    }while(it.hasNext() && i > 1);
    
    
    
    return null;
}


// SCANNER FOR READING INPUT IN MANAGER TERMINAL
public static class managerResource extends Company{
    Company manager_display = new Company();
    private String managerUsername;
    int managerinput = 0;
    Scanner managerDisplayInput = new Scanner(System.in);
    String userName, addEmpName, addEmpEmail;
    int addEmpNumber;

    
// MANAGER USERNAME & PASSWORD FIELDS, WITH GETTERS AND SETTERS
public String getManagerUsername() {
    return managerUsername;
}

public void setManagerUsername(String newUsername) {
this.managerUsername = newUsername;
}


private String managerPassword;

public String getManagerPassword() {
    return managerPassword;
}

public void setManagerPassword(String newPass) {
this.managerPassword = newPass;
}


// MENU SYSTEM USING SWITCH CASES; CAN LOG IN, VIEW STAFF, ADD STAFF AND EXIT MENU SYSTEM
 public void menu(){
     
    do {
    System.out.println("Press 1 to enter login details, 2 to view staff list, 3 to add new staff and 4 to exit the display");
      managerinput = managerDisplayInput.nextInt();
      userName = managerDisplayInput.nextLine();
      
      switch (managerinput) {
          
       case 1:
           System.out.println("Enter username");
           userName = managerDisplayInput.nextLine();
           System.out.println("Enter password");
           managerPassword = managerDisplayInput.nextLine();
           if(!userName.equals("Gnomeo") && !managerPassword.equals("smurf")) {
           System.out.println("Invalid Login Details");
           break;
        
           }
            break;
        
            
        case 2:
            System.out.println(manager_display.listEmployees(addEmpNumber));           
            break;
            
        case 3:
            System.out.println("Enter employee name to the list of staff: ");
            addEmpName = managerDisplayInput.nextLine();
            System.out.println("Enter employee email to the list of staff: ");
            addEmpEmail = managerDisplayInput.nextLine();
            System.out.println("Enter employee number to the list of staff: ");
            addEmpNumber = managerDisplayInput.nextInt();
            System.out.println(manager_display.AddNewStaff(addEmpName,addEmpEmail,addEmpNumber));
            break;
            
        case 4:
            System.out.println("Shutting down...");
            break;

        default:
           
    }  
}while (managerinput != 4);


   
    }
}


// MAIN METHOD CALLS UPON OTHER METHODS IN COMPANY CLASS
public static void main(String[] args) {
//    Company comp_test = new Company();
//    comp_test.AddNewStaff("derek shin", "ds@gmail.com", 345667);
//    System.out.println(comp_test.getStaffNumber());
// System.out.println(comp_test.listEmployees(345667));
   managerResource manager_display = new managerResource();
   manager_display.menu();
}


}
