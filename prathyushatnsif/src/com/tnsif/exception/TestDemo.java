package com.tnsif.exception;
import java.util.Scanner;
public class TestDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rollnumber");
	int rolln0=sc.nextInt();
	
	if(rollnumber<0) {
		throw new ArithmeticException("rollnumber cannot be negative");
	}
	else {
		System.out.println("valid rollno");
	}
}
}