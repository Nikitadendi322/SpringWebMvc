package employee.Repository;

import employee.Employee;
import employee.service.EmployeeService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final List<Employee>employeeList=List.of(
            new Employee("Никита",100_000),
            new Employee("Катя",120_000),
            new Employee("Алексей",80_000),
            new Employee("Елена",300_000));


    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

}
