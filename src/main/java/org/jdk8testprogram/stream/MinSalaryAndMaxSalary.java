package org.jdk8testprogram.stream;

import org.common.Database;
import org.common.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinSalaryAndMaxSalary {
    public static void main(String[] args) {
        List<Employee> employee = Database.getEmployeeDetails()
                .stream()
                .filter(salary -> salary.getSalary() > 50000)
                .collect(Collectors.toList());

        Optional<Employee> maxSalary = Database.getEmployeeDetails()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        //max salary
        System.out.println("maxSalary"+maxSalary.get());

        //second max
        Optional<Employee> secondMaxSalary = Database.getEmployeeDetails().stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed())
                .skip(1)
                .findFirst();
        System.out.println("SECOND maxSalary" + secondMaxSalary.get());

        // System.out.println(employee);
    }
}
