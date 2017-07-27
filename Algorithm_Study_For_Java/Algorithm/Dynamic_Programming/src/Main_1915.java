import java.util.Scanner;

public class Main_1915 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int d[] = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = a[i];
			if (i == 0)
				continue;
			if (d[i] < d[i - 1] + a[i]) {
				d[i] = d[i - 1] + a[i];
			}
		}
		int ans = d[0]; // 최대값을 d[0]으로 잡는다 (가장 먼저 나올 것)
		for (int i = 1; i < n; i++) {
			if (ans < d[i])
				ans = d[i];
		}

		System.out.println(ans);
	}

}
