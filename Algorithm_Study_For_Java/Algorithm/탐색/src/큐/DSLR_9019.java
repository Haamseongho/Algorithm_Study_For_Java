package 큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DSLR_9019 {

	private static Scanner scanner;
	private static Queue<Integer> queue; // now , next가 담길 것
	private static int[] dist;
	private static boolean visit[];
	private static final int MAX = 10001;
	private static char[] strategy; // 전략
	private static int[] from; // 어디서 출발 했는가?
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // 테스트 케이스
		
		while(t --> 0) {
			int first = scanner.nextInt(); // 처음 값
			int last = scanner.nextInt(); //   바뀔 값
			
			queue = new LinkedList<Integer>();
			dist = new int[MAX];
			visit = new boolean[MAX];
			strategy = new char[MAX];
			from = new int[MAX];
			
			dist[first] = 0;
			visit[first] = true;
			from[first] = -1; // 처음 시작은 없다고 하자 왜냐하면 전략 면에서는 시작 점이 필요가 없기 때문 
			queue.add(first);
			
			while(!queue.isEmpty()) {
				int now = queue.remove();
				// D 시작
				int next = (now * 2) % 10000;
				
				
				if(!visit[next]) {
					queue.add(next);
					dist[next] = dist[now] + 1;
					from[next] = now; // 다음 노드를 담는 배열은 인덱스가 다음에따라 값은 현재 이동 전 노드 값을 부르면 된다.
					strategy[next] = 'D'; 
					visit[next] = true;
				}
				
				next = now - 1;
				if(next == -1) {
					next = 9999;
				}
				
				if(!visit[next]) {
					queue.add(next);
					dist[next] = dist[now] + 1;
					from[next] = now;
					strategy[next] = 'S';
					visit[next] = true;
				}
				
				next = (now % 1000) * 10 + (now / 1000);
				if(!visit[next]) {
					queue.add(next);
					dist[next] = dist[now] + 1;
					from[next] = now;
					strategy[next] = 'L';
					visit[next] = true;
				}
				
				next = (now % 10) * 1000 + (now / 10);
				if(!visit[next]) {
					queue.add(next);
					dist[next] = dist[now] + 1;
					from[next] = now;
					strategy[next] = 'R';
					visit[next] = true;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			while(last != first) {
				sb.append(strategy[last]);
				last = from[last];
			}
			System.out.println(sb.reverse());
		}
	}
}
