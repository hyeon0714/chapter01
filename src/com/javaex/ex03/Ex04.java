package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("근무시간 : ");
		
		int a=sc.nextInt();
		
		if(a<8) {
			System.out.println("임금은 "+a*10000);
		}else {
			System.out.println("임금은 "+((a*10000)+(a-8)*5000));
		}
		// 다른 방식의 접근
		sc.close();

	}

}
