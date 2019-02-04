package ro.jademy.springtut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.jademy.springtut.models.Employee;
import ro.jademy.springtut.repository.EmployeeRepository;

import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;


    @RequestMapping("/employees")
    public String employees(Model model) {

        model.addAttribute("employee", employeeRepository.findAll());
        return "employee";
    }

    @RequestMapping("/employees/{empNo}")
    public String employeesAll(@PathVariable(value = "empNo") int empNo, Model model) {

        Optional<Employee> empOpt = employeeRepository.findById(empNo);
        empOpt.ifPresent(employee -> model.addAttribute("employeeInfo", employee));

        return "employeeInfo";
    }

    @PutMapping("employees/{empNo}/edit")
    public ResponseEntity<Object> employeeEdit(@RequestBody Employee employee, @PathVariable int id) {

        Optional<Employee> employeeOptional = employeeRepository.findById(id);

        if (!employeeOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        employee.setId(id);
        employee.setFirstName("hue");

        employeeRepository.save(employee);

        return ResponseEntity.noContent().build();
    }


    @PutMapping("employees/{empNo}/delete")
    public String employeeDelete(@PathVariable(value = "empNo") int empNo, Model model) {

        employeeRepository.deleteById(empNo);
        model.addAttribute("deleted", empNo);
        return "deleted";
    }
}
