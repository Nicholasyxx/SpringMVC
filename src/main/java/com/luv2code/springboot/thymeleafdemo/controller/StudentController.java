package com.luv2code.springboot.thymeleafdemo.controller;
import com.luv2code.springboot.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLOutput;

@Controller
public class StudentController {
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        // create a new student object
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent);


        return "student-form";
    }

    @PostMapping("processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
        //@ModelAttribute("student") Student theStudent告诉Spring MVC框架，
        // 应该把HTTP请求中的参数绑定到Student对象的属性上。这意味着，如果请求中有与Student类属性相匹配的参数
        // （例如，表单中有名为name的输入字段，Student类有一个name属性），Spring会自动将这些参数的值填充到theStudent对象的相应属性中。

        //log the input data
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());


        return "student-confirmation";
    }
}

















