package com.example.employeeapp.controller;

import com.example.employeeapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "home"; // refers to home.html
    }
}
