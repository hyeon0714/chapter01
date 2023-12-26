package com.javaex.ex02;

import java.util.Scanner;

public class Test99 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생년월일을 입력하시오(예:19900101");
		
		System.out.print("생년월일 : ");
		
		long birthday = sc.nextLong();
		
		System.out.println("당신의 생년월일은 "+birthday+" 입니다");
		
		sc.close();
		
	}

}
