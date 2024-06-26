package com.edu.em.student.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {

	private List<Student> students = new ArrayList<Student>();

	public Group() {
	}

	public Group(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public int hashCode() {
		return Objects.hash(students);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		return Objects.equals(students, other.students);
	}

}