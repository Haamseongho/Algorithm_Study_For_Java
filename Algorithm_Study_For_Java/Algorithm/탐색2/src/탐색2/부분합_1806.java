package Ž��2;

import java.util.Scanner;

public class �κ���_1806 {

	private static Scanner scan;
	private static int[] A;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		int N = scan.nextInt(); // Ƚ��
		int S = scan.nextInt(); // ��

		A = new int[N + 1];
		for (int i = 0; i < N; i++)
			A[i] = scan.nextInt(); // Ƚ��

		int left = 0;
		int right = 0;
		int sum = A[0];
		int line = N + 1; // �ִ�� �� �� �ִ� ��

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
