import java.util.Scanner;

import javax.swing.plaf.metal.MetalTheme;

public class ����_��_�����ϴ�_�κм��� {

	private static Scanner scanner;
	private static int[] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		d = new int[n + 1]; // a[0] ~ a[n] ������ �� �� ���� �� �κм����� ��
		a = new int[n + 1]; // a[0] ~ a[n] ���� ����

		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();

		/*
		 * ���� 1. �����ϴ� �����̾�� �Ѵ�. --> �������� ������ �켱 1���� ���� (���� 1���� ����������..) 2. �ε��� j�� i���� ��
		 * ĭ ���� ����� �����Ѵٸ�, j<i�̸� A[j]<A[i] �̾�� �Ѵ�. 3. 2�� ������ �����ϸ鼭 ���� ū ���� ���ؼ� D[i]��
		 * �־��ָ鼭 +1�� ���ָ� �ȴ�. (������ j�� i���� �ε����� �ϳ��� ���� ���̱� �����̴�.
		 */
		// d[i] ���� ��� �켱 1�� ������ ���ϴ�.
		// ���⼭ ū ���� �ٲ��ִ� �������� ����

	
		for (int i = 0; i < n; i++) {
			d[i] = 1;
			for (int j = 0; j < i; j++) {
				// a[i] > a[j] �� �⺻ ����
				// d[i] = Math.max(d[j]) + 1 --> �� ���� ��, d[i]�� ��� ���鼭 d[j] + 1�� ���ؼ�
				// d[j] + 1�� �� ũ�� d[i]�� ��ϵ� .
				// �� ������ �ݺ��Ǹ� �ᱹ ���� ū ���� d[i]�� �� ��
				if (a[i] > a[j] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++)
			ans = Math.max(d[i], ans);

		System.out.println(ans);

	}

}
