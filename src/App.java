public class App {
    public static void main(String args[]) {


        
        // Data Class Object
        Data data = new Data();
        data.studenName = "Waqas Muhammad";
        data.studentFatherName = "Muhammad Haseeb";
        data.studentAge = 18;

        System.out.println("Student Name: " + data.studenName);
        System.out.println("Student Father Name: " + data.studentFatherName);
        System.out.println("Student Age: " + data.studentAge);

        // Employee Class Object
        Employee employee = new Employee();
        employee.employeeName = "Ahmad";
        employee.employeeAge = 43;
        employee.employeeSalary = 123445;

        System.out.println("Employee Name: " + employee.employeeName);
        System.out.println("Employee Age: " + employee.employeeAge);
        System.out.println("Employee Salary: " + employee.employeeSalary);
    }
}

class Data {
    String studenName;
    String studentFatherName;
    int studentAge;
}

class Employee {
    String employeeName;
    int employeeAge;
    int employeeSalary;

}