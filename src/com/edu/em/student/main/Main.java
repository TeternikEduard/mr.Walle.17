package com.edu.em.student.main;

import java.util.Arrays;
import java.util.List;

import com.edu.em.student.entity.Group;
import com.edu.em.student.entity.Student;
import com.edu.em.student.logic.GroupLogic;
import com.edu.em.student.view.View;

public class Main {

	public static void main(String[] args) {

		Group group = new Group();

		group.addStudent(new Student("Дорофеев А.А.", "114_211", Arrays.asList(9, 9, 10, 8, 9)));
		group.addStudent(new Student("Миронов О.А.", "114_211", Arrays.asList(9, 9, 10, 8, 9)));
		group.addStudent(new Student("Лукин К.И.", "114_211", Arrays.asList(5, 9, 10, 9, 9)));
		group.addStudent(new Student("Тетерник В.В.", "114_214", Arrays.asList(10, 9, 9, 9, 10)));
		group.addStudent(new Student("Молчанова К.Б.", "114_214", Arrays.asList(7, 9, 9, 8, 9)));
		group.addStudent(new Student("Романов Е.И.", "114_214", Arrays.asList(10, 8, 9, 9, 8)));
		group.addStudent(new Student("Баранов Г.М.", "114_211", Arrays.asList(7, 7, 8, 7, 9)));
		group.addStudent(new Student("Титова Е.И.", "114_214", Arrays.asList(10, 6, 9, 9, 7)));
		group.addStudent(new Student("Назаров К.Э.", "114_211", Arrays.asList(9, 9, 9, 10, 9)));
		group.addStudent(new Student("Гришин М.А.", "114_211", Arrays.asList(7, 9, 8, 9, 9)));
		group.addStudent(new Student("Прокапенко В.А.", "114_214", Arrays.asList(10, 10, 10, 9, 10)));

		GroupLogic logic = new GroupLogic();
		View view = new View();
		
		view.printGroup("Вся группа:", group.getStudents());

		List<Student> bestStudents = logic.findBestStud(group);

		view.printGroup("Лучшие студенты:", bestStudents);

	}
}