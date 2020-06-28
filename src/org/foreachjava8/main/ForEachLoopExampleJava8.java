package org.foreachjava8.main;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.function.Consumer;

import org.foreachjava8.model.Student;

public class ForEachLoopExampleJava8 {

	public static void main(String args[]) {

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "RAJESH"));
		studentList.add(new Student(1, "SHAM"));
		studentList.add(new Student(1, "ANDY"));
		studentList.add(new Student(1, "ALI"));

		// @@@ Iteration Consumer Interface example@@@
		Consumer<Student> printStudent = new Consumer<Student>() {
			public void accept(Student student) {
				System.out.println(student.getName());
			};
		};
		studentList.forEach(printStudent);
		// --------------------------------------------

		// @@@ Iteration Method Reference example@@@
		studentList.forEach(System.out::println);
		// --------------------------------------------

		// @@@ Iteration over List example@@@

		studentList.forEach(student -> {
			System.out.println(student.getName());
		});
		// --------------------------------------------

		// @@@ Iteration over Set example@@@

		Set<String> uniquesurName = new HashSet<>(Arrays.asList("RAM", "SAM", "CAN", "ABHISHEK"));
		uniquesurName.forEach(System.out::println);
		// --------------------------------------------

		// @@@ Iteration over Map example@@@

		Map<Integer, String> studentNamesMap = new HashMap<>();
		studentNamesMap.put(1, "RAHUL");
		studentNamesMap.put(2, "AMAN");
		studentNamesMap.put(3, "REENA");
		studentNamesMap.forEach((key, value) -> System.out.println(key + " " + value));
		// --------------------------------------------

		// @@@ Iteration over Map example@@@
		Queue<String> namesQueue = new ArrayDeque<>(Arrays.asList("RAM", "SAM", "ABHISHEK"));
		namesQueue.forEach(System.out::println);
		// --------------------------------------------

	}

}
