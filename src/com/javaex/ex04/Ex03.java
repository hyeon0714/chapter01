package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		System.out.println("단을 입력하세요");
		System.out.print("단: ");
		
		Scanner sc=new Scanner(System.in);
		
		/*
		int dan=sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			
		}
		*/
		
		
		
		int b=1;
		
		for (int a=sc.nextInt(); 2<=a && a<=9 && b<=9; b++) {
			System.out.println(a+ "*"+ b+ "=" +(a*b));
		}
		sc.close();
	}

}
