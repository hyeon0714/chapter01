package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("근무시간 : ");
		
		int a=sc.nextInt();
		int worktime;
		
		if(a<8) {
			worktime = a*10000;
		}else {
			worktime = a*10000 + (a-8)*2000;
		}
		
			System.out.println("임금은 "+worktime+"원 입니다");
		sc.close();
	}

}
