import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 4���� 500 ������ ���� �� ���ϱ�
		/*
		 * �������� ? �ڱ� �ڽ��� ������ ������ ����� ������ �ڱ� �ڽŰ� ���� ��
		 */
		int TN = 0;

		for (int i = 4; i <= 500; i++) {
			int sum = 0;
			int k;
			k = (int) (i / 2);
			for (int j = 1; j <= k; j++) {
				if (i % j == 0) {
					sum += j;
				}
				if (i == sum) {
					System.out.println("������ :" + i);
					TN += 1;
				}
			}

		}
		System.out.println("���� ���� ���� ����:" + TN);
	}

}
