package ť;

import java.util.Scanner;

public class SCPC1 {

	private static Scanner scanner;
	private static int[] Ai;
	private static int[] Aj;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int T = scanner.nextInt(); // �׽�Ʈ���̽�
		int n = scanner.nextInt(); // ������ ����
		Ai = new int[n];
		Aj = new int[n];
		int K = scanner.nextInt(); // �Ƿ� ���� : K

		int cnt = 1;
		
		while(T-->0) {
			for (int i = 0; i < n; i++) {
				Ai[i] = scanner.nextInt();
				Aj[i] = scanner.nextInt();

				if (Math.abs(Ai[i] - Aj[i]) <= K) {
					cnt += 1;
				}
			}
		}
	
		System.out.println(cnt);
	}

}
