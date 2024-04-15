package com.practice;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 7;
		float c = a%b;
		System.out.println(c);
		
		int n = 5;
		System.out.println(n++);	//post increment
		System.out.println(n);
		
		int s = 7;
		int val = s--;
		System.out.println(val);   //post decrement
		System.out.println(s);
		System.out.println();
		
		int r = 7;
		int value = --r;			//pre decrement
		System.out.println(value);
		System.out.println(r);
	}

}
