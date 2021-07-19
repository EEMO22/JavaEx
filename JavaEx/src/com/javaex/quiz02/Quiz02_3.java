package com.javaex.quiz02;

public class Quiz02_3 {
	public static void main(String[] args) {
		int num = 13579;
		
		//	num의 100자리 미만을 버리는 코드를 작성해 봅시다.
		
		
		int result = (num / 100) * 100;
		
		
		System.out.println(result);
	}

}
