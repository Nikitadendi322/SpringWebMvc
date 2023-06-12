package employee.service;

import employee.Employee;
import employee.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

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

    }

    @Override
    public double getSalaryMin() {
        double sum = employees.get(0).getSalarySum();
        for (Employee employee : employees) {
            if (employee.getSalarySum() < sum) {
                sum = employee.getSalarySum();
            }
        }return sum;

    }


    @Override
    public int getSalaryMax() {
        int length = 0;
        for (Employee employee : employees) {
            if (length < employee.getSalary(0).length()) {
                length = employee.getSalarySum().length();
            }
        }return length;

    }


    @Override
    public Collection<Employee> getSalaryAboveAverageEmployees() {
        return getSalaryAboveAverageEmployees();
    }
}
