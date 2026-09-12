package main.java.day6.assignment_problems;

class Employee2 {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public Employee2(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class EmployeeAndCompanyInformationManagement {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2("Divya", 65000);
        Employee2 e2 = new Employee2("Arjun", 50000);
        Employee2 e3 = new Employee2("Kavya", 55000);

        Employee2.printCompanyInfo();
    }
}