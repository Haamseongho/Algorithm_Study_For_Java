package Ž��2;

import java.util.ArrayList;
import java.util.Scanner;

public class �Ҽ��ǿ����� {

	private static Scanner scanner;
	private static int N;
	private static int[] nums;
	private static boolean[] check;
	private static ArrayList<Integer> input;

	// �����佺�׳׽� �˰��� ���� ���
	private static boolean isPrime(int N) {

		check = new boolean[N+1];
		// �켱 ��� ���� �Ҽ���� ������, �Ҽ����� üũ�ϴ� �Լ��� true �ֱ�
		for (int i = 0; i < N; i++)
			check[i] = true;

		int to = (int) Math.sqrt(N);
		boolean isPrime = true;

		// 2���� �������� ���� �����ٱ����� ���� �������� �� �������� �Ҽ��� �ƴ�
		for (int i = 2; i <= to; i++) {
			if (N % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		N = scanner.nextInt();
		nums = new int[N];
		input = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			nums[i] = (i + 2);
		}
		// ���� ��� N�� 41�̶�� 41�̸��� ��� �ڿ����� üũ�Ѵ�. (�� , 1�� �����ؾ��Ѵ�)

		for (int j = 0; j < N; j++) {
			if (isPrime(nums[j])) {
				// �Ҽ�
				input.add(nums[j]);
				// System.out.println("�Ҽ� : " + nums[j]);
			}
		}

		// input �迭�� ���� ����ó�� ���� ���� �̰� ������
		int left = 0;
		int right = 0;
		int sum = input.size() == 0 ? 0 : input.get(0);
		int count = 0;

		// System.out.println("line index : " + line);
		while (left <= right && right < input.size()) {
			if (sum <= N) {
				if (sum == N)
					count += 1;
				// right �̵� �� sum�� �����ش�. (line�� sum�� ũ�ų� ���� ����)
				right += 1;
				if (right < input.size())
					sum += input.get(right);
			} else {
				sum -= input.get(left++);
			}
		}
		System.out.println(count);
	}
}
