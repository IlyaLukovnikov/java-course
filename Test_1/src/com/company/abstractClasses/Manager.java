package com.company.abstractClasses;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, double salary, int year, int month, int day, int bonus) {
        super(name, salary, year, month, day);
        this.bonus = bonus;
    }

    public Manager(String name, double salary) {
        super(name, salary);
    }



    public boolean equals(Object otherObj) {
        if (!super.equals(otherObj)) return false;

        Manager other = (Manager) otherObj;
        return bonus == other.bonus;
    }

    @Override
    public String toString() {
        return super.toString()
                + "[bonus=" + bonus
                + "]";
    }
}
