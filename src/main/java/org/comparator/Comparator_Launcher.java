package org.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparator_Launcher {

    public static void main(String[] args) {


        List<Student> l = getEmployees();
        /*
         * Comapring the firstname
         */
        // l.sort(Comparator.comparing(e -> e.getFirstName() ));
        // l.sort(Comparator.comparing(ComparatorTest::getFirstName));
        // Comparator<ComparatorTest>
        // comparator=Comparator.comparing(ComparatorTest::getFirstName);
        /*
         * //Moren then values compare
         */
        Comparator<Student> comparator = Comparator.comparing(Student::getId)
                .thenComparing(Student::getFirstName);
        // l.sort(comparator.reversed());
        /*
         * Parellel Processing
         */
        Student[] emp = l.toArray(new Student[l.size()]);
        Arrays.parallelSort(emp, comparator);
        // l.sort(comparator);
        System.out.println(l);
    }

    private static List<Student> getEmployees() {
        List<Student> employees = new ArrayList();
        employees.add(new Student(6, "Yash", "Chopra", 25));
        employees.add(new Student(2, "Aman", "Sharma", 28));
        employees.add(new Student(3, "Aakash", "Yaadav", 52));
        employees.add(new Student(5, "David", "Kameron", 19));
        employees.add(new Student(4, "James", "Hedge", 72));
        employees.add(new Student(8, "Balaji", "Subbu", 88));
        employees.add(new Student(7, "Karan", "Johar", 59));
        employees.add(new Student(1, "Lokesh", "Gupta", 32));
        employees.add(new Student(9, "Vishu", "Bissi", 33));
        employees.add(new Student(10, "Lokesh", "Ramachandran", 60));
        return employees;
    }
}