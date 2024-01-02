package com.javaex.ex05;

public class Ex06 {
	
	public static void main(String[] args) {
		
		int a=3;
		int b=a;
		
		a=4;
		System.out.println(a);
		System.out.println(b);  //일반적인 대입결과(값을 복사**뒤에 수정해도 변화 없음)
		
		int[] c=new int[3];
		c[0]=1;
		c[1]=2;
		c[2]=3;
		
		int[] d;
		
		d=c;
		
		c[1]=8;
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
		for(int i=0; i<d.length; i++) {
			System.out.println(d[i]);// 배열의 대입결과(주소를 복사**뒤에 수정해도 값이 따라서 변화)
		}
	}

}
