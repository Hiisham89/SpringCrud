package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Entity;

@Repository
public interface  emRepository extends JpaRepository<Entity ,Long> {

}