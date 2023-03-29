package com.example.demo.Service.impl;

import com.example.demo.Entity.Entity;
import com.example.demo.Repository.emRepository;
import com.example.demo.Service.emservice;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class Serviceimpl implements emservice {
	
	private final  emRepository emplrepository;

	public Serviceimpl(emRepository emplrepository) {
		
		this.emplrepository = emplrepository;
	}

	@Override
	public List<Entity> findAllEmployee() {
		// TODO Auto-generated method stub
		return emplrepository.findAll();
	}

	@Override
	public Optional<Entity> findById(Long id) {
		// TODO Auto-generated method stub
		return emplrepository.findById(id);
	}

	@Override
	public Entity saveEmployee(Entity eEntity) {
		// TODO Auto-generated method stub
		return emplrepository.save(eEntity);
	}

	@Override
	public Entity updateEmployee(Entity eEntity) {
		// TODO Auto-generated method stub
		return emplrepository.save(eEntity);
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		emplrepository.deleteById(id);
		
	}

}