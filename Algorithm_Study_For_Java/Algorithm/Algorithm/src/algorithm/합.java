package algorithm;

import java.util.Scanner;

public class гу {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		System.out.println(solution(N));
	}

	static int solution(int N) {
		if (N > 0)
			return N + solution(N - 1);
		else
			return 0;
	}
}
