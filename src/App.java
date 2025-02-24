public class App {
    public static void main(String args[]) {

        // Data Class Object
        StudentData studentData = new StudentData();
        studentData.studenName = "Waqas Muhammad";
        studentData.studentFatherName = "Muhammad Haseeb";
        studentData.studentAge = 18;

        System.out.println("Student Name: " + studentData.studenName);
        System.out.println("Student Father Name: " + studentData.studentFatherName);
        System.out.println("Student Age: " + studentData.studentAge);

        // Employee Class Object
        Employee employee = new Employee();
        employee.employeeName = "Ahmad";
        employee.employeeAge = 43;
        employee.employeeSalary = 123445;

        System.out.println("Employee Name: " + employee.employeeName);
        System.out.println("Employee Age: " + employee.employeeAge);
        System.out.println("Employee Salary: " + employee.employeeSalary);

        // Mobile Phone Object
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.mobileInfo("Samsung Galaxy Note 8", "SM-905");
    }
}

// Student Data Class
class StudentData {
    String studenName;
    String studentFatherName;
    int studentAge;
}

// Employee Class
class Employee {
    String employeeName;
    int employeeAge;
    int employeeSalary;

}

// Mobile Class
class MobilePhone {
    String mobileName;
    String mobileModel;

    void mobileInfo(String mobName, String mobModel) {
        this.mobileName = mobName;
        this.mobileModel = mobModel;

        System.out.println("Mobile Name: " + mobName);
        System.out.println("Mobile Model: " + mobModel);
    }

}