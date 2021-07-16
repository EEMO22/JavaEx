package com.javaex.basics;

// 변수 예제,
// 데이터 타입 예제
public class Types {
	public static void main(String[] args) {
		varEx();
	}

	// 변수의 선언과 사용
	private static void varEx() {
		/* 변수의 식별자 규칙
		 * 1. 문자, 숫자, $, _ 를 사용할 수 있다.
		 * 2. 숫자로 시작할 수 없다.
		 * 3. 예약어는 사용할 수 없다.
		 * 4. Java에서 변수, 메서드의 명명규칙: camelCase
		 */
		
		// int age; 	// 선언
		// age = 34;	// 초기화
		int age = 50;	// 선언과 동시에 초기화
		
		// 자바는 정적 타입 언어,
		// 다른 타입의 데이터를 담을 수 없다.
		// age = 3.14; -> Error
		
		// 조회:
		System.out.println("나이는 " + age);
		
		// 한 번에 여러 변수를 선언할 때
		int v1 = 10, v2 = 20, v3 = 30;
		
		// 여러 변수에 동일한 값을 할당
		v1 = v2 = v3 = 40;
	}
	
}
