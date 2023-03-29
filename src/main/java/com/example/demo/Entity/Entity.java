package com.example.demo.Entity;

//import javax.persistence.*;
import java.util.Date;
import jakarta.persistence.*;


@jakarta.persistence.Entity
@Table(name= "mcit_employee")

public class Entity {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "data_of_birth")
	private Date dateofbirth;
	
	@Column(name = "address")
	private String address;
	
	public Entity() {
		
		
	}
	
	public Entity(Long id, String name, String gender, Date dateofbirth, String address) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateofbirth = dateofbirth;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}