package algorithm;

import java.util.Scanner;

public class 순열의순서 {

	private static Scanner scanner;
	private static boolean[] bool;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] array = new int[N];
		int[] sec_array = new int[N]; // 예제 입력 2
		int M = scanner.nextInt();
		bool = new boolean[21];

		if (M == 1) {
			// 값 채우기
			for (int i = 0; i < N; i++) {
				array[i] = (i + 1);
			}

			int times = scanner.nextInt(); // 몇 번 쨰 순열인지 체크
			// 순서 입력 받고 그 순서에 맞는 순열 반환
			for (int j = 0; j < N; j++) {
				// 아래 조건을 만족시키는 j의 값을 구하기 --> 2가 나올텐데
				// 2 < 3 --> j는 2임!!
				//
				int key = N - j;
				int key_index = factorial(key);
				if (key_index < times) {
					int main_key = j;

					// value 값으로 우선 j 값을 먼저 구하고 j값으로 자릿수 파악한 뒤 j-1 인덱스를 갖는 값과 j를 인덱스로 갖는 값의
					// 자리를 바꿔준다. 그리고 나서 다시 비교
					// key에 대한 인덱스 위치의 값으로 비교
					// 아마 key의 인덱스를 갖는 값과 times를 비교했을 때 times가 더 작게 될 것이다.
					// 그러면 times보다 작은 인덱스 (그 다음 인덱스)를 구한 다음
					// 또 j-1 인덱스 (이 전에 key)랑 자리교체를 한 뒤 비교하면서 작업 한다.
					// 더 이상 j의 값이 물러 설 곳이 없을 때 그것이 답이다.

					int temp = array[main_key];
					array[main_key] = array[main_key - 1];
					array[main_key - 1] = temp;

					times -= key_index;
					j = 0;
					continue;
				} else if (key_index == 1) {
					// System.out.println("(Last)" + key_index);
					for (int i = 0; i < array.length; i++) {
						System.out.print(array[i] + " ");
					}
				}
			}
		} else if (M == 2) {// 주어진순열이 몇번째순열?
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = scanner.nextInt();
			}
			

			/*long result = 0;
			boolean[] c = new boolean[N + 1];
			long[] f = new long[N + 1];
			for (int i = 0; i < N; i++) {
				for (int j = 1; j < arr[i]; j++) {
					if (c[j] == false) {
						result += f[N - i - 1];
					}
				}
				c[arr[i]] = true;
			}
			System.out.println(result + 1);*/
		}
	}

	static int factorial(int n) {
		if (n == 1)
			return 1;

		else if (n >= 2) {
			return (n * factorial(n - 1));
		}
		/*
		 * return n * factorial(n - 1); else
		 */
		return 0;
	}
}
