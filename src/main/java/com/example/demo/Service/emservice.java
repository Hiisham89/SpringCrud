package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.Entity;

public interface emservice {

	List<Entity> findAllEmployee();
	Optional<Entity> findById(Long id);
	Entity saveEmployee(Entity eEntity);
	Entity updateEmployee(Entity eEntity);
	void deleteEmployee(Long id);
}