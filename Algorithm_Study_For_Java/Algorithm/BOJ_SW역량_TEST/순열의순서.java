package algorithm;

import java.util.Scanner;

public class �����Ǽ��� {

	private static Scanner scanner;
	private static boolean[] bool;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] array = new int[N];
		int[] sec_array = new int[N]; // ���� �Է� 2
		int M = scanner.nextInt();
		bool = new boolean[21];

		if (M == 1) {
			// �� ä���
			for (int i = 0; i < N; i++) {
				array[i] = (i + 1);
			}

			int times = scanner.nextInt(); // �� �� �� �������� üũ
			// ���� �Է� �ް� �� ������ �´� ���� ��ȯ
			for (int j = 0; j < N; j++) {
				// �Ʒ� ������ ������Ű�� j�� ���� ���ϱ� --> 2�� �����ٵ�
				// 2 < 3 --> j�� 2��!!
				//
				int key = N - j;
				int key_index = factorial(key);
				if (key_index < times) {
					int main_key = j;

					// value ������ �켱 j ���� ���� ���ϰ� j������ �ڸ��� �ľ��� �� j-1 �ε����� ���� ���� j�� �ε����� ���� ����
					// �ڸ��� �ٲ��ش�. �׸��� ���� �ٽ� ��
					// key�� ���� �ε��� ��ġ�� ������ ��
					// �Ƹ� key�� �ε����� ���� ���� times�� ������ �� times�� �� �۰� �� ���̴�.
					// �׷��� times���� ���� �ε��� (�� ���� �ε���)�� ���� ����
					// �� j-1 �ε��� (�� ���� key)�� �ڸ���ü�� �� �� ���ϸ鼭 �۾� �Ѵ�.
					// �� �̻� j�� ���� ���� �� ���� ���� �� �װ��� ���̴�.

					int temp = array[main_key];
					array[main_key] = array[main_key - 1];
					array[main_key - 1] = temp;

					times -= key_index;
					j = 0;
					continue;
				} else if (key_index == 1) {
					// System.out.println("(Last)" + key_index);
					for (int i = 0; i < array.length; i++) {
						System.out.print(array[i] + " ");
					}
				}
			}
		} else if (M == 2) {// �־��������� ���°����?
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = scanner.nextInt();
			}
			

			/*long result = 0;
			boolean[] c = new boolean[N + 1];
			long[] f = new long[N + 1];
			for (int i = 0; i < N; i++) {
				for (int j = 1; j < arr[i]; j++) {
					if (c[j] == false) {
						result += f[N - i - 1];
					}
				}
				c[arr[i]] = true;
			}
			System.out.println(result + 1);*/
		}
	}

	static int factorial(int n) {
		if (n == 1)
			return 1;

		else if (n >= 2) {
			return (n * factorial(n - 1));
		}
		/*
		 * return n * factorial(n - 1); else
		 */
		return 0;
	}
}
