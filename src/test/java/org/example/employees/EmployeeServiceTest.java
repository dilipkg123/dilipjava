package org.example.employees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class EmployeeServiceTest {

    @Test
    public void testTop3Employees_normalCase(){

        List<Employee> employees = Arrays.asList(
                new Employee("Aliece",10000),
                new Employee("Bob",20000),
                new Employee("Charlie",30000),
                new Employee("David",40000),
                new Employee("Dev",45000)
        );
        List<Employee> top3 = EmployeeService.getTopHighestPaid(employees);
        assertEquals(3,top3.size());
        assertEquals("Dev",top3.get(0).getName());
        assertEquals("David",top3.get(1).getName());
        assertEquals("Charlie",top3.get(2).getName());
    }

    @Test
    public void testTop3Employees_lessThan3Employees() {
        List<Employee> employees = Arrays.asList(
                new Employee("Tom", 70000),
                new Employee("Jerry", 80000)
        );

        List<Employee> top3 = EmployeeService.getTopHighestPaid(employees);
        assertEquals(2, top3.size());
        assertEquals("Jerry", top3.get(0).getName());
        assertEquals("Tom", top3.get(1).getName());
    }

    @Test
    public void testTop3Employees_emptyList() {
        List<Employee> top3 = EmployeeService.getTopHighestPaid(List.of());
        assertTrue(top3.isEmpty());
    }
}
