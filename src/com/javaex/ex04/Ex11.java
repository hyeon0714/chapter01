package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요 [0이면 종료]");
		
		int b=0;
		int a;
		
		do {
			a=sc.nextInt();
			b=b+a;
			System.out.println(b);
		}while(a!=0);
			System.out.println("종료");
		
		
		
		/*
		while(true){
		
		
			int a=sc.nextInt();
	
		
			if(a ==0) {
				System.out.println("종료");
				break;
			}
			b=b+a;
			System.out.println(b);
		
		
		
		}sc.close();
		*/
			sc.close();
	}

}
