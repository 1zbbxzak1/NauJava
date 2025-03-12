package org.example.third.example;

import org.example.third.dto.Employee;

import java.util.ArrayList;

public class EmployeeList {
    public ArrayList<Employee> employeeArrayList() {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Иван Иванов", 30, "IT", 85000.0));
        employees.add(new Employee("Мария Петрова", 25, "HR", 60000.0));
        employees.add(new Employee("Алексей Смирнов", 40, "Finance", 95000.0));
        employees.add(new Employee("Ольга Соколова", 35, "Marketing", 72000.0));
        employees.add(new Employee("Дмитрий Кузнецов", 28, "IT", 78000.0));
        employees.add(new Employee("Наталья Белова", 32, "Finance", 87000.0));
        employees.add(new Employee("Сергей Воронов", 45, "IT", 110000.0));
        employees.add(new Employee("Екатерина Миронова", 29, "HR", 65000.0));
        employees.add(new Employee("Андрей Климов", 50, "Management", 120000.0));
        employees.add(new Employee("Татьяна Романова", 27, "Marketing", 71000.0));
        employees.add(new Employee("Константин Лебедев", 31, "IT", 92000.0));
        employees.add(new Employee("Юлия Ткаченко", 26, "Finance", 89000.0));
        employees.add(new Employee("Владимир Орлов", 38, "HR", 73000.0));
        employees.add(new Employee("Оксана Кравцова", 41, "IT", 97000.0));
        employees.add(new Employee("Григорий Седов", 36, "Management", 125000.0));
        employees.add(new Employee("Анна Васильева", 30, "Finance", 86000.0));
        employees.add(new Employee("Роман Ефимов", 34, "IT", 93000.0));
        employees.add(new Employee("Ирина Колесникова", 28, "HR", 68000.0));
        employees.add(new Employee("Павел Зайцев", 37, "Marketing", 75000.0));
        employees.add(new Employee("Елена Гордеева", 39, "Management", 115000.0));

        return employees;
    }
}
