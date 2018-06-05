package algorithm;

import java.util.Scanner;

public class 이전순열 {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] inputArr = new int[N];

		for (int i = 0; i < N; i++) {
			inputArr[i] = scanner.nextInt();
		}
		if (prev_permutation(inputArr,N)) {
			for (int i = 0; i < N; i++) {
				System.out.print(inputArr[i] + " ");
			}
		} else {
			System.out.print(-1);
		}
	}

	private static boolean prev_permutation(int[] a,int n) {
		int i = n - 1;
		while (i > 0 && a[i - 1] <= a[i])
			i -= 1;
		if (i <= 0)
			return false;
		int j = n - 1;
		while (a[j] >= a[i - 1])
			j -= 1;
		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp;
		j = n - 1;
		while (i < j) {
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
			i += 1;
			j -= 1;
		}
		return true;
	}
}
