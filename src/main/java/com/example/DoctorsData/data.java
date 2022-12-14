package com.example.DoctorsData;

public class data {
	private int id;
	private String name;
	private double salary;
	private String specialist;
	
	public data(int id, String name, double salary, String specialist) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.specialist = specialist;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getSpecialist() {
	return specialist;
}
public void setSpecialist(String specialist) {
	this.specialist = specialist;
}

@Override
public String toString() {
	return "data [id=" + id + ", name=" + name + ", salary=" + salary + ", specialist=" + specialist + "]";
}
}
