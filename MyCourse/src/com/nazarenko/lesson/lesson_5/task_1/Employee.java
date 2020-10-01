package com.nazarenko.lesson.lesson_5.task_1;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    Employee(){}

    Employee(String name, int departmentNumber, int salary){
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }
}
