package com.jva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Employee {

	

		private int id;
		private String name;
		private double salary;
		private LocalDate dob;
		
		
		public Employee(int id, String name, double salary, LocalDate dob) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.dob = dob;
		}
	

		public Employee() {}
	

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
	

		public LocalDate getDob() {
			return dob;
		}
	

		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
	

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Employee[id:"+id +", name:"+name+", salary:"+salary+", DOB:"+dob+"]";
		};
		
		
		
		
	}












