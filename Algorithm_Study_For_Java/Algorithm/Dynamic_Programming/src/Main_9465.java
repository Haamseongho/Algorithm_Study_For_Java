import java.util.ArrayList;
import java.util.Scanner;

public class Main_9465 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d[][] = new int[m+1][3];
		// ��� . m�� ���� ������ �����ϰ� 0�� �ƹ��͵� ���� ���� ��� 1�� ������ ���� 2�� �Ʒ��� ����
		int arr[][] = new int[2][m+1];
		// ���� ������Ű�� �����̰� ���� 2�� ���� m�� ���� ũ��

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt(); // �迭�� �߰�(���빰)
			}
		}
		for (int i = 1; i < m; i++) {
			d[i][0] = Math.max(d[i - 1][0], Math.max(d[i - 1][1], d[i - 1][2]));
			d[i][1] = Math.max(d[i - 1][0], d[i - 1][2]) + arr[i][1];
			d[i][2] = Math.max(d[i - 1][0], d[i - 1][1]) + arr[i][2];
		}

		long ans = 0;
		ans = Math.max(d[m][0], Math.max(d[m][1], d[m][2]));
		System.out.println(ans);
	}
}
