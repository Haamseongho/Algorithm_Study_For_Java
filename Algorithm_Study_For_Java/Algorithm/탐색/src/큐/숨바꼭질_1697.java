package 큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 숨바꼭질_1697 {

	private static Queue<Integer> queue;
	private static Scanner scanner;
	private static int[] dist;
	private static boolean[] visit;
	private static final int MAX = 1000000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue = new LinkedList<Integer>();
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();

		dist = new int[MAX]; // max 범위 100,000
		visit = new boolean[MAX];
		
		visit[N] = true;
		dist[N] = 0;
		queue.add(N);
		
		while (!queue.isEmpty()) {
			int here = queue.remove();
			if (here - 1 >= 0) {
				if (visit[here - 1] == false) {
					// 처음엔 죄다 false로 디폴트로 잡힘
					// false일 경우 queue에 넣어주기
					queue.add(here - 1);
					visit[here - 1] = true;
					dist[here - 1] = dist[here] + 1; // 앞서 있는 것 보단 하나 커야함.
				}
			}

			if (here + 1 < MAX) {
				if (visit[here + 1] == false) {
					queue.add(here + 1);
					visit[here + 1] = true;
					dist[here + 1] = dist[here] + 1; // 앞서 있는 것 보다 하나 많음
				}
			}

			if (here * 2 < MAX) {
				if (visit[here * 2] == false) {
					queue.add(here * 2);
					visit[here * 2] = true;
					dist[here * 2] = dist[here] + 1; // here*2는 앞서 있는 here 보다 하나 더 많음.
				}
			}
		}
		System.out.println(dist[M]);
	}
}
