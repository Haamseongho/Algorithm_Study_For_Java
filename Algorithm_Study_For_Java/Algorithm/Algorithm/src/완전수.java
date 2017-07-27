import java.util.Scanner;

public class 완전수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 4부터 500 사이의 완전 수 구하기
		/*
		 * 완전수란 ? 자기 자신을 제외한 나머지 약수의 총합이 자기 자신과 같은 수
		 */
		int TN = 0;

		for (int i = 4; i <= 500; i++) {
			int sum = 0;
			int k;
			k = (int) (i / 2);
			for (int j = 1; j <= k; j++) {
				if (i % j == 0) {
					sum += j;
				}
				if (i == sum) {
					System.out.println("완전수 :" + i);
					TN += 1;
				}
			}

		}
		System.out.println("최종 완전 수의 갯수:" + TN);
	}

}
