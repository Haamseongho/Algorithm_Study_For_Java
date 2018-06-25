package ť;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DSLR_9019 {

	private static Scanner scanner;
	private static Queue<Integer> queue; // now , next�� ��� ��
	private static int[] dist;
	private static boolean visit[];
	private static final int MAX = 10001;
	private static char[] strategy; // ����
	private static int[] from; // ��� ��� �ߴ°�?
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // �׽�Ʈ ���̽�
		
		while(t --> 0) {
			int first = scanner.nextInt(); // ó�� ��
			int last = scanner.nextInt(); //   �ٲ� ��
			
			queue = new LinkedList<Integer>();
			dist = new int[MAX];
			visit = new boolean[MAX];
			strategy = new char[MAX];
			from = new int[MAX];
			
			dist[first] = 0;
			visit[first] = true;
			from[first] = -1; // ó�� ������ ���ٰ� ���� �ֳ��ϸ� ���� �鿡���� ���� ���� �ʿ䰡 ���� ���� 
			queue.add(first);
			
			while(!queue.isEmpty()) {
				int now = queue.remove();
				// D ����
				int next = (now * 2) % 10000;
				
				
				if(!visit[next]) {
					queue.add(next);
					dist[next] = dist[now] + 1;
					from[next] = now; // ���� ��带 ��� �迭�� �ε����� ���������� ���� ���� �̵� �� ��� ���� �θ��� �ȴ�.
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
