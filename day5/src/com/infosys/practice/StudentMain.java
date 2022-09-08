package com.infosys.practice;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		student.setRoll(1);
		student.setName("Ramesh");
		String subjects[] = { "English", "Maths", "Sc" };
		student.setSubjects(subjects);
		int marks[] = { 49, 90, 67 };
		student.setScores(marks);
		System.out.println("The details");
		System.out.println(student.getRoll());
		System.out.println(student.getName());
		subjects = student.getSubjects();
		marks = student.getScores();
		for(int i=0;i<subjects.length;i++) {
			System.out.println(subjects[i]+"\t"+marks[i]);
			
		}
		System.out.println(student.getGrade());

	}
}
