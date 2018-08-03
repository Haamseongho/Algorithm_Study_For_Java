package 큐;

import java.util.Scanner;

public class 원투쓰리더하기 {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int T = scanner.nextInt(); // 테스트 케이스
		while (T-- > 0) {
			int input = scanner.nextInt();
			int ans = solution(0, 0, input);

			// System.out.println(ans);
		}

	}

	private static int solution(int count, int sum, int goal) {
		if (sum > goal)
			return 0;
		if (sum == goal)
			return 1; // 바로 같을 경우는 1 출력 (1회)

		int ans = 0;
		//System.out.println(count + " / " + sum + " / " + goal);
		
		for (int i = 1; i <= 3; i++) {
			// 1,2,3 으로만 값을 만들어 내야 하므로
			ans += solution(count + 1, sum + i, goal);
			
			/*
			 * 1,2,3 으로 값을 구할 때 카운트는 하나씩 증가하고 그 합은 1로 구할때와 2로 구할때 3으로 구할 때 각 단계별로 1씩 추가로 더
			 * 증가하게 됩니다.
			 */
		}
		return ans;
	}
}
