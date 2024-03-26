package veer.com;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class HighestPaidEmployeeForEachDepartment {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "HR", 60000));
        employees.add(new Employee(2, "Jane Smith", "HR", 65000));
        employees.add(new Employee(3, "Mike Johnson", "IT", 70000));
        employees.add(new Employee(4, "Emily Brown", "IT", 75000));
        employees.add(new Employee(5, "Chris Lee", "Finance", 80000));
        employees.add(new Employee(6, "Emma White", "Finance", 85000));

        Map<String, Optional<Employee>> highestPaidEmployeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        highestPaidEmployeesByDept.forEach((dept, emp) ->
                System.out.println("Highest paid employee in department " + dept + ": " + emp.orElse(null)));
    }
}
