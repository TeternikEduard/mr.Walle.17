package com.edu.em.student.view;

import java.util.List;

import com.edu.em.student.entity.Student;

public class View {
	public void printGroup(String mess, List<Student> student) {
		System.out.println(mess);
		String report = "";

		report = report + "---------------------------------------------------------------------\n";
		for (Student students : student) {
			report = report + students.getName() + ", группа номер: " + students.getGroup() + ", оценки: "
					+ students.getGrade() + "\n";
		}
		report = report + "---------------------------------------------------------------------";

		System.out.println(report);
	}
}