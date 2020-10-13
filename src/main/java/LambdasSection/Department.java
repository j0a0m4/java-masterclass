package LambdasSection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class Department {
    
    private final String name;
    private final List<Employee> employees;
    
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    
    public Department(String name, Employee... employee) {
        this(name);
        this.addEmployee(employee);
    }
    
    public String getName() {
        return name;
    }
    
    public List<Employee> getEmployees() {
        return employees;
    }
    
    
    public Department addEmployee(Employee... employee) {
        Collections.addAll(this.employees, employee);
        return this;
    }
    
    public Department addEmployeeList(List<Employee> employees) {
        employees.forEach(this::addEmployee);
        return this;
    }
    
    public static Collector<Employee, Department, Department> toCollector(String name) {
        return Collector.of(() -> new Department(name),
                            Department::addEmployee,
                            (department, department2) -> department
                                    .addEmployeeList(department2.getEmployees()));
    }
    
}
