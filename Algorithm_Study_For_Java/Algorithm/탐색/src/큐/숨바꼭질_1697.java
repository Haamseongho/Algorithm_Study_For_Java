package ť;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ���ٲ���_1697 {

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

		dist = new int[MAX]; // max ���� 100,000
		visit = new boolean[MAX];
		
		visit[N] = true;
		dist[N] = 0;
		queue.add(N);
		
		while (!queue.isEmpty()) {
			int here = queue.remove();
			if (here - 1 >= 0) {
				if (visit[here - 1] == false) {
					// ó���� �˴� false�� ����Ʈ�� ����
					// false�� ��� queue�� �־��ֱ�
					queue.add(here - 1);
					visit[here - 1] = true;
					dist[here - 1] = dist[here] + 1; // �ռ� �ִ� �� ���� �ϳ� Ŀ����.
				}
			}

			if (here + 1 < MAX) {
				if (visit[here + 1] == false) {
					queue.add(here + 1);
					visit[here + 1] = true;
					dist[here + 1] = dist[here] + 1; // �ռ� �ִ� �� ���� �ϳ� ����
				}
			}

			if (here * 2 < MAX) {
				if (visit[here * 2] == false) {
					queue.add(here * 2);
					visit[here * 2] = true;
					dist[here * 2] = dist[here] + 1; // here*2�� �ռ� �ִ� here ���� �ϳ� �� ����.
				}
			}
		}
		System.out.println(dist[M]);
	}
}
