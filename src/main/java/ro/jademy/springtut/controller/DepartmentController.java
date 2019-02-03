package ro.jademy.springtut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.jademy.springtut.repository.DepartmentsRepository;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentsRepository departmentsRepository;

    @RequestMapping(name = "/departments")
    public String departments(Model model) {

        model.addAttribute("department",departmentsRepository.findAll());
        return "department";
    }
}
