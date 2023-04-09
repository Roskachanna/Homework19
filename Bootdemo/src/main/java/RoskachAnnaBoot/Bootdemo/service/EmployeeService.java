package RoskachAnnaBoot.Bootdemo.service;

import RoskachAnnaBoot.Bootdemo.model.Employee;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastname);
    Employee removeEmployee(String firstName, String lastname);
    Employee findEmployee(String firstName, String lastname);
    Employee[] getAllEmployees();
}
