package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=1;
		
		while(2<=a && a<=9 && b<=9) {
			System.out.println(a+ "*"+ b+ "=" +(a*b));
			
			
			b++;
		}
		sc.close();
	}
}
