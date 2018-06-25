package ť;

import java.util.Scanner;

public class �κ���������_��Ʈ����ũ {

	private static Scanner scan;
	private static int[] input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);

		int N = scan.nextInt(); // Ƚ��
		int S = scan.nextInt(); // �հ�

		input = new int[N];
		for (int i = 0; i < N; i++)
			input[i] = scan.nextInt();

		int ans = 0;
		// 2^N == ( 1 << N )
		for (int i = 1; i < (1 << N); i++) {
			int sum = 0;
			for (int j = 0; j < N; j++) {
				// ������ ���
				if ((i & (1 << j)) != 0) {
					sum += input[j];
				}
			}
			if (S == sum)
				ans += 1;
		}

		System.out.println(ans);
	}
}
