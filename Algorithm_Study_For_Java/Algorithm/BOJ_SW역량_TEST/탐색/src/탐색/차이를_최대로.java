package 탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 차이를_최대로 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N; i++)
			A[i] = sc.nextInt(); // 배열 안에 넣기

		Arrays.sort(A); // 오름 차순 정리

		int max = 0;
		do {
			int tmp = calculate(A);
			max = Math.max(max, tmp);
		} while (next_permutation(A));

		System.out.println(max);
	}

	private static boolean next_permutation(int[] A) {
		int i = A.length - 1;
		while (i > 0 && A[i] <= A[i - 1]) {
			i -= 1;
		}

		if (i <= 0)
			return false;

		int j = A.length - 1;
		while (A[j] <= A[i - 1]) {
			j -= 1;
		}

		int temp = A[i - 1];
		A[i - 1] = A[j];
		A[j] = temp;

		j = A.length - 1;
		while (i < j) {
			int temp2 = A[i];
			A[i] = A[j];
			A[j] = temp2;
			i += 1;
			j -= 1;
			/*
			System.out.println("i	" + A[i] + "   ");
			System.out.println("j	" + A[j] + "   ");
		*/}
		for(int k=0;k<A.length;k++) {
			System.out.println("K	" + A[k] + "   ");
		}
		return true;
	}

	// 차이 계산
	private static int calculate(int[] a) {
		int sum = 0;
		for (int i = 1; i < a.length; i++) {
			sum += Math.abs(a[i] - a[i - 1]);
		}
		return sum;
	}

}
