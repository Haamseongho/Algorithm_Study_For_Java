import java.util.Scanner;

import javax.swing.plaf.metal.MetalTheme;

public class 가장_긴_증가하는_부분수열 {

	private static Scanner scanner;
	private static int[] d;
	private static int[] a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		d = new int[n + 1]; // a[0] ~ a[n] 까지의 값 중 가장 긴 부분수열의 값
		a = new int[n + 1]; // a[0] ~ a[n] 값이 있음

		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();

		/*
		 * 조건 1. 증가하는 수열이어야 한다. --> 증가하지 않으면 우선 1부터 시작 (원래 1부터 시작하지만..) 2. 인덱스 j는 i보다 한
		 * 칸 작은 수라고 가정한다면, j<i이며 A[j]<A[i] 이어야 한다. 3. 2번 조건을 만족하면서 가장 큰 값을 구해서 D[i]에
		 * 넣어주면서 +1을 해주면 된다. (이유는 j가 i보다 인덱스상 하나가 적은 값이기 때문이다.
		 */
		// d[i] 값은 모두 우선 1을 가지고 들어갑니다.
		// 여기서 큰 값을 바꿔주는 형식으로 진행

	
		for (int i = 0; i < n; i++) {
			d[i] = 1;
			for (int j = 0; j < i; j++) {
				// a[i] > a[j] 는 기본 조건
				// d[i] = Math.max(d[j]) + 1 --> 이 말인 즉, d[i]를 계속 돌면서 d[j] + 1과 비교해서
				// d[j] + 1이 더 크면 d[i]에 등록됨 .
				// 이 과정이 반복되면 결국 가장 큰 값이 d[i]에 들어갈 것
				if (a[i] > a[j] && d[i] < d[j] + 1) {
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
