package employee.service;


import employee.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployees();


    Integer getSalarySum();

    Employee getSalaryMin();

    Employee getSalaryMax();

    Collection<Employee> getSalaryAboveAverageEmployees();
}






