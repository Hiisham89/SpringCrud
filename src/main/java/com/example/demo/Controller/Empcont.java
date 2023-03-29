package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Entity;
import com.example.demo.Service.emservice;

@RestController
@RequestMapping("/employee")
public class Empcont {
	
	private final emservice emplservice; 
	

	public Empcont(emservice emplservice) {

		this.emplservice = emplservice;
	}

	@GetMapping
	public List<Entity> findAllEmployee() {
		// TODO Auto-generated method stub
		return emplservice.findAllEmployee();
	}

	@GetMapping("/{id}")
	public Optional<Entity> findEmployeeById(@PathVariable("id")Long id) {
		// TODO Auto-generated method stub
		return emplservice.findById(id);
	}

	@PostMapping
	public Entity saveEmployee(@RequestBody Entity eEntity) {
		// TODO Auto-generated method stub
		return emplservice.saveEmployee(eEntity); 
	}

	@PutMapping
	public Entity updateEmployee(@RequestBody Entity eEntity) {
		// TODO Auto-generated method stub
		return emplservice.updateEmployee(eEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		emplservice.deleteEmployee(id);
		
	}
}
