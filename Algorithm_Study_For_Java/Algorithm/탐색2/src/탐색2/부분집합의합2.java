package Ž��2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class �κ���������2 {
	private static Scanner scanner;
	private static int[] N1;
	private static int[] N2;
	private static int[] input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int S = scanner.nextInt();
		input = new int[N + 1]; // �Է� ����

		for (int i = 0; i < N; i++) {
			input[i] = scanner.nextInt();
		}

		int M = (int) N / 2 + 1; // 5 --> M�� 2�� �ǰ� N�� 3
		N = N - M;
		N1 = new int[M]; // ���� N�� 5��� N1���� 3�� ���� N2���� 2�� ��
		N2 = new int[N];

		for (int i = 0; i < M; i++) {
			N1[i] = input[i];
		}
		for (int j = 0; j < N; j++) {
			N2[j] = input[j + M];
		}
		int left = 0;
		int right = 0;

		// �� �κ������� �� ���� �迭 �����

		int[] first = new int[(1 << M)];
		int[] second = new int[(1 << N)];
		// �մܿ� �� �κ�����
		for (int i = 0; i < (1 << M); i++) {
			int sum1 = 0;
			for (int j = 0; j < M; j++) {
				if ((i & (1 << j)) != 0) {
					sum1 += N1[j];
					//first[i] += N1[j];
				}
			}
			System.out.println(sum1);
		}

		for (int i = 0; i < (1 << N); i++) {
			for (int j = 0; j < N; j++) {
				if ((i & (1 << j)) == (1 << j)) {
					second[i] += N2[j];
				}
			}
		}
/*
		HashSet<Integer> firstHash = new HashSet<Integer>();
		for (int i = 0; i < first.length; i++) {
			if (firstHash.contains(first[i])) {
				firstHash.remove(first[i]);
			}
			firstHash.add(first[i]);
		}

		HashSet<Integer> secondHash = new HashSet<Integer>();
		for (int i = 0; i < second.length; i++) {
			if (secondHash.contains(second[i])) {
				secondHash.remove(second[i]);
			}
			secondHash.add(second[i]);
		}

		Iterator firstIt = firstHash.iterator();
		Iterator secondIt = secondHash.iterator();

		while (firstIt.hasNext()) {
			System.out.print(firstIt.next()+ " ");
		}
		System.out.println(" ");
		while (firstIt.hasNext()) {
			System.out.print(secondIt.next()+ " ");
		}*/
	}

}
