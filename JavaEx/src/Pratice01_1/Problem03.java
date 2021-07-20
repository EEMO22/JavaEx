package Pratice01_1;

public class Problem03 {

	public static void main(String[] args) {
		
		int arr[][] = new int [10][10];
		for (int i = 2; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = i * j;
				System.out.print(i + "*" + j + "=" + arr[i][j] + " ");
				if ( j % 9 == 0) {
					System.out.print("\n");
				}
			}
		}

	}

}
