package com.javaex.oop;

public class MethodEx {

	public static void main(String[] args) {
//		printMessage();
//		printMessage("Hello, Method");	//	"Hello, Method" <- parameter
//		printDivide(10, 0);	//	10, 0 <- parameter
//		System.out.println(divide(10, 3));	//	int 값인 10 과3 은 casting 되어 double
//		System.out.println("getSum: " + 
//				getSum(new double[] {
//				1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } ));
//		System.out.println("getSumVar: " + 
//				getSumVar(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		printSum("고정 + 가변: ", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}
	
	//	고정 인수가 앞에, 가변 인수가 뒤에.
	private static void printSum(String message, double ...values) {
		System.out.println(message + ":" + getSumVar(values));
	}
	
	//	매개 변수의 갯수를 모른다.
	//	방법2. 가변 인수: 변수 이름 앞에 ...
	private static double getSumVar(double ...values) {
		//	가변인수는 배열로 변환되어 들어온다.
//		double total = 0;
//		
//		for (double value: values) {
//			total += value;
//		}
//		return total;
		return getSum(values);
	}
	
	//	매개 변수의 갯수를 모른다
	//	방법1. 인수를 배열로 전달
	private static double getSum(double[] values) {
		double total = 0;
		
		for (double value: values) {
			total += value;
		}
		
		return total;
	}
	
	//	입력 O, 출력 O
	private static double divide(double num1, double num2) {
		return num1 / num2;	//	double을 받겠다 했으니(double divide) 반드시 리턴 해야 함
	}
	
	//	입력 O, 출력 X
	private static void printDivide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없어요!");
			return;	//	돌아가세요! : printDivide(10, 0); 로 돌아감
					//	리턴 타입이 없더라도 return을 만나면 메서드 중단하고 main 함수로 돌아감
		}
		System.out.println(num1 / num2);
		
	}
	
	
	//	입력 O, 출력 X
	private static void printMessage(String message) {
		System.out.println(message);
	}
	
	//	입력 X, 출력 X
	private static void printMessage() {
		System.out.println("Hello, OOP");
	}
}
