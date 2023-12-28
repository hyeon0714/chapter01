package com.javaex.ex04;

public class Ex10 {
	
	public static void main(String[] args) {
		
		
		for(int a=1; a<=20; a++) {//1부터 20까지의 반복
			
			if(a%2==0 || a%3==0) {//2의 배수이거나 3의 배수 찾으면 다시 위에서 반복
				continue;	
			}else {
				System.out.println(a);//내려온 파일을 출력(continue 명령어 때문에 2와 3의 배수는 내려오지 않았음)
			}
		}
		System.out.println("-------------");
		
		for(int a=1; a<20; a++) {
			if(a%2==0 || a%3==0) {
				// 입력을 안함으로 2와 3의 배수에서 출력이 안됨
			}else {
				System.out.println(a);
			}
		}
		System.out.println("-------------");
		
		for(int a=1; a<20; a++) {
			if(!(a%2==0 || a%3==0)) {
				System.out.println(a);
			}else {
				
			}
		}

	/// 3문법 다 같은 결과의 다른 방식
	}

}
