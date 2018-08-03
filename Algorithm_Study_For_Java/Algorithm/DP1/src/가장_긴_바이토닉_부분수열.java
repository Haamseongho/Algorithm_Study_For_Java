import java.util.Scanner;

public class ����_��_�������_�κм��� {
	private static Scanner scanner;
	private static int[] a;
	private static int[] d1; // ����
	private static int[] d2; // ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		a = new int[n];
		d1 = new int[n];
		d2 = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			d1[i] = 1;

			for (int j = 0; j < i; j++) {
				// ����
				if (a[i] > a[j] && d1[i] < d1[j] + 1) {
					d1[i] = d1[j] + 1;
				}

			}
		}

		for (int i = n - 1; i >= 0; i--) {
			d2[i] = 1;
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j] && d2[i] < d2[j] + 1) {
					d2[i] = d2[j] + 1;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = Math.max((d1[i] + d2[i] - 1), ans);
		}

		System.out.println(ans);
	}

}
