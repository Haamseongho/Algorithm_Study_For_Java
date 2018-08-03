import java.util.Scanner;

public class 가장_큰_증가하는_부분수열 {

	private static Scanner scanner;
	private static int[] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		d = new int[n];
		a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			d[i] = a[i];
			for (int j = 0; j < n; j++) {
				if (a[i] > a[j] && d[i] < d[j] + a[i]) {
					d[i] = d[j] + a[i];
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < n; i++)
			ans = Math.max(d[i], ans);
		System.out.println(ans);
 	}

}
