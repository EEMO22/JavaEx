package practice01_2;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		int sum = 0;
		
		if (num % 2 == 0) {
			for (int i = 0; i <= num; i++) {
				if (i % 2 != 0) {
					continue;
				}
				sum += i;
				
			}
			System.out.println("결과값: " + sum);
			
		} else if(num % 2 != 0) {
			for (int i = 0; i <= num; i++) {
				if (i % 2 == 0) {
					continue;
				}
				sum += i;
			}
			System.out.println("결과값: " + sum);
		}
	
	}
	
}