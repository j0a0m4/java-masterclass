package LambdasSection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Printing from the Runnable"))
                .start();
        
        List<Employee> employeeList = new ArrayList<>();
        
        Collections.addAll(employeeList,
                           new Employee("joão", 25),
                           new Employee("marina", 20));
        
        employeeList
                .forEach(System.out::println);
    }
}
