package com.company;

public class Test {

    public static void main(String[] args){
        int size = 10;
        Employee[] employees;
        employees = EmployeeFactory.generateEmployees(size);


        EmployeeService employeeService = new EmployeeService(employees);
        employeeService.getById(4);
        employeeService.printEmployees();
        employeeService.getByName("Katia");
        employeeService.calculateSalaryAndBonus();
        employeeService.sortByName();
        employeeService.sortByNameAndSalary();
        employeeService.edit(EmployeeFactory.generateEmployees(1)[0]);
        employeeService.remove(4);

    }
}




