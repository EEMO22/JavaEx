package practice02;

import java.util.Arrays;

public class Problem05 {

	public static void main(String[] args) {
	
		int scoreBoard[][] = {
				{ 80, 75, 90, 95, 78 },
				{ 92, 88, 89, 92, 70 },
				{ 78, 80, 85, 86, 63 },
				{ 83, 84, 89, 87, 75 },
				{ 89, 83, 93, 94, 78 }
		};
		
		int sum = 0;
		int count = 0;
	
		
		for (int i = 0; i < scoreBoard.length; i++) {
			for (int j = 0; j < scoreBoard[i].length; j++) {
				
				if (scoreBoard[i][j] >= 85) {
					
					sum += scoreBoard[i][j];
					
					int upper[] = {scoreBoard[i][j]};
					count += upper.length;
					
				}
			}
					
			}
		System.out.println("총 합: " + sum + "점");
		System.out.println("평균 :" + (sum / count) + "점");
		
		}

	}