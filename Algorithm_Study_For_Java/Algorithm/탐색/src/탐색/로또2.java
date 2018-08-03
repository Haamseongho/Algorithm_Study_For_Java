package 탐색;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class 로또2 {

	private static Scanner scanner;
	private static int[] input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		// 몇 개 숫자 넣을지 ~
		input = new int[n]; // 갯수만큼 배열 만들어서 숫자 넣을 예정

		for (int i = 0; i < n; i++)
			input[i] = scanner.nextInt();

		Arrays.sort(input); // 배열 오름차순 정의
		int[] d = new int[n];
		for (int i = 0; i < n - 6; i++) {
			d[i] = 0;
		}

		for (int i = n - 6; i < n; i++) {
			d[i] = 1;
		}

		Vector<Vector<Integer>> ans = new Vector<Vector<Integer>>();
		do {
			Vector<Integer> vectors = new Vector<Integer>();
			for (int j = 0; j < n; j++) {
				if (d[j] == 1)
					vectors.add(input[j]);
			}
			ans.add(vectors);
		} while (next_permutation(d));

		for (int i = ans.size() - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				System.out.println(ans.get(i).get(j));
			}
			System.out.println("");
		}
	}

	private static boolean next_permutation(int[] A) {
		int i = A.length - 1;
		while (i > 0 && A[i - 1] >= A[i]) {
			i -= 1;
		}
		if (i <= 0) {
			return false;
		}
		int j = A.length - 1;
		while (A[i - 1] >= A[j]) {
			j -= 1;
		}

		int tmp = A[i - 1];
		A[i - 1] = A[j];
		A[j] = tmp;

		j = A.length - 1;
		while (i < j) {
			int tmp2 = A[i];
			A[i] = A[j];
			A[j] = tmp2;
			i += 1;
			j -= 1;
		}

		return true;
	}
}
