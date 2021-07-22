package pratice01_1;

public class Problem01 {

	public static void main(String[] args) {
	
		//	1에서 100까지의 수 중에서 5의 배수 이면서 7의배수인 수 출력
		
		for (int i = 1; i < 101; i++) {
			if (!(i % 5 == 0 && i % 7 == 0)) {
				continue;
			}
			System.out.println(i);
		}

	}

}
