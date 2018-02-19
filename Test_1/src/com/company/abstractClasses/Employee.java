package com.company.abstractClasses;

import java.time.LocalDate;

public class Employee extends Person implements Comparable<Employee>{

    private double salary;
    private LocalDate hireDay;

    ///////////////////////////////////////////// Constructors//////////////////////////////////////////////////////////
    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }


    //////////////////////////////////////////////Methods///////////////////////////////////////////////////////////////
    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }


    public boolean equals(Object otherObj) {
        if(this == otherObj) return true;

        if(otherObj == null) return false;

        if(getClass() != otherObj.getClass()) return false;

        Employee other = (Employee) otherObj;

        return getName().equals(other.getName())
                && salary == other.salary
                && hireDay.equals(other.hireDay);
    }

    public String toString (){
        return  getClass().getSimpleName()
                +"[name = " + getName()
                + ",salary = " + salary
                + ",hireDay = " + hireDay
                + "]";
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
