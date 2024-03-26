package veer.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {
        // Sample list of employees (replace this with your actual data)
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", 30, Gender.MALE, 50000));
        employees.add(new Employee(2, "Jane Smith", 35, Gender.FEMALE, 60000));
        employees.add(new Employee(3, "Mike Johnson", 28, Gender.MALE, 45000));
        employees.add(new Employee(4, "Emily Brown", 32, Gender.FEMALE, 55000));
        employees.add(new Employee(5, "Chris Lee", 40, Gender.MALE, 70000));

        // Count male and female employees
        long maleCount = employees.stream()
                .filter(emp -> emp.getGender() == Gender.MALE)
                .count();

        long femaleCount = employees.stream()
                .filter(emp -> emp.getGender() == Gender.FEMALE)
                .count();

        // Calculate average salary for male employees
        double averageMaleSalary = employees.stream()
                .filter(emp -> emp.getGender() == Gender.MALE)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        // Calculate average salary for female employees
        double averageFemaleSalary = employees.stream()
                .filter(emp -> emp.getGender() == Gender.FEMALE)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        // Print the results
        System.out.println("Number of male employees: " + maleCount);
        System.out.println("Number of female employees: " + femaleCount);
        System.out.println("Average salary for male employees: " + averageMaleSalary);
        System.out.println("Average salary for female employees: " + averageFemaleSalary);
    }

    // Enum for gender
    enum Gender {
        MALE,
        FEMALE
    }

    // Employee class
    static class Employee {
        private int id;
        private String name;
        private int age;
        private Gender gender;
        private double salary;

        // Constructor
        public Employee(int id, String name, int age, Gender gender, double salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.salary = salary;
        }

        // Getters
        public Gender getGender() {
            return gender;
        }

        public double getSalary() {
            return salary;
        }
    }
}
