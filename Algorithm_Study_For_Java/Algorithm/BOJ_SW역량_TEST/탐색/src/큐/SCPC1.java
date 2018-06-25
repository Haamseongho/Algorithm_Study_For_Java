package 큐;

import java.util.Scanner;

public class SCPC1 {

	private static Scanner scanner;
	private static int[] Ai;
	private static int[] Aj;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int T = scanner.nextInt(); // 테스트케이스
		int n = scanner.nextInt(); // 선수의 숫자
		Ai = new int[n];
		Aj = new int[n];
		int K = scanner.nextInt(); // 실력 차이 : K

		int cnt = 1;
		
		while(T-->0) {
			for (int i = 0; i < n; i++) {
				Ai[i] = scanner.nextInt();
				Aj[i] = scanner.nextInt();

				if (Math.abs(Ai[i] - Aj[i]) <= K) {
					cnt += 1;
				}
			}
		}
	
		System.out.println(cnt);
	}

}
