package makeNumberOne;

import java.util.Scanner;

public class makeNumberOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int answer = dividedByNumbers(num);
		System.out.println(answer);
	}

	public static int dividedByNumbers(int n) {
		int d[] = new int[n + 1]; // d[n] (n���� �����ؼ� 1������ �������� ��ġ�� Ƚ��)
		
		if (n == 1)
			return 0; // n�� 1�̸� �� �� ����? ������ 1���� 1���°ǵ� 0����
		if (d[n] > 0)
			return d[n]; // ������ ���� 0 �̻��� ��� ������ �����ϱ� >> 2�� 3�� �ɸ��� �ʴ´ٴ� ������
	
		d[n] = dividedByNumbers(n-1) + 1; // �׻� �� ���� �Ѿ�� +1 �Ǿ�� ��
		if (n % 3 == 0) {
			// 3���� ������ ������ ���
			int temp = dividedByNumbers(n / 3) + 1; // �̵� Ƚ�� +1
			if (d[n] > temp) {
				d[n] = temp; // �翬�� temp�� �� ���ƾ��ϴµ� d[n]�� ���� ��� switch������� >> ��λ�
								// �ּ� ���� ���ϴ� ���̱� ����
			}
		}
		if (n % 2 == 0) {
			int temp = dividedByNumbers(n / 2) + 1;
			if (d[n] > temp) {
				d[n] = temp;
			}
		}
		return d[n];
	}
}