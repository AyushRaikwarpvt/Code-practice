package Coding_Questions;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFilter {
    public static void main(String[] args) {
        // Step 1: Create map of employees
        Map<String, Integer> employeeSalaries = new HashMap<>();

        // Step 2: Add employee name and salary
        employeeSalaries.put("Ayush", 48000);
        employeeSalaries.put("Ravi", 55000);
        employeeSalaries.put("Pooja", 60000);
        employeeSalaries.put("Neha", 45000);
        employeeSalaries.put("Suresh", 70000);

        // Step 3: Filter and print employees with salary > 50000
        System.out.println("Employees with salary greater than 50,000:");
        for (Map.Entry<String, Integer> entry : employeeSalaries.entrySet()) {
            if (entry.getValue() > 50000) {
                System.out.println(entry.getKey() + " = ₹" + entry.getValue());
            }
        }
    }
}

