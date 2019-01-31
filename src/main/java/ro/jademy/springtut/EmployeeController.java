package ro.jademy.springtut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.jademy.springtut.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;


    @RequestMapping("/employees/all")
    public String employees(Model model) {
        List<Employee> employeeList ;
//       Optional<Employee> =
        model.addAttribute("employee",employeeRepository.findAll());

        return "employee";
    }

}
