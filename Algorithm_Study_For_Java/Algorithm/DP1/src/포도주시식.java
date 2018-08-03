import java.util.Scanner;
public class 포도주시식 {

	private static Scanner scanner;
	private static int[][] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 포두주 잔의 개수 n개
		// 1부터 n+1번째까지 포도주 양 체크
		a = new int[n + 1];

		// n은 10000 이하 , 포도주의 양은 1000이하 이기 때문에 충분히 int로 해도 된다.
		for (int i = 1; i <= n; i++) {
			a[i] = scanner.nextInt(); // 포도주의 양
		}

		d = new int[n + 1][3]; // 0번 연속 , 1번 연속 , 2번연속

		for (int i = 1; i <= n; i++) {
			d[i][0] = Math.max(d[i - 1][0], Math.max(d[i - 1][1], d[i - 1][2])); // 연속 x
			d[i][1] = d[i - 1][0] + a[i];
			d[i][2] = d[i - 1][1] + a[i];
		}

		long ans = 0;
		ans += Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
		System.out.println(ans);
	}

}
