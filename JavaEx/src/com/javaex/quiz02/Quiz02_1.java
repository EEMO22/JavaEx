package com.javaex.quiz02;

public class Quiz02_1 {
	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		char c = 'A';
		
		//	Q1
		//	a는 짝수입니까? T or F
		String result;
		result = a % 2 == 0 ? "true" : "false";
		System.out.println(a + "는 " + result);
		
		//	b는 3의 배수입니까? T or F
		result = b % 3 == 0 ? "true" : "false";
		System.out.println(b + "는 " + result);
		
		//	'a는 짝수이다' 와 'b는 3의 배수이다' 를 논리곱(AND)연산하여
		// 	해당 진위값을 변수 r1 에 저장
		boolean r1 = (a % 2 == 0 && b % 3 == 0);
		//	r1 출력
		System.out.println("a는 짝수이다. 그리고 b는 3의 배수이다: " + r1);
		
		//c의 4글자 뒤의 문자는 무엇입니까? 변수 r2에 결과값 저장
//		int r2 = (c >> 4);	이거 아님 ㅎㅎ
		char r2 = (char)(c + 4);	// 강제 형변환
		//	r2 출력
//		System.out.println(Integer.toBinaryString(r2));
		System.out.println(r2);
	}
}
	
	
