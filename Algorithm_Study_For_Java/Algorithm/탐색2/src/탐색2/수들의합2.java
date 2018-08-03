package 탐색2;

import java.util.Scanner;

public class 수들의합2 {

	private static Scanner scanner;
	private static int[] input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // N개의 수로 이루어진 수열
		int M = scanner.nextInt(); // 도달해야할 값

		input = new int[N+1];
		for (int i = 0; i < N; i++)
			input[i] = scanner.nextInt();

		int L_index = 0;
		int R_index = 0;
		int sum = input[0]; // 초기 값
		int cnt = 0; // 횟수

		while (L_index <= R_index && R_index < N) {
			// 왼쪽 인덱스는 오른쪽 인덱스보다 작거나 같아야하며, 오른쪽 인덱스는 배열의 크기보다 작아야함
			if (sum < M) {
				// 합계가 M보다 작을 경우 R_index를 늘려줘야함
				R_index += 1;
				sum += input[R_index];
			} else if (sum == M) {
				// sum == M일 경우
				cnt += 1; // 카운트 하나 증가
				R_index += 1; // 오른쪽 인덱스도 하나 증가
				sum += input[R_index];
			} else if (sum > M) {
				// 합계가 M보다 클 경우 L_index를 늘려줘야함
				sum -= input[L_index];
				L_index += 1;
				if (L_index > R_index && L_index < N) {
					R_index = L_index;
					sum = input[L_index];
				}
			}
		}
		System.out.println(cnt);
	}
}
