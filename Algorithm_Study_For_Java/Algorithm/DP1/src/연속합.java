import java.util.Scanner;

public class 연속합 {

	private static Scanner scanner;
	private static int[] d;
	private static int[] p;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		d = new int[n];
		p = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			d[i] = p[i];
			if (i == 0)
				continue;

			if (d[i] < d[i - 1] + p[i]) {
				d[i] = d[i - 1] + p[i];
				if (d[i] < p[i]) {
					d[i] = p[i];
				}
			}
		}

		int ans = d[0]; // ans = d[0]으로 해야함 --> 음수를 포함할 수도 있기 때문에
		for (int i = 1; i < n; i++)
			ans = Math.max(d[i], ans);

		System.out.println(ans);
	}
}
