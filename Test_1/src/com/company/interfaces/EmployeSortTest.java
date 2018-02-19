package com.company.interfaces;

import com.company.abstractClasses.Employee;
import com.company.abstractClasses.Manager;

import java.util.Arrays;

public class EmployeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        for (Employee employee: staff) {
            System.out.println("name: " + employee.getName() + ", salary: " + employee.getSalary());
        }

        Manager[] staffManager = new Manager[3];
        staffManager[0] = new Manager("Harry Hacker", 35000);
        staffManager[1] = new Manager("Carl Cracker", 75000);
        staffManager[2] = new Manager("Tony Tester", 38000);

        Arrays.sort(staffManager);

        for (Manager manager: staffManager) {
            System.out.println("name: " + manager.getName() + ", salary: " + manager.getSalary());
        }
    }
}
