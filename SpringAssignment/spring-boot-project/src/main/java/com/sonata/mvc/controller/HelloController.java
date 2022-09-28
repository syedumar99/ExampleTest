package com.sonata.mvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.mvc.model.Employee;
import com.sonata.mvc.repository.SampleRepository;

@RestController
public class HelloController {
	Optional<Employee> e1;
	
	@Autowired
	private SampleRepository prepository;

	@RequestMapping("/")
	public String sayHi() {
		return "This is a spring controller";
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return prepository.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity getEmployeesById(@PathVariable(value="id")Long empid) {
		e1 = prepository.findById(empid);
		return ResponseEntity.ok().body(e1);
	}
	
	@PostMapping(value="/employees")
	public Employee savEmployee(@RequestBody Employee emp) {
		return prepository.save(emp);
	}
	
	@PutMapping(value="/employees/{id}")
	public ResponseEntity updateEmployee(@PathVariable(value="id") Long empid,
	        @Validated @RequestBody Employee edata) {
	    e1 = prepository.findById(empid);
	    Employee e2 = e1.get();
	    e2.setEmpid(edata.getEmpid());
	    e2.setEmpname(edata.getEmpname());
	    e2.setEmpsal(edata.getEmpsal());
	    
	    Employee updateEmployee = prepository.save(e2);
	    return ResponseEntity.ok(updateEmployee);
	}
	
	@DeleteMapping(value="/employee/{id}")
	public ResponseEntity deleteEmployee(@PathVariable(value="id")Long empid) {
		prepository.deleteById(empid);
		return ResponseEntity.noContent().build();
	}

}