package employee.controllers;

import employee.Employee;
import employee.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")


public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
    @GetMapping
    public Collection<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/salary/sum")
    public Integer getSalarySum() {
        return employeeService.getSalarySum();
    }

    @GetMapping("/salary/min")
    public Employee getSalaryMin() {
        return employeeService.getSalaryMin();
    }

    @GetMapping("/salary/max")
    public Employee getSalaryMax() {
        return employeeService.getSalaryMax();
    }

    @GetMapping("/high-salary")
    public Collection<Employee> getSalaryAboveAverageEmployees() {
        return employeeService.getSalaryAboveAverageEmployees();
    }
}




