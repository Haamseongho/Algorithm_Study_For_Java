import java.util.Scanner;

public class ��ܿ�����_1����DP {

	private static Scanner scanner;
	private static int[] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		// d[i] = i��° ��ܿ� �ö��� �� �ִ� ����.
		// 1ȸ ���� --> i-1��° ����� �н� , i-2��° ���� üũ
		// 2ȸ ���� --> i-1��° ��ܵ� �����鼭 i��° ����
		d = new int[n + 1];
		a = new int[n + 1];
		
		for (int i = 1; i <= n; i++)
			a[i] = scanner.nextInt();
		
		d[1] = a[1];
		d[2] = a[1] + a[2];
		for (int i = 3; i <= n; i++) {
			d[i] = Math.max(d[i - 2] + a[i], d[i - 3] + a[i - 1] + a[i]);
		}
		System.out.println(d[n]);
	}
}
