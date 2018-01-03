package makeNumberOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class 영역구하기 {
	static int M;
	static int N;
	static int[][] canvas;
	static int result[];
	static boolean[][] visit;
	static int tmp;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		M = scanner.nextInt();
		N = scanner.nextInt();
		// 2차원 행렬 그리기 [여기서 주의해야할 점은 AxB 행렬이면 A가 행이고 B가 열이란 점
		canvas = new int[M][N];
		visit = new boolean[M][N];

		int K = scanner.nextInt(); // 도형 그리는 횟수 (K)
		// (x1,y1) , (x2,y2) >> 좌하단 , 우상단으로 도형그리기
		// N이 결국 열이기에 좌우로 움직이는 부분 M이 행이기에 상하로 움직이는 부분이므로 다음과 같이 바꿔서 반복문을 정의해야
		// 한다.

		for (int i = 0; i < K; i++) {
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			// 그릴 도형의 꼭짓점 정의

			for (int x = x1; x < x2; x++) {
				for (int y = y1; y < y2; y++) {
					canvas[y][x] = 1;
				}
			}
		}

		int cnt = 0; // 해당 값의 갯수 구하기 위함
		result = new int[100];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if ((tmp = dfs(i, j)) > 0) {
					result[cnt] = tmp;
					cnt += 1;
				}
			}
		}
		Arrays.sort(result, 0, cnt); // sort 할 배열의 이름을 넣어주고 어디서부터 어디까지 sorting할
										// 것인지 말한다. (0부터 cnt까지)
		System.out.println(cnt);
		for (int i = 0; i < cnt; i++) {
			System.out.print(result[i] + " ");
		}
	}

	// x좌표가 열이고 y좌표가 행이란 것 잊지말기
	private static int dfs(int y, int x) {
		// 먼저 해야할 것
		// 재귀함수는 종료조건 설정과 구체화 >> 추상적 개념으로 풀 것
		// 종료조건 : 그림에서 이미 1이 되어 있는 경우는 지나지 못함 + 이미 지나간 곳은 지나지 못함
		if (canvas[y][x] == 1 || visit[y][x] == true) {
			return 0;
		}
		int value = 1;
		visit[y][x] = true; // 재귀함수 돌릴 때 결국 방문하기 때문에 true 줄 것
		// 좌상단부터 시작
		// 뒤로 갈 때 0보단 커야함 && 앞으로 지나갈 곳이 0이어야함
		// 앞으로 갈 땐 상자 크기보단 작아야함
		// 위로갈 땐 0보다 커야함
		// 아래로 갈 땐 상자 사이즈 보다 작아야함
		if (x + 1 < N && canvas[y][x + 1] == 0) {
			value += dfs(y, x + 1);
		}

		if (x - 1 > 0 && canvas[y][x - 1] == 0) {
			value += dfs(y, x - 1);
		}

		if (y + 1 < M && canvas[y + 1][x] == 0) {
			value += dfs(y + 1, x);
		}

		if (y - 1 > 0 && canvas[y - 1][x] == 0) {
			value += dfs(y - 1, x);
		}

		return value;
	}
}
