package com.javaex.ex03;

import java.util.Scanner;

public class Test999 {
	
	public static void main(String[] args) {
		
		System.out.print("점수 : ");
		
		Scanner sc=new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num>=90){
			System.out.println("A입니다");
		} else if (num>=80) {
			System.out.println("B입니다");
		} else {
			System.out.println("C입니다");
		}
		
		sc.close();
	}

}
