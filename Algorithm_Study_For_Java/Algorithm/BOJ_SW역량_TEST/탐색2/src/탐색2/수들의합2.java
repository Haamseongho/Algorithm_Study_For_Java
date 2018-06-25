package Ž��2;

import java.util.Scanner;

public class ��������2 {

	private static Scanner scanner;
	private static int[] input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // N���� ���� �̷���� ����
		int M = scanner.nextInt(); // �����ؾ��� ��

		input = new int[N+1];
		for (int i = 0; i < N; i++)
			input[i] = scanner.nextInt();

		int L_index = 0;
		int R_index = 0;
		int sum = input[0]; // �ʱ� ��
		int cnt = 0; // Ƚ��

		while (L_index <= R_index && R_index < N) {
			// ���� �ε����� ������ �ε������� �۰ų� ���ƾ��ϸ�, ������ �ε����� �迭�� ũ�⺸�� �۾ƾ���
			if (sum < M) {
				// �հ谡 M���� ���� ��� R_index�� �÷������
				R_index += 1;
				sum += input[R_index];
			} else if (sum == M) {
				// sum == M�� ���
				cnt += 1; // ī��Ʈ �ϳ� ����
				R_index += 1; // ������ �ε����� �ϳ� ����
				sum += input[R_index];
			} else if (sum > M) {
				// �հ谡 M���� Ŭ ��� L_index�� �÷������
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
