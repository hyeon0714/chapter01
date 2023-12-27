package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("월을 입력하세요:");
		
		int a=sc.nextInt();
		
		switch (a){    //  boolean,실수는 사용이 안된다 => boolean, float, double
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일입니다");
		break;
		case 2:
			System.out.println("28일입니다");
		break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일입니다");
		break;
		default:
			System.out.println("다시 입력해주세요");
		
		}
		// 문자형의 비교는 .equals() 써서 사용한다
		sc.close();
	}

}
