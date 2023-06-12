package employee.service;

import employee.Employee;
import employee.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private Employee[] employees;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public Integer getSalarySum() {
        return employeeRepository.getAllEmployees().stream().mapToInt(Employee::getSalary).sum();
    }

    @Override
    public double getSalaryMin() {
        return employeeRepository.getAllEmployees().stream().min(Comparator.comparingInt(Employee::getSalary)).orElse(null).getSalary();

    }


    @Override
    public int getSalaryMax() {
        return employeeRepository.getAllEmployees().stream().max(Comparator.comparingInt(Employee::getSalary)).orElse(null).getSalary();

    }


    @Override
    public Collection<Employee> getSalaryAboveAverageEmployees() {
        double average = employeeRepository.getAllEmployees().stream().mapToInt(Employee::getSalary).average().orElse(00);
        return employeeRepository.getAllEmployees().stream().filter(employee -> employee.getSalary()>average).collect(Collectors.toList());
    }
}
