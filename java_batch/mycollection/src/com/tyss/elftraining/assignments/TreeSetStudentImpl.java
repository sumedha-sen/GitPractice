package com.tyss.elftraining.assignments;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetStudentImpl {
	public static void main(String[] args) {

		System.out.println("Choose\n1.sorting by id\n2. sorting by name\n3.sorting by marks\n" +
		"4.sorting by age");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			TreeSet<Student> stdid = new TreeSet<>();
			stdid.add(new Student(12, "krish", 98.12, 13));
			stdid.add(new Student(13, "pooja", 99.23, 10));
			stdid.add(new Student(14, "kiran", 23.23, 11));
			stdid.add(new Student(15, "rakhshit", 56.23, 13));
			stdid.add(new Student(16, "priyanka", 89.12, 15));
			stdid.add(new Student(17, "priyanka", 78.12, 18));
			stdid.add(new Student(18, "pooja", 89.12, 15));
			stdid.add(new Student(19, "pankaj", 56.14, 20));
			stdid.add(new Student(20, "sumera", 78.56, 25));
			stdid.add(new Student(21, "shubham", 45.65, 23));

			Iterator<Student> itr = stdid.iterator();
			for (Student student : stdid) {
				System.out.println(student);
			}

			break;
		case 2:
			SortByName name = new SortByName();
			TreeSet<Student> std = new TreeSet(name);
			std.add(new Student(12, "krish", 98.12, 13));
			std.add(new Student(13, "pooja", 99.23, 10));
			std.add(new Student(14, "kiran", 23.23, 11));
			std.add(new Student(15, "rakhshit", 56.23, 13));
			std.add(new Student(16, "priyanka", 89.12, 15));
			std.add(new Student(17, "priyanka", 78.12, 18));
			std.add(new Student(18, "pooja", 89.12, 15));
			std.add(new Student(19, "pankaj", 56.14, 20));
			std.add(new Student(20, "sumera", 78.56, 25));
			std.add(new Student(21, "shubham", 45.65, 23));

			 itr = std.iterator();
			for (Student student : std) {
				System.out.println(student);
			}

			break;
		case 3:
			SortByMarks marks= new SortByMarks();
			TreeSet<Student> std1 = new TreeSet(marks);
			std1.add(new Student(12, "krish", 98.12, 13));
			std1.add(new Student(13, "pooja", 99.23, 10));
			std1.add(new Student(14, "kiran", 23.23, 11));
			std1.add(new Student(15, "rakhshit", 56.23, 13));
			std1.add(new Student(16, "priyanka", 89.12, 15));
			std1.add(new Student(17, "priyanka", 78.12, 18));
			std1.add(new Student(18, "pooja", 89.12, 15));
			std1.add(new Student(19, "pankaj", 56.14, 20));
			std1.add(new Student(20, "sumera", 78.56, 25));
			std1.add(new Student(21, "shubham", 45.65, 23));

			 itr = std1.iterator();
			for (Student student : std1) {
				System.out.println(student);
			}

			break;
		case 4: SortByAge age = new SortByAge();
		TreeSet<Student> std2 = new TreeSet(age);
		std2.add(new Student(12, "krish", 98.12, 13));
		std2.add(new Student(13, "pooja", 99.23, 10));
		std2.add(new Student(14, "kiran", 23.23, 11));
		std2.add(new Student(15, "rakhshit", 56.23, 13));
		std2.add(new Student(16, "priyanka", 89.12, 15));
		std2.add(new Student(17, "priyanka", 78.12, 18));
		std2.add(new Student(18, "pooja", 89.12, 15));
		std2.add(new Student(19, "pankaj", 56.14, 20));
		std2.add(new Student(20, "sumera", 78.56, 25));
		std2.add(new Student(21, "shubham", 45.65, 23));

		 itr = std2.iterator();
		for (Student student : std2) {
			System.out.println(student);
		}


			break;

		default:System.out.println("incorrect option choosen");
			System.exit(0);
			break;
		}

	}

}

