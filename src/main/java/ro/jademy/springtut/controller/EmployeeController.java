package ro.jademy.springtut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.jademy.springtut.models.Employee;
import ro.jademy.springtut.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;


    @RequestMapping("/employees/all")
    public String employees(Model model) {

        model.addAttribute("employee", employeeRepository.findAll());
        return "employee";
    }

    @RequestMapping("/employeeinfo/{empNo}")
    public String employee(@PathVariable(value = "empNo") int empNo, Model model) {
//        List<Employee> employees = employeeRepository.findAll();
//        List<Employee> employeeInfoList;
//        employeeInfoList = employees.stream().filter(employee -> employee.getId()==empNo).collect(Collectors.toList());
//        //model.addAttribute("employeeInfo",employeeRepository.findById(empNo));
//        model.addAttribute("employeeInfo",employeeInfoList);
        //employeeRepository.findById(empNo);
        model.addAttribute("employeeInfo", employeeRepository.findAll());


        return "employeeInfo";
    }

}
