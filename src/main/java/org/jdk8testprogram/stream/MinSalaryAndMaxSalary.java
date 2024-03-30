package org.jdk8testprogram.stream;

import org.common.Database;
import org.common.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinSalaryAndMaxSalary {
    public static void main(String[] args) {
        List<Employee> minimumSalary = Database.getEmployeeDetails()
                .stream()
                .filter(salary -> salary.getSalary() > 50000)
                .collect(Collectors.toList());
        System.out.println("minimumSalary"+minimumSalary);

        Optional<Employee> maxSalary = Database.getEmployeeDetails()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        //max salary
        System.out.println("Maximum Salary"+maxSalary.get());

        //second max
        Optional<Employee> secondMaxSalary = Database.getEmployeeDetails().stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed())
                .skip(1)
                .findFirst();
        System.out.println("Second MaxSalary" + secondMaxSalary.get());

        // System.out.println(employee);
    }
}
