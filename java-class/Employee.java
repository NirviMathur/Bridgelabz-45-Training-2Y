import java.util.*;

class Employee {
    String name;
    int id;
    double salary;
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Rohan";   
        emp.id = 101;
        emp.salary = 55000.50;

        emp.displayEmployee(); 
    }
}
