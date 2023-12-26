package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자 : ");
		
		int num = sc.nextInt();
		
		sc.nextLine(); // 숫자를 먼저 입력하고 문자를 입력시 개행문자가 필요하다!!!
		
		System.out.print("문자 : ");
		
		String word = sc.nextLine();
		
		
		sc.close();
		
	}

}
