package Ž��;

import java.util.Arrays;
import java.util.Scanner;

public class TSP���� {

	private static Scanner scan;

	private static boolean next_permutation(int[] A) {
		int i = A.length - 1;
		while (i > 0 && A[i - 1] >= A[i]) {
			i -= 1;
		}

		if (i <= 0)
			return false;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���� : �ϳ��� ���ÿ��� �����ϴµ� N���� ��� ���ø� ���ļ� �ٽ� ������ ���÷� ���ƿ´�. �� �� �� �� ���� ���ƿ� �� ����. �� ��
		 * ���� ���� ����� ���ض�
		 */

		/*
		 * �ؾ��� �� 1. ��ȹ / N�� �ִ� ������ ���Ѵ� --> �� ��ŭ �ݺ����� �� ���� 2. 2<= N && N <= 10�̸� �ִ� ����
		 * 10���� �ݺ����� ������. 3. �ݺ����� ������ �� ���� �迭�� ���� ������������ �����Ѵ�. 4. N�� �ݺ��� �� �� �� �ȿ��� ���� ����
		 * ������ �̿��Ͽ� ����ؼ� ��ġ�Ѵ�. 5. w[i][j] �� i->j �� �� �� ��� ����� �ǹ��Ѵ�. 6. w[i][j] == 0 �� ���
		 * �� �� ���� ���̱� ������ ������ �� ������ �Ű��� ��� �Ѵ�.
		 * 
		 */
		scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] w = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				w[i][j] = scan.nextInt();
			}
		}

		int d[] = new int[N]; // (�������� ������ �ǹ��� ����)

		for (int i = 0; i < N; i++)
			d[i] = i;

		// (0~N-1�� ������ ����)

		// Arrays.sort(d);

		int ans = Integer.MAX_VALUE; // ������ �ִ� ��

		do {
			boolean move = true;
			int sum = 0;
			for (int i = 0; i < N - 1; i++) {
				if (w[d[i]][d[i + 1]] == 0) {
					move = false;
				} else {
					sum += w[d[i]][d[i + 1]];

				}

			}

			if (move && (w[d[N - 1]][d[0]] != 0)) {
				sum += w[d[N - 1]][d[0]];
				if (ans > sum)
					ans = sum;
			}

		} while (next_permutation(d));
		
		
		System.out.println(ans);
	}

}
