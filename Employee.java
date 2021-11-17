package com.company;

public class Employee implements Employee_task {
    int id;
    String name;
    int age;
    int salary;
    String gender;
    int fixedBugs;
    double defaultBugRate;

    public Employee(int id, String name, int age, int salary, String gender, int fixedBugs, double defaultBugRate){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
    }

    double bonus(){
        return (getFixedBugs() - getDefaultBugRate() / 100);
    }


    public int getById(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getByName(){
        return name;
    }

    public void setByName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public double getDefaultBugRate() {
        return defaultBugRate;
    }

    public void setDefaultBugRate(double defaultBugRate) {
        this.defaultBugRate = defaultBugRate;
    }

    public Object getBonus(){
        return null;
    }
}