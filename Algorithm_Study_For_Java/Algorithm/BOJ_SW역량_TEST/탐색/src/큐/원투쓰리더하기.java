package ť;

import java.util.Scanner;

public class �����������ϱ� {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int T = scanner.nextInt(); // �׽�Ʈ ���̽�
		while (T-- > 0) {
			int input = scanner.nextInt();
			int ans = solution(0, 0, input);

			// System.out.println(ans);
		}

	}

	private static int solution(int count, int sum, int goal) {
		if (sum > goal)
			return 0;
		if (sum == goal)
			return 1; // �ٷ� ���� ���� 1 ��� (1ȸ)

		int ans = 0;
		//System.out.println(count + " / " + sum + " / " + goal);
		
		for (int i = 1; i <= 3; i++) {
			// 1,2,3 ���θ� ���� ����� ���� �ϹǷ�
			ans += solution(count + 1, sum + i, goal);
			
			/*
			 * 1,2,3 ���� ���� ���� �� ī��Ʈ�� �ϳ��� �����ϰ� �� ���� 1�� ���Ҷ��� 2�� ���Ҷ� 3���� ���� �� �� �ܰ躰�� 1�� �߰��� ��
			 * �����ϰ� �˴ϴ�.
			 */
		}
		return ans;
	}
}
