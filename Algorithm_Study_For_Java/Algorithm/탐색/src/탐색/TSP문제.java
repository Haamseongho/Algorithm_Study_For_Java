package 탐색;

import java.util.Arrays;
import java.util.Scanner;

public class TSP문제 {

	private static Scanner scan;

	private static boolean next_permutation(int[] A) {
		int i = A.length - 1;
		while (i > 0 && A[i - 1] >= A[i]) {
			i -= 1;
		}

		if (i <= 0)
			return false;

		int j = A.length - 1;
		while (A[i - 1] >= A[j]) {
			j -= 1;
		}

		int tmp = A[i - 1];
		A[i - 1] = A[j];
		A[j] = tmp;

		j = A.length - 1;
		while (i < j) {
			int tmp2 = A[i];
			A[i] = A[j];
			A[j] = tmp2;
			i += 1;
			j -= 1;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제 : 하나의 도시에서 시작하는데 N개의 모든 도시를 거쳐서 다시 원래의 도시로 돌아온다. 단 한 번 간 곳은 돌아올 수 없다. 이 때
		 * 가장 적은 비용을 구해라
		 */

		/*
		 * 해야할 것 1. 기획 / N의 최대 범위를 구한다 --> 이 만큼 반복문을 돌 예정 2. 2<= N && N <= 10이면 최대 범위
		 * 10으로 반복문을 돌린다. 3. 반복문을 돌리기 이 전에 배열을 먼저 오름차순으로 정리한다. 4. N번 반복을 할 때 그 안에서 다음 순열
		 * 공식을 이용하여 계속해서 배치한다. 5. w[i][j] 는 i->j 로 갈 때 드는 비용을 의미한다. 6. w[i][j] == 0 일 경우
		 * 갈 수 없는 것이기 때문에 조건을 둘 때에도 신경을 써야 한다.
		 * 
		 */
		scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] w = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				w[i][j] = scan.nextInt();
			}
		}

		int d[] = new int[N]; // (지나야할 구간을 의미할 예정)

		for (int i = 0; i < N; i++)
			d[i] = i;

		// (0~N-1번 노드까지 있음)

		// Arrays.sort(d);

		int ans = Integer.MAX_VALUE; // 임의의 최대 값

		do {
			boolean move = true;
			int sum = 0;
			for (int i = 0; i < N - 1; i++) {
				if (w[d[i]][d[i + 1]] == 0) {
					move = false;
				} else {
					sum += w[d[i]][d[i + 1]];

				}

			}

			if (move && (w[d[N - 1]][d[0]] != 0)) {
				sum += w[d[N - 1]][d[0]];
				if (ans > sum)
					ans = sum;
			}

		} while (next_permutation(d));
		
		
		System.out.println(ans);
	}

}
