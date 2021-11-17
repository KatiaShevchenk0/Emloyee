package com.company;
import java.text.MessageFormat;

public class EmployeeService {
    Employee[] employees;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    void printEmployees() {
        for (Employee value : employees) {
            System.out.println(MessageFormat.format("id = {0}, name = {1}, age = {2}, gender ={3}, salary = {4}, bonus = {5}",
                    value.getById(),
                    value.getByName(),
                    value.getAge(),
                    value.getGender(),
                    value.getSalary(),
                    value.getBonus()));
        }
    }

    double calculateSalaryAndBonus() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary() + employee.bonus();
        }
        return sum;
    }

    public Employee getById(int id) {
        for (Employee employee : employees) {
            if (employee.id == id) {
                return employee;
            }
        }
        return null;
    }


    public Object getByName(String names) {
        for (int i = 0; i < employees.length; i++) {
            Employee empl = employees[i];
            if (empl.getByName().equals(empl.name)) {
                return names;
            }
        }
        return employees;
    }

   public void sortByName() {
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length; j++) {
                Employee temporary;
                if (employees[i].getByName().compareTo(employees[j].getByName()) > 0) {
                    temporary = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temporary;
                }
            }
        }
   }


    public void sortByNameAndSalary () {
        Employee sortName;
        for(int i = 0; i < employees.length; i++){
            for(int j = 0; j < employees.length; j++){
                if(employees[i].name.equals(employees[j].name) && employees[j].salary > employees[i].salary){
                    sortName = employees[i];
                    employees[i] = employees[j];
                    employees[j] = sortName;
                }
            }
        }
    }

   public Employee edit(Employee employee){
        Employee searchEmployee = getById(employee.id);
        Employee oldInformation = null;
       if (searchEmployee != null){
            for (int i = 0; i < employees.length; i++){
                if (employees[i].id == employee.id){
                    oldInformation = employees[i];
                    employees[i] = employee;
                    break;
                }
            }
        }
       return oldInformation;
   }




    Employee remove(int id){
        Employee deleteEmployee = getById(id);
        Employee[] modernEmployee = new Employee[employees.length-1];
        int j = 0;
        for (Employee value : employees) {
            if (!value.equals(deleteEmployee)) {
                modernEmployee[j] = value;
                j++;
            }
        }
        employees = modernEmployee;
        return deleteEmployee;
    }
}