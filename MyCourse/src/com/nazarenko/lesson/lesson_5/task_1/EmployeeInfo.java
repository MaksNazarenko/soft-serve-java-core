package com.nazarenko.lesson.lesson_5.task_1;

import java.util.Scanner;

public class EmployeeInfo {

    static void employeeInfo() {
        Employee employee1 = addEmployee();
        Employee employee2 = addEmployee();
        Employee employee3 = addEmployee();
        Employee employee4 = addEmployee();
        Employee employee5 = addEmployee();

        employeeOfCertainDepartment(employee1, employee2, employee3, employee4, employee5);

        employeeArrangeBySalary(employee1, employee2, employee3, employee4, employee5);
    }

    private static void employeeArrangeBySalary(Employee employee1, Employee employee2, Employee employee3, Employee employee4, Employee employee5) {
        System.out.println("Arranging employee by salary in descending order:");

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        Employee tmp;

        for (int i = 0; i < employees.length; i++) {
            for (int j = i+1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    tmp = employees[j];
                    employees[j] = employees[i];
                    employees[i] = tmp;
                }
            }
        }

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " earns " + employee.getSalary());
        }
    }

    private static void employeeOfCertainDepartment(Employee employee1, Employee employee2, Employee employee3, Employee employee4, Employee employee5) {
        System.out.println("Department workers:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number of department:\n> ");
        int departmentNumber = scanner.nextInt();
        if(departmentNumber == employee1.getDepartmentNumber()) {
            System.out.println(employee1.getName() + " work in department " + departmentNumber);
        } if(departmentNumber == employee2.getDepartmentNumber()) {
            System.out.println(employee2.getName() + " work in department " + departmentNumber);
        } if(departmentNumber == employee3.getDepartmentNumber()) {
            System.out.println(employee3.getName() + " work in department " + departmentNumber);
        } if(departmentNumber == employee4.getDepartmentNumber()) {
            System.out.println(employee4.getName() + " work in department " + departmentNumber);
        } if(departmentNumber == employee5.getDepartmentNumber()) {
            System.out.println(employee5.getName() + " work in department " + departmentNumber);
        }

    }

    private static Employee addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are adding employee now.");
        Employee employee = new Employee();
        System.out.print("Write employee name:\n> ");
        employee.setName(scanner.nextLine());
        System.out.print("Write " + employee.getName() + "'s department number:\n> ");
        employee.setDepartmentNumber(scanner.nextInt());
        System.out.print("Write " + employee.getName() + "'s salary:\n> ");
        employee.setSalary(scanner.nextInt());
        return employee;
    }

}
