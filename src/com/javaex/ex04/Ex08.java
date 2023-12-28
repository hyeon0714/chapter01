package com.javaex.ex04;

public class Ex08 {
	
	public static void main(String[] args) {
		
		int a=1;
		
		//6의 배수   (x%6==0)
		//14의 배수  (x%14==0)
		
		while (true) {//무한 반복
			
			if(a%6==0 &&a%14==0) {//6과 14의 배수 찾기
				
				System.out.println(a);
				
				break;
			}
			
			a++;

		}
	}

}
