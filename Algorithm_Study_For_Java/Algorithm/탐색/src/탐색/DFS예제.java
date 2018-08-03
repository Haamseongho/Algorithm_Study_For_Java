package 탐색;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DFS예제 {

	private static boolean[] visit;
	private static Scanner scanner;
	private static boolean flag;
	// 노드1은 6과 5에 연결
	private static ArrayList<ArrayList<Integer>> nodes;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		visit = new boolean[N + 1];
		stack = new Stack<>();

		nodes = new ArrayList<>(N + 1); // 노드 만들기
		for (int i = 0; i < N + 1; i++) {
			nodes.add(new ArrayList<>());
			// 각 인접 노드들을 리스트로 넣기 위해서 모든 노드에 대해서 ArrayList를 안에다가 생성해줌
		}

		for (int i = 0; i < N; i++) {
			int s1 = scanner.nextInt();
			int s2 = scanner.nextInt();
			nodes.get(s1).add(s2);
			nodes.get(s2).add(s1);
			// 각 노드 별로 연결 지어주고 서로서로
		}

		// flag = true;
		dfs(nodes, visit, flag, 1);
	}

	private static void dfs(ArrayList<ArrayList<Integer>> nodes2, boolean[] visit, boolean flag, int i) {
		// 시작점 받고 시작
		visit[i] = true;
		Stack<Integer> stack = new Stack<>();
		int n = nodes2.size() - 1;
		stack.push(i);

		System.out.print(i + " ");
		while (!stack.isEmpty()) {
			int v2 = stack.peek();
			flag = false;

			for (int j = 1; j <= n; j++) {
				if ((nodes.get(v2).get(j) == 1) && (!visit[j])) {
					stack.push(j);
					System.out.print(j + " ");
					visit[j] = true;
					flag = true;
					break;
				}
			}
			if (!flag)
				stack.pop();
		}
		
	}
}
