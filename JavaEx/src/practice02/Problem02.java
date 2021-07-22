package practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[5];
		int num = 0;
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			num = scanner.nextInt();
			arr[i] = num;
			sum += num;
		}
		System.out.println("평균은 " + (sum / arr.length) + "입니다.");
		scanner.close();
	}

}
