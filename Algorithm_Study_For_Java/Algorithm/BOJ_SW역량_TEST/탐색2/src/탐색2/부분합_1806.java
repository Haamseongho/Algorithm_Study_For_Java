package 탐색2;

import java.util.Scanner;

public class 부분합_1806 {

	private static Scanner scan;
	private static int[] A;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		int N = scan.nextInt(); // 횟수
		int S = scan.nextInt(); // 합

		A = new int[N + 1];
		for (int i = 0; i < N; i++)
			A[i] = scan.nextInt(); // 횟수

		int left = 0;
		int right = 0;
		int sum = A[0];
		int line = N + 1; // 최대로 길 수 있는 값

		while (left <= right && right < N) {
			if (sum < S) {
				right += 1;
				sum += A[right];
			} else if (sum == S) {
				line = Math.min(right - left + 1, line);
				right += 1;
				sum += A[right];
			} else if (sum > S) {
				line = Math.min(right - left + 1, line);
				sum -= A[left];
				left += 1;
			}
		}

		if (line > N)
			line = 0;

		System.out.println(line);

	}

}
