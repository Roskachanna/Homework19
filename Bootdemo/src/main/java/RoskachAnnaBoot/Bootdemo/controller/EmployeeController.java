package RoskachAnnaBoot.Bootdemo.controller;

import RoskachAnnaBoot.Bootdemo.model.Employee;
import RoskachAnnaBoot.Bootdemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstName, @RequestParam String lastName){
        return employeeService.addEmployee(firstName, lastName);
    }
    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam String firstName, @RequestParam String lastName){
        return employeeService.removeEmployee(firstName, lastName);
    }
    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String firstName, @RequestParam String lastName){
        return employeeService.findEmployee(firstName, lastName);
    }
    @GetMapping
    public Employee[] getAllEmployees(){
        return employeeService.getAllEmployees();
    }


}
