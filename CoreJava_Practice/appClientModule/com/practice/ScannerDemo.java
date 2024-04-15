package com.practice;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter character: ");
		char ch = sc.next().charAt(0);
		
		
		
		System.out.println("Character is : "+ch);
		//System.out.println("Age is : "+age);
		//System.out.println("Temp is : "+temp);
	
		sc.close();
	
	}

}
