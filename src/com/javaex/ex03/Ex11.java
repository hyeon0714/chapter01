package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("월을 입력하세요:");
		
		int a=sc.nextInt();
		
		
		if((a==4)||(a==6)||(a==9)||(a==11)) {
			
			int day = 30;
			System.out.println(day+"일 입니다");
			
		}else if(a==2) {
			int day = 28;
			System.out.println(day+"일입니다");
			
		}else if((a==1)||(a==3)||(a==5)||(a==7)||(a==8)||(a==10)||(a==12)) {
			int day = 31;
			System.out.println(day+"일입니다");

		
		}else
			System.out.println("다시 입력해주세요");

		
		sc.close();
	}
}
