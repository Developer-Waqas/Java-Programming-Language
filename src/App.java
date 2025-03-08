public class App {
    public static void main(String args[]) {

        // Private Data Calling in Main Function
        Test test = new Test();
        test.setPrivateData(21);
        test.getPrivateData();
        System.out.println("Public Data = " + test.data);

        System.out.println("<<<<<<<<=========================>>>>>>>>>>>>");
        // employee class with attributes of default and parametrized constructor
        // EmployeeData employeeData1 = new EmployeeData();
        // EmployeeData employeeData2 = new EmployeeData("Hamza", 21);
        // System.out.println("Default Constructor: " + employeeData1);
        // System.out.println("Parametrized Constructor: " + employeeData2);

        System.out.println("<<<<<<<<<<<<=======================>>>>>>>");
        // find how many number of odds and even in array
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, even = 0, odd = 1;

        for (int i = 1; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even Number = " + even);
        System.out.println("Odd Number = " + odd);

        System.out.println("<<<<<<===================>>>>>>>>>>>");

        // Data Class Object
        StudentData studentData = new StudentData();
        studentData.studentName = "Waqas Muhammad";
        studentData.studentFatherName = "Muhammad Haseeb";
        studentData.studentAge = 18;

        System.out.println("Student Name: " + studentData.studentName);
        System.out.println("Student Father Name: " + studentData.studentFatherName);
        System.out.println("Student Age: " + studentData.studentAge);

        System.out.println("<<<<<<===================>>>>>>>>>>>");

        // Employee Class Object
        Employee employee = new Employee();
        employee.employeeName = "Ahmad";
        employee.employeeAge = 43;
        employee.employeeSalary = 123445;

        System.out.println("Employee Name: " + employee.employeeName);
        System.out.println("Employee Age: " + employee.employeeAge);
        System.out.println("Employee Salary: " + employee.employeeSalary);

        System.out.println("<<<<<<===================>>>>>>>>>>>");

        // Mobile Phone Object
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.mobileInfo("Samsung Galaxy Note 8", "SM-905");

        System.out.println("<<<<<<===================>>>>>>>>>>>");
    }
}

class Test {

    int data = 50;
    private int dataPrivate = 100;

    public void setPrivateData(int pData) {
        dataPrivate = pData;
        System.out.println("Private Data = " + pData);
    }

    public int getPrivateData() {
        return dataPrivate;
    }

}

class EmployeeData {
    String name;
    int salary;

    EmployeeData() {
        name = "Null";
        salary = 0;
    }

    EmployeeData(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

// Student Data Class
class StudentData {
    String studentName;
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