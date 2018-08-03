import java.util.Scanner;

public class 계단오르기_1차원DP {

	private static Scanner scanner;
	private static int[] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		// d[i] = i번째 계단에 올라갔을 때 최대 점수.
		// 1회 연속 --> i-1번째 계단은 패스 , i-2번째 부터 체크
		// 2회 연속 --> i-1번째 계단도 밟으면서 i번째 점프
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
