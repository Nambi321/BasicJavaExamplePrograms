package com.practice;

class Student{
	
	String name;
	int rank;
	
	void getdisplay() {
		System.out.println("Name = "+name);
		System.out.println("Rank = "+rank);
	}
	
}

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "Nambi Rajan";
		s1.rank = 10;
		
		Student s2 = new Student();
		s2.name = "Ajin";
		s2.rank = 17;
		
		
		s1.getdisplay();
		s2.getdisplay();
		
	}

}
