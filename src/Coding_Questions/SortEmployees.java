package Coding_Questions;
import java.util.*;


class Employee {
    String name;
    String department;
    double salary;
    int id;
    String reportingManager;

    public Employee(String name, String department, double salary, int id, String reportingManager) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = id;
        this.reportingManager = reportingManager;
    }

    // To print the employee info
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Dept: " + department +
                ", Salary: ₹" + salary + ", Manager: " + reportingManager;
    }
}


public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding sample employees
        employees.add(new Employee("Ayush", "IT", 55000, 101, "Raj"));
        employees.add(new Employee("Pooja", "HR", 45000, 102, "Suman"));
        employees.add(new Employee("Ravi", "IT", 60000, 103, "Raj"));
        employees.add(new Employee("Sonal", "Sales", 48000, 104, "Karan"));
        employees.add(new Employee("Karan", "HR", 47000, 105, "Suman"));

        // Sort by name
        System.out.println("Sorted by Name:");
        employees.sort(Comparator.comparing(emp -> emp.name));
        employees.forEach(System.out::println);

        // Sort by department
        System.out.println("\nSorted by Department:");
        employees.sort(Comparator.comparing(emp -> emp.department));
        employees.forEach(System.out::println);

        // Sort by salary
        System.out.println("\nSorted by Salary:");
        employees.sort(Comparator.comparingDouble(emp -> emp.salary));
        employees.forEach(System.out::println);

        // Sort by ID
        System.out.println("\nSorted by ID:");
        employees.sort(Comparator.comparingInt(emp -> emp.id));
        employees.forEach(System.out::println);

        // Sort by reporting manager
        System.out.println("\nSorted by Reporting Manager:");
        employees.sort(Comparator.comparing(emp -> emp.reportingManager));
        employees.forEach(System.out::println);
    }
}
