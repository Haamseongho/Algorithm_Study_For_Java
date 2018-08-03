package algorithm;

import java.util.Scanner;

public class 다음순열 {

	/*
	 * 1. A[i-1] < A[i]를 만족하는 가장 큰 i를 구한다. 2. j>=i이면서 A[j] > A[i-1]를 만족하는 가장 큰 j를
	 * 구한다. 3. A[i-1]과 A[j]를 swap한다. 4. A[i]부터 순열을 뒤집는다.
	 */

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // 순열의 갯수
		int[] inputArr = new int[N]; // 입력 배열

		for (int i = 0; i < N; i++) {
			inputArr[i] = scanner.nextInt();
		}

		if (next_permutation(inputArr)) {
			for (int i = 0; i < N; i++) {
				System.out.print(inputArr[i] + " ");
			}

			System.out.println("");
		} else {
			System.out.print("-1");
		}
	}

	private static boolean next_permutation(int[] A) {
		int chgIdx = 0;
		int allChgIdx = 0;
		int j_max = 0;
		for (int i = A.length - 1; i > 0; i--) {
			if (A[i] >= A[i - 1]) {
				chgIdx = i - 1;
				allChgIdx = i;
				break;
			}
		}
		if(allChgIdx <= 0)
			return false;

		for (int j = A.length - 1; j > 0; j--) {
			if (A[j] > A[chgIdx]) {
				j_max = j; // j 값 중 가장 큰 것
				break;
			}
		}
		// chgIdx = 2 , j_max = 3 , allChgIdx = 3

		int temp = A[chgIdx];
		A[chgIdx] = A[j_max];
		A[j_max] = temp;

		int swap_idx = A.length - 1;
		while (allChgIdx < swap_idx) {
			int temp2 = A[allChgIdx];
			A[allChgIdx] = A[swap_idx];
			A[swap_idx] = temp2;
			// swap(A[allChgIdx], A[swap_idx]);
			allChgIdx++;
			swap_idx--;
		}
		return true;
	}
}
