package makeNumberOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class 영역구하기 {

	static boolean[] visit;
	static int M;
	static int N;
	static int canvas[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt(); // 세로
		N = sc.nextInt(); // 가로
		int K = sc.nextInt(); // 도형의 갯수 (그려 질)
		canvas = drawCanvas(M, N, K);
		visit = new boolean[N];

		for (int i = 0; i < K; i++) {
			// 도형 그릴 수 만큼 scanner 돌리기 (직사각형 왼쪽 꼭지점 좌표 & 오른쪽 꼭지점 좌표)
			drawBoxOnCanvas(canvas, sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(canvas[i][j]);
			}
			System.out.println("");
		}

		checkNumberInBox(canvas, M, N);
	}

	private static void checkNumberInBox(int[][] canvas, int m, int n) {

		for (int i = 0; i < n; i++) {
			dfs(i);
		}
	}

	private static int[][] drawCanvas(int M, int N, int K) {

		canvas = new int[M + 1][N + 1];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				canvas[i][j] = 0; // 빈 배경 그려주기 (0은 흰색 배경)
			}
		}
		return canvas;
	}

	private static void drawBoxOnCanvas(int[][] canvas, int x1, int y1, int x2, int y2) {
		for (int i = x1; i < x2; i++) {
			for (int j = y1; j < y2; j++) {
				canvas[j][i] = 1; // (x1,y1) 부터 해서 (x2,y2) 까지 1로 색칠하기 (1은 검정색
									// 배경)
			}
		}
	}

	private static void dfs(int i) {
		visit[i] = true;
		for (int j = 0; j < N ; j++) {
			if (canvas[i][j] == 1 && visit[j] == false) {
				System.out.print(i+"/"+j);
				dfs(j);
			}
		}
	}
}
