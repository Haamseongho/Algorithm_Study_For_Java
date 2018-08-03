package Ž��;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DFS���� {

	private static boolean[] visit;
	private static Scanner scanner;
	private static boolean flag;
	// ���1�� 6�� 5�� ����
	private static ArrayList<ArrayList<Integer>> nodes;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		visit = new boolean[N + 1];
		stack = new Stack<>();

		nodes = new ArrayList<>(N + 1); // ��� �����
		for (int i = 0; i < N + 1; i++) {
			nodes.add(new ArrayList<>());
			// �� ���� ������ ����Ʈ�� �ֱ� ���ؼ� ��� ��忡 ���ؼ� ArrayList�� �ȿ��ٰ� ��������
		}

		for (int i = 0; i < N; i++) {
			int s1 = scanner.nextInt();
			int s2 = scanner.nextInt();
			nodes.get(s1).add(s2);
			nodes.get(s2).add(s1);
			// �� ��� ���� ���� �����ְ� ���μ���
		}

		// flag = true;
		dfs(nodes, visit, flag, 1);
	}

	private static void dfs(ArrayList<ArrayList<Integer>> nodes2, boolean[] visit, boolean flag, int i) {
		// ������ �ް� ����
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
