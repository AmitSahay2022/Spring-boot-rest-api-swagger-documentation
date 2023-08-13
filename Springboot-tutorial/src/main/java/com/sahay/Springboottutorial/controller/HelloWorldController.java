package com.sahay.Springboottutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sahay.Springboottutorial.entity.Employee;
import com.sahay.Springboottutorial.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(
		name="Employee REST API",
		description = "these REST API is for creating, updating,deleating employee record"
	)

@RestController
public class HelloWorldController {
	@Autowired
	private EmployeeService employeeService;
	
	@Operation(
			 summary = "API to get greeting message ",
			 description = "something about method"
			)
	@ApiResponse(
			   responseCode = "200",
			   description = "HTTP status 200 OK"
			)
	
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {

		return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	}
	
	
	@Operation(
			 summary = "API to create employee object/recourse in database ",
			 description = "something about method"
			)
	@ApiResponse(
			   responseCode = "200",
			   description = "HTTP status 200 OK"
			)
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		return new ResponseEntity<>(employeeService.getEmployees(),HttpStatus.OK);
	}
}
