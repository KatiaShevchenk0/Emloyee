package com.company;
import java.util.Random;

public class EmployeeFactory {

    public static Employee[] generateEmployees(int size){
    Employee[] randomEmployee = new Employee[size];
    Random random = new Random();

  // Всі імена не залежно від полу
    String[] names = {"Margarita", "Nikita", "Katia", "Tania", "Julia", "Andriy", "Olia", "Sergey"};

         for(int i = 0; i < randomEmployee.length; i++) {
             int averageSalary = 3_000;
             String name = names[random.nextInt(names.length)];
             int salary = random.nextInt(10_000) + averageSalary;
             String gender = "Female";
             if (names.equals("Nikita") || names.equals("Andriy") || names.equals("Sergey")) {
                 gender = "Male";
             }
             int fixedBugs = random.nextInt(50);
             int age = random.nextInt(100);
             double defaultBugRate = random.nextDouble();
             randomEmployee[i]  = new Employee(i + 1, name, age, salary, gender, fixedBugs, defaultBugRate);
             }

         return randomEmployee;

    }
}