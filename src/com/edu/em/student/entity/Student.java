package com.edu.em.student.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

	private String name;
	private String group;
	private List<Integer> grade = new ArrayList<Integer>();

	public Student() {
	}

	public Student(String name, String group, List<Integer> grade) {
		this.name = name;
		this.group = group;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public List<Integer> getGrade() {
		return grade;
	}

	public void setGrade(List<Integer> grade) {
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(grade, group, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(grade, other.grade) && Objects.equals(group, other.group)
				&& Objects.equals(name, other.name);
	}

}
