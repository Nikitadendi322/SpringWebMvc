package employee.service;

import employee.Employee;
import employee.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public Integer getSalarySum() {
        return null;
    }

    @Override
    public Employee getSalaryMin() {
        return null;
    }

    @Override
    public Employee getSalaryMax() {
        return null;
    }

    @Override
    public Collection<Employee> getSalaryAboveAverageEmployees() {
        return null;
    }
}
