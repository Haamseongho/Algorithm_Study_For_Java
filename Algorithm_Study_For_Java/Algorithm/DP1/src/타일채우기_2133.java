import java.util.Scanner;

public class 타일채우기_2133 {
	private static Scanner scanner;
	private static long[] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		d = new long[n + 1];

		d[0] = 1; // d[0] 이란 것은 사실 3*0은 채울 것이 없음에도 불구하고 아무것도 없지만 초기 값을 1로 잡아준다. (경우의 수라해서.. 상당히 심오한 부분)
		// 점화식이 세워졌다면 시간복잡도를 먼저 계산하고 이를 통해서 반복문이 얼마나 나올 것인지 체크한다.
		// 변수로 선언한 점화식을 식으로 그대로 옮기면 DP는 완성이다.
		
		for (int i = 2; i <= n; i++) {
			d[i] = 3 * d[i - 2];
			// 초기 설정 값 --> i-2 자리는 그대로 값이 유지되므로
			for (int j = 1; j <= (i / 2) - 1; j++) {
				d[i] += 2 * d[i - 2 * (j + 1)];
			}
		}
		System.out.println(d[n]);
	}

}
