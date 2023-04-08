package RoskachAnnaBoot.Bootdemo.service.impl;

import RoskachAnnaBoot.Bootdemo.exception.EmployeeAlreadyAddedException;
import RoskachAnnaBoot.Bootdemo.exception.EmployeeNotFoundException;
import RoskachAnnaBoot.Bootdemo.exception.EmployeeStorageIsFullException;
import RoskachAnnaBoot.Bootdemo.model.Employee;
import RoskachAnnaBoot.Bootdemo.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Employee[] employees;

    public EmployeeServiceImpl() {
        employees = new Employee[5];
    }

    @Override
    public Employee addEmployee(String firstName, String lastname) {
        Employee employee = new Employee(firstName, lastname);
        if (employee != null) {
            throw new EmployeeAlreadyAddedException();
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return employee;
            }

        }
        throw new EmployeeStorageIsFullException();
    }

    @Override
    public Employee removeEmployee(String firstName, String lastname) {
        Employee employee = new Employee(firstName, lastname);
        if (employee == null) {
            throw new EmployeeNotFoundException();

        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].equals(employee)) {
                employees[i] = null;
            }
        }
        return employee;
    }

    @Override
    public Employee findEmployee(String firstName, String lastname) {
        Employee employee = new Employee(firstName, lastname);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].equals(employee)) {
                return employees[i];
            }
        }
        throw new EmployeeNotFoundException;
    }

    @Override
    public Employee[] getAllEmployees() {
        return employees;
    }
}
