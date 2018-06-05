package algorithm;

import java.util.Scanner;

public class �������� {

	/*
	 * 1. A[i-1] < A[i]�� �����ϴ� ���� ū i�� ���Ѵ�. 2. j>=i�̸鼭 A[j] > A[i-1]�� �����ϴ� ���� ū j��
	 * ���Ѵ�. 3. A[i-1]�� A[j]�� swap�Ѵ�. 4. A[i]���� ������ �����´�.
	 */

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // ������ ����
		int[] inputArr = new int[N]; // �Է� �迭

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
				j_max = j; // j �� �� ���� ū ��
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
