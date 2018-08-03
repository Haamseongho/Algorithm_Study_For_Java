package 탐색2;

import java.util.ArrayList;
import java.util.Scanner;

public class 소수의연속합 {

	private static Scanner scanner;
	private static int N;
	private static int[] nums;
	private static boolean[] check;
	private static ArrayList<Integer> input;

	// 에라토스테네스 알고리즘 접근 방법
	private static boolean isPrime(int N) {

		check = new boolean[N+1];
		// 우선 모든 수가 소수라는 전제로, 소수인지 체크하는 함수를 true 주기
		for (int i = 0; i < N; i++)
			check[i] = true;

		int to = (int) Math.sqrt(N);
		boolean isPrime = true;

		// 2부터 나우어야할 값의 제곱근까지의 수로 나누었을 때 나눠지면 소수가 아님
		for (int i = 2; i <= to; i++) {
			if (N % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		N = scanner.nextInt();
		nums = new int[N];
		input = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			nums[i] = (i + 2);
		}
		// 예를 들어 N이 41이라면 41미만의 모든 자연수를 체크한다. (단 , 1을 제외해야한다)

		for (int j = 0; j < N; j++) {
			if (isPrime(nums[j])) {
				// 소수
				input.add(nums[j]);
				// System.out.println("소수 : " + nums[j]);
			}
		}

		// input 배열을 이제 기존처럼 돌릴 예정 이걸 가지고
		int left = 0;
		int right = 0;
		int sum = input.size() == 0 ? 0 : input.get(0);
		int count = 0;

		// System.out.println("line index : " + line);
		while (left <= right && right < input.size()) {
			if (sum <= N) {
				if (sum == N)
					count += 1;
				// right 이동 후 sum에 더해준다. (line은 sum이 크거나 같을 때만)
				right += 1;
				if (right < input.size())
					sum += input.get(right);
			} else {
				sum -= input.get(left++);
			}
		}
		System.out.println(count);
	}
}
