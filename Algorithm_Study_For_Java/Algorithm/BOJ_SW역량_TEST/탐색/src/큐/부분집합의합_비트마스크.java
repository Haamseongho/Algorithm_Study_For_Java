package 큐;

import java.util.Scanner;

public class 부분집합의합_비트마스크 {

	private static Scanner scan;
	private static int[] input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);

		int N = scan.nextInt(); // 횟수
		int S = scan.nextInt(); // 합계

		input = new int[N];
		for (int i = 0; i < N; i++)
			input[i] = scan.nextInt();

		int ans = 0;
		// 2^N == ( 1 << N )
		for (int i = 1; i < (1 << N); i++) {
			int sum = 0;
			for (int j = 0; j < N; j++) {
				// 존재할 경우
				if ((i & (1 << j)) != 0) {
					sum += input[j];
				}
			}
			if (S == sum)
				ans += 1;
		}

		System.out.println(ans);
	}
}
