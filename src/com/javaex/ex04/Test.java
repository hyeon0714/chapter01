package com.javaex.ex04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		if(a%3==0) {
			System.out.println("3의 배수입니다");
		}else {
			System.out.println("3의 배수가 아닙니다");
		}
		sc.close();
		
	}
}
