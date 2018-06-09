package 큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 소수_경로 {

	private static Scanner scanner;
	private static boolean[] isPrime; // 소수 판단
	private static int[] dist;
	private static final int MAX = 10001; // 1000<= N < 10000 (10000-1000 = 9000)
	private static Queue<Integer> queue;
	private static boolean[] visit; // 이동 경로 판단

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		// Test case 갯수
		isPrime = new boolean[MAX]; // 지나갈 노드가 소수로 판명될 떄
		
		for(int i=2;i<=10000;i++)
			isPrime[i] = true;
		for (int i = 2; i <= Math.sqrt(10000); i++) {
			if (isPrime[i]) {
				// 소수가 아닐 경우 에라토스테네스 알고리즘 사용해서 소수인지 파악하기.
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
			
			dist = new int[MAX]; // 이동간 횟수
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
					// 네 자리 숫자 변경
					for (int j = 0; j <= 9; j++) {
						// 바꿀 수 있는 수 9가지
						int next = change(now, i, j); // 현재 노드에서 i,j를 통해서 다음 노드로 이동
						if(next != -1) {
							if (!visit[next] && isPrime[next]) { // 방문하지 않고 소수가 아닐 때
								// 방문 하지 않은 곳
								visit[next] = true;
								queue.add(next); // 지나온 노드 큐에 넣기
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
		// n이 위치이고 m이 바꿀 것
		if(n == 0 && m == 0) {
			return -1;
		}
		String numStr = Integer.toString(num);
		StringBuilder builder = new StringBuilder(numStr);
		builder.setCharAt(n, (char) (m + '0'));
		return Integer.parseInt(builder.toString());
	}
}
