package Ž��;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class �ζ� {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		// ������ ������ ����
		int[] input_arr = new int[K];

		int[] d = new int[K];
		// S = {1,2,3,5,8,13,21,34}
		// ���⼭ 6���� �̾Ƽ� ������ ������ �� �� ������ ����ϸ� �˴ϴ�.

		for (int i = 0; i < K; i++)
			input_arr[i] = scanner.nextInt();

		Arrays.sort(input_arr); // �� �������� ����

		for (int i = 0; i < K - 6; i++)
			d[i] = 0;

		for (int i = K - 6; i < K; i++)
			d[i] = 1;

		// d�迭�� ������ ������ ���ؼ� �˾Ƽ� �����ϰ� ������ �� , �� Key������ ������ ������ �ͼ� ������ �ҷ��ͼ� ���Ϳ� �ֱ� (�÷���)
		// �����̷� ���Ϳ� �ִ� ������
		Vector<Vector<Integer>> ans = new Vector<Vector<Integer>>();
		do {
			Vector<Integer> S = new Vector<Integer>();
			for (int j = 0; j < K; j++) {
				if (d[j] == 1)
					S.add(input_arr[j]); // S��ü�� ans�� ���� ���̱� ������ S���� ��ü�� ���� ans�� �ϳ��� Ű ���� ������ ����.
			}
			ans.add(S);
		} while (next_permutation(d));

		for (int i = ans.size() - 1; i >= 0; i--) {
			for (int j = 0; j < 6; j++) {
				System.out.print(ans.get(i).get(j)+" ");
			}
			System.out.println("");
		}

	}

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
}
