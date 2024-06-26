package com.edu.em.student.logic;

import java.util.ArrayList;
import java.util.List;

import com.edu.em.student.entity.Group;
import com.edu.em.student.entity.Student;

public class GroupLogic {

	public boolean findBestGrades(Student student) {
		List<Integer> grades = student.getGrade();

		for (int grade : grades) {
			if (grade <= 8) {
				return false;
			}
		}
		return true;
	}

	public List<Student> findBestStud(Group group) {
		List<Student> students = group.getStudents();

		List<Student> theBest = new ArrayList<>();
		for (Student student : students) {
			if (findBestGrades(student)) {
				theBest.add(student);
			}
		}
		return theBest;
	}
}
