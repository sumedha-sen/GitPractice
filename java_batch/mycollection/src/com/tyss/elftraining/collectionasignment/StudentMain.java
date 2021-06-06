package com.tyss.elftraining.collectionasignment;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. sortbyage 2. sortbyid 3. sortbyname 4. sortbystandard 5.  sortbymarks");
		Scanner sc=new Scanner(System.in);
		int ch = sc.nextInt();
		
		
	        
				
				
				switch (ch) {
				case 1:
					TreeSet<Student> stdid = new TreeSet<>();
					stdid.add(new Student(11, "Sima", 98, 1,5));
					stdid.add(new Student(13, "Rima", 99,2,6));
					stdid.add(new Student(13, "Tina", 100,3,7));
					
					stdid.add(new Student(15, "Bindu", 50,4, 10));
					stdid.add(new Student(16, "priya", 80,5, 9));
					stdid.add(new Student(17, "karan", 70, 6,8));
					stdid.add(new Student(18, "puja", 89,7, 6));
					stdid.add(new Student(19, "pallavi", 56,8, 5));
					stdid.add(new Student(20, "sumedha", 78, 9,4));
					stdid.add(new Student(21, "shubham", 45,10, 3));

					Iterator<Student> itr = stdid.iterator();
					for (Student student : stdid) {
						System.out.println(student);
					}

					break;
				case 2:
					TreeSet<Student> stdid1 = new TreeSet<>();
					stdid1.add(new Student(11, "Sima", 98, 1,5));
					stdid1.add(new Student(13, "Rima", 99,2,6));
					stdid1.add(new Student(13, "Tina", 100,3,7));
					
					stdid1.add(new Student(15, "Bindu", 50,4, 10));
					stdid1.add(new Student(16, "priya", 80,5, 9));
					stdid1.add(new Student(17, "karan", 70, 6,8));
					stdid1.add(new Student(18, "puja", 89,7, 6));
					stdid1.add(new Student(19, "pallavi", 56,8, 5));
					stdid1.add(new Student(20, "sumedha", 78, 9,4));
					stdid1.add(new Student(21, "shubham", 45,10, 3));

					Iterator<Student> itr1 = stdid1.iterator();
					for (Student student : stdid1) {
						System.out.println(student);
					}

					break;
				case 3:
					TreeSet<Student> stdid2 = new TreeSet<>();
				    stdid2.add(new Student(11, "Sima", 98, 1,5));
					stdid2.add(new Student(13, "Rima", 99,2,6));
					stdid2.add(new Student(13, "Tina", 100,3,7));
					
					stdid2.add(new Student(15, "Bindu", 50,4, 10));
					stdid2.add(new Student(16, "priya", 80,5, 9));
					stdid2.add(new Student(17, "karan", 70, 6,8));
					stdid2.add(new Student(18, "puja", 89,7, 6));
					stdid2.add(new Student(19, "pallavi", 56,8, 5));
					stdid2.add(new Student(20, "sumedha", 78, 9,4));
					stdid2.add(new Student(21, "shubham", 45,10, 3));

					Iterator<Student> itr2 = stdid2.iterator();
					for (Student student : stdid2) {
						System.out.println(student);
					}

					break;
				case 4: SortByAge age = new SortByAge();
				TreeSet<Student> stdid3 = new TreeSet<>();
				stdid3.add(new Student(11, "Sima", 98, 1,5));
				stdid3.add(new Student(13, "Rima", 99,2,6));
				stdid3.add(new Student(13, "Tina", 100,3,7));
				
				stdid3.add(new Student(15, "Bindu", 50,4, 10));
				stdid3.add(new Student(16, "priya", 80,5, 9));
				stdid3.add(new Student(17, "karan", 70, 6,8));
				stdid3.add(new Student(18, "puja", 89,7, 6));
				stdid3.add(new Student(19, "pallavi", 56,8, 5));
				stdid3.add(new Student(20, "sumedha", 78, 9,4));
				stdid3.add(new Student(21, "shubham", 45,10, 3));

				Iterator<Student> itr3 = stdid3.iterator();
				for (Student student : stdid3) {
					System.out.println(student);
				}


					break;
				case 5: SortByMarks marks = new SortByMarks();
				TreeSet<Student> stdid4 = new TreeSet<>();
				stdid4.add(new Student(11, "Sima", 98, 1,5));
				stdid4.add(new Student(13, "Rima", 99,2,6));
				stdid4.add(new Student(13, "Tina", 100,3,7));
				
				stdid4.add(new Student(15, "Bindu", 50,4, 10));
				stdid4.add(new Student(16, "priya", 80,5, 9));
				stdid4.add(new Student(17, "karan", 70, 6,8));
				stdid4.add(new Student(18, "puja", 89,7, 6));
				stdid4.add(new Student(19, "pallavi", 56,8, 5));
				stdid4.add(new Student(20, "sumedha", 78, 9,4));
				stdid4.add(new Student(21, "shubham", 45,10, 3));

				Iterator<Student> itr4 = stdid4.iterator();
				for (Student student : stdid4) {
					System.out.println(student);
				}


					break;


				default:System.out.println("incorrect option choosen");
					System.exit(0);
					break;
				}

			}

		

		
		

	}



