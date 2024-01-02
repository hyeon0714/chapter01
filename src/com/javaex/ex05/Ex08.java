package com.javaex.ex05;

public class Ex08 {
	
	public static void main(String[] args) {
		
		int[] a=new int[] {10,20,30,40};
		int[] b=new int[] {10,30,200};
		
		if(a.length==b.length) {    //a와 b의 크기 비교
			for(int i=0; i<a.length; i++) {
				if(a[i]!=b[i]) {    //a와 b의 값 비교
				System.out.println(i+"번째 값이 다릅니다");
				}else {
			
				}
				
			}
		
			
		}else {
			System.out.println("두배열의 크기가 다릅니다");
		}
		
	
	}

}
