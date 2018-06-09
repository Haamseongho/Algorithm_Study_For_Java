package Ž��;

import java.util.Scanner;

public class ������ {
	static boolean[] broken;
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);

		int channel = scanner.nextInt();
		int brokenN = scanner.nextInt(); // ���峭 Ű������ ����
		int[] fakeNum = new int[brokenN];
		broken = new boolean[10];

		for (int i = 0; i < brokenN; i++) {
			fakeNum[i] = scanner.nextInt(); // ���峭 ��ư üũ
			broken[fakeNum[i]] = true;
		}
		// 6,7,8 �ϰ�� broken[6] = true , broken[7] = true , broken[8] = true

		int answer = channel - brokenN; // �Űܰ� ä�� - ���峭 Ű������ ��
		if (answer < 0) {
			answer = Math.abs(answer);
		}

		for (int i = 0; i <= 1000000; i++) {
			// �̵� ������ ä���� �� 500,000 (���� �̵� ����) , (�Ʒ��� �̵� ����) ���� 500,000*2
			int c = i;
			int len = possible(c);
			if (len > 0) {
				int press = c - channel; // ��ü���� �ű� ä�� ���ֱ� ( ���� ��� 500���̰� �ű� ä���� 342�� 500 - 342 ��ŭ ��ư�� ����
				if (press < 0)
					press = -press;

				if (answer > len + press) {
					answer = len + press;
				}
			}
		}
		System.out.print(answer);
	}

	static int possible(int c) {

		// 0,1,2,3,4,5,6,7,8,9
		if (c == 0) {
			if (broken[0])
				return 0;
			else
				return 1;
		}
		int len = 0;
		while (c > 0) {
			if (broken[c % 10]) {
				return 0; // ���� --> ��� �Ұ���
			}
			len += 1; // ���� ���, 5���� ���� ���� �ʴٸ� �ش� ���� 1��ŭ ����
			c /= 10;
		}

		return len;
	}
}
