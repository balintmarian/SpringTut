package ro.jademy.springtut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.jademy.springtut.models.Employee;
import ro.jademy.springtut.repository.EmployeeRepository;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;


    @RequestMapping("/employees/all")
    public String employees(Model model) {

        model.addAttribute("employee",employeeRepository.findAll());
        return "employee";
    }

}
