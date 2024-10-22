package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Student> students = new HashSet<>();
		
		System.out.print("How many students for course A?");
		int numberOfStudents = sc.nextInt();
		for(int i = 0; i < numberOfStudents; i++) {
			int id = sc.nextInt();
			students.add(new Student(id));
		}
		
		System.out.print("How many students for course B?");
		numberOfStudents = sc.nextInt();
		for(int i = 0; i < numberOfStudents; i++) {
			int id = sc.nextInt();
			students.add(new Student(id));
		}
		
		System.out.print("How many students for course C?");
		numberOfStudents = sc.nextInt();
		for(int i = 0; i < numberOfStudents; i++) {
			int id = sc.nextInt();
			students.add(new Student(id));
		}
		System.out.println("Total students: " + students.size());
		sc.close();
	}
}