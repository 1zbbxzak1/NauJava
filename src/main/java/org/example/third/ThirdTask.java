package org.example.third;

import org.example.third.dto.Employee;
import org.example.third.example.EmployeeList;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;

public class ThirdTask {
    private final PrintStream out;
    private final ArrayList<Employee> employees;

    public ThirdTask(PrintStream out) {
        this.out = out;
        this.employees = new EmployeeList().employeeArrayList();
    }

    public void thirdTask() {
        out.println("===== Third Task =====");

        employees.stream().filter(employee -> employee.getAge() > 30)
                .sorted(Comparator.comparing(Employee::getAge))
                .toList()
                .forEach(out::println);
    }
}
