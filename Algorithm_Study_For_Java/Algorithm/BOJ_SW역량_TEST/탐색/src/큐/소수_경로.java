package ť;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class �Ҽ�_��� {

	private static Scanner scanner;
	private static boolean[] isPrime; // �Ҽ� �Ǵ�
	private static int[] dist;
	private static final int MAX = 10001; // 1000<= N < 10000 (10000-1000 = 9000)
	private static Queue<Integer> queue;
	private static boolean[] visit; // �̵� ��� �Ǵ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		// Test case ����
		isPrime = new boolean[MAX]; // ������ ��尡 �Ҽ��� �Ǹ�� ��
		
		for(int i=2;i<=10000;i++)
			isPrime[i] = true;
		for (int i = 2; i <= Math.sqrt(10000); i++) {
			if (isPrime[i]) {
				// �Ҽ��� �ƴ� ��� �����佺�׳׽� �˰��� ����ؼ� �Ҽ����� �ľ��ϱ�.
				for (int j = i ; j*i <= 10000; j++) {
					isPrime[i*j] = false;
				}
			}
		}
	/*	
		for(int i=0;i<=10000;i++)
			isPrime[i] = !isPrime[i];
*/
		while (T-- > 0) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			
			dist = new int[MAX]; // �̵��� Ƚ��
			visit = new boolean[MAX];

			dist[n] = 0;
			visit[n] = true;
			queue = new LinkedList<Integer>();
			queue.add(n);

			while (!queue.isEmpty()) {
				int now = queue.remove();
				// visit[n] == visit[now]
				// dist[n] == dist[now]
				for (int i = 0; i < 4; i++) {
					// �� �ڸ� ���� ����
					for (int j = 0; j <= 9; j++) {
						// �ٲ� �� �ִ� �� 9����
						int next = change(now, i, j); // ���� ��忡�� i,j�� ���ؼ� ���� ���� �̵�
						if(next != -1) {
							if (!visit[next] && isPrime[next]) { // �湮���� �ʰ� �Ҽ��� �ƴ� ��
								// �湮 ���� ���� ��
								visit[next] = true;
								queue.add(next); // ������ ��� ť�� �ֱ�
								dist[next] = dist[now] + 1;
							}
						}
					}
				}
			}
			System.out.println(dist[m]);
		}

	}

	private static int change(int num, int n, int m) {
		// num --> 1033
		// i --> 0 , j --> 0
		// n�� ��ġ�̰� m�� �ٲ� ��
		if(n == 0 && m == 0) {
			return -1;
		}
		String numStr = Integer.toString(num);
		StringBuilder builder = new StringBuilder(numStr);
		builder.setCharAt(n, (char) (m + '0'));
		return Integer.parseInt(builder.toString());
	}
}
