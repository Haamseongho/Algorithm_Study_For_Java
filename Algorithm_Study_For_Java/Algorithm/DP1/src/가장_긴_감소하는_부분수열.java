import java.util.Scanner;

public class 가장_긴_감소하는_부분수열 {

	private static Scanner scanner;
	private static int[] a;
	private static int[] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		a = new int[n];
		d = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			d[i] = 1;
			for (int j = 0; j < i; j++) {
				if (a[i] < a[j] && d[i] < d[j] + 1) {
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
