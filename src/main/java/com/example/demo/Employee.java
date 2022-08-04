package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.Getter;

@Entity
@Table(name="emp")
public class Employee {
	
public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
public Employee(int id, String name, String dept, String department) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.designation = department;
	}
//	public Employee(int i, String string, String string2, String string3) {
//		// TODO Auto-generated constructor stub
//	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", department=" + designation + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDepartment() {
		return designation;
	}
	public void setDepartment(String department) {
		this.designation = department;
	}
	@Id
	int id;
	
	@Column(name="name")
	String name;
	@Column(name="dept")
	String dept;
	
	@Column(name="designation")
	String designation;

}
