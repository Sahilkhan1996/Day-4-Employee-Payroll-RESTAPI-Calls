package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.model.EmployeeModel;
import com.bridgelabz.employeepayrollapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeePayrollController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/") //GET http://localhost:8989/
    public String get() {
        return "Welcome to the Employee Wage program";
    }

    @PostMapping("/add") //POST http://localhost:8989/add JSON {"name":"Sahil4","salary":"1400"}
    public EmployeeModel addingEmployee(@RequestBody EmployeeModel employeeModel) {
        return employeeService.addingEmp(employeeModel);
    }

    @GetMapping("/get/{id}") //GET http://localhost:8989/get/106
    public EmployeeModel get(@PathVariable long id) {
        return employeeService.getEmpDataWithId(id);
    }

    @PutMapping("/update/{id}") //PUT http://localhost:8989/update/101 JSON {"name":"Ruksar","salary":"10"}
    public EmployeeModel updateEmployeeData(@PathVariable long id, @RequestBody EmployeeModel employeeModel) {
        return employeeService.updateEmpData(id, employeeModel);
    }

    @DeleteMapping("delete/{id}") //DELETE http://localhost:8989/delete/104
    public String deleteEmployeeData(@PathVariable long id) {
        return employeeService.deleteEmpData(id);
    }

    @GetMapping("/getAll") //GET http://localhost:8989/get/106
    public List<EmployeeModel> getAllData(){
        return employeeService.getEmpAllData();
    }
}
