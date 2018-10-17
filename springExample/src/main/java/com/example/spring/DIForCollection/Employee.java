package com.example.spring.DIForCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private List<String> names;
	private Set<Double> salaries;
	private Map<String, String> projects;
	private Properties age;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Set<Double> getSalaries() {
		return salaries;
	}

	public void setSalaries(Set<Double> salaries) {
		this.salaries = salaries;
	}

	public Map<String, String> getProjects() {
		return projects;
	}

	public void setProjects(Map<String, String> projects) {
		this.projects = projects;
	}

	public Properties getAge() {
		return age;
	}

	public void setAge(Properties age) {
		this.age = age;
	}

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
