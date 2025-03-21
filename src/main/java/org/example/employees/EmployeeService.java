package org.example.employees;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    public static List<Employee> getTopHighestPaid (List<Employee> employees) {
        return employees.stream()
                .sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .limit(3)
                .collect(Collectors.toList());
    }
}
