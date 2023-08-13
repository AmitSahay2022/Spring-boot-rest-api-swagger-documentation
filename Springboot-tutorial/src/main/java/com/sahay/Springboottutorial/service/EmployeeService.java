package com.sahay.Springboottutorial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sahay.Springboottutorial.entity.Employee;

@Service
public class EmployeeService {
   List<Employee> employees=new ArrayList<>();
   public List<Employee> getEmployees() {
	   employees.add(new Employee(1, "Amit", "Patna"));
	   employees.add(new Employee(2, "Sumit", "Patna"));
	   employees.add(new Employee(3, "Sunny", "Delhi"));
	   employees.add(new Employee(4, "Katrina", "Mumbai"));
	   employees.add(new Employee(5, "Leah", "Kolkata"));
	   employees.add(new Employee(6, "Amanda", "Ranchi"));
	   return employees;
   }
}
