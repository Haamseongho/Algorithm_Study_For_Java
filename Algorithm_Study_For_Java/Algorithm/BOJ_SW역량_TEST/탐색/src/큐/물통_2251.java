package 큐;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Bottle {
	int a; // A 물통에서의 물의양
	int b; // B 물통에서의 물의양
	int c; // C 물통에서의 물의양

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

}

public class 물통_2251 {

	private static Scanner scanner;
	private static Queue queue;
	private static HashMap map;
	private static boolean[][] visit;
	private static final int MAX = 201;
	private static boolean[] result;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		map = new HashMap<Integer, Integer>();
		queue = new LinkedList<Bottle>();
		visit = new boolean[MAX][MAX]; // A->B 갔는지 , B->C갔는지 이런거 체크하기 위함
		result = new boolean[MAX]; // 이동 값

		for (int i = 0; i < MAX; i++) {
			result[i] = false;
			for (int j = 0; j < MAX; j++) {
				visit[i][j] = false;
			}
		}

		// 초기에는 모두 false로 둔다. 방문을 안했다는 전제하에 시작해야하고 결과 또한 A가 다 비어있을 때 C를 반환하는 것이므로
		// 이 당시의 i 값을 출력하게 만들 것이다.

		Bottle parent = new Bottle();
		Bottle child = new Bottle();

		int A, B, C; // A,B,C에 들어갈 수 있는 물의 양
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();

		/*
		 * 6가지의 경우를 정해준다. A->B A->C B->A B->C C->A C->B 각 각 방문 했는지를 배열로 체크해준다.
		 * 
		 */

		Bottle bottle = new Bottle(); // 처음에 병에 있는 물의 양 체크
		// bottle.a --> 0
		// bottle.b --> 0
		// bottle.c --> 가득 차있음 : C
		bottle.setA(0);
		bottle.setB(0);
		bottle.setC(C);

		queue.add(bottle); // 큐에 병을 넣고 시작

		while (!queue.isEmpty()) {
			int restA = 0, restB = 0, restC = 0;
			int amountA = 0, amountB = 0, amountC = 0;
			parent = (Bottle) queue.remove();
			System.out.println(parent.getA() + "/" + parent.getB() + "/" + parent.getC());
			// 종료 조건 겸 해답
			if (parent.getA() == 0) {
				result[parent.getC()] = true;
			}
			// A->B
			if (parent.getA() + parent.getB() > B) {
				// 원래 가지고 있던 양인 parent.a와 parent.b의 값이 B라는 병이 담을 수 있는 양을 넘어 설 때
				child.setB(B); // 이동 후 (자식) 노드의 B의 양은 B다
				restA = parent.getB() + parent.getA() - B;
				child.setA(restA);
			} else {
				// 원래 가지고 있던 양인 parent.a와 parent.b의 값이 B라는 병이 담을 수 있는 양을 넘어서지 않을 경우
				amountB = parent.getA() + parent.getB();
				child.setB(amountB);
				restA = 0; // 다 담는 것임 A에 남은 양을
				child.setA(restA);
			}
			child.setC(parent.getC()); // C는 그대로

			// A->B 방문 했는지 확인하기 (parent가 넘겨주는 입장(이전 노드면) child는 넘겨 받는 입장(이 후 노드)이기 때문에
			// child로 체크해야 한다.
			if (!visit[child.getA()][child.getB()]) {
				queue.add(child);
				visit[child.getA()][child.getB()] = true;
			}

			// A->C
			if (parent.getA() + parent.getC() > C) {
				child.setC(C);
				restA = parent.getC() + parent.getA() - C;
				child.setA(restA);
			} else {
				amountC = parent.getA() + parent.getC();
				child.setC(amountC);
				restA = 0;
				child.setA(restA);
			}

			child.setB(parent.getB());

			if (!visit[child.getA()][child.getC()]) {
				queue.add(child);
				visit[child.getA()][child.getC()] = true;
			}

			// B->C
			if (parent.getB() + parent.getC() > C) {
				child.setC(C);
				restB = parent.getB() + parent.getC() - C;
				child.setB(restB);
			} else {
				amountC = parent.getC() + parent.getB();
				child.setC(amountC);
				restB = 0;
				child.setB(restB);
			}

			child.setA(parent.getA());

			if (!visit[child.getB()][child.getC()]) {
				queue.add(child);
				visit[child.getB()][child.getC()] = true;
			}

			// B->A
			if (parent.getB() + parent.getA() > A) {
				child.setA(A);
				restB = parent.getB() + parent.getA() - A;
				child.setB(restB);
			} else {
				amountA = parent.getA() + parent.getB();
				child.setA(amountA);
				restB = 0;
				child.setB(restB);
			}

			child.setC(parent.getC());

			if (!visit[child.getB()][child.getA()]) {
				queue.add(child);
				visit[child.getB()][child.getA()] = true;
			}

			// C->B

			if (parent.getC() + parent.getB() > B) {
				child.setB(B);
				restC = parent.getC() + parent.getB() - B;
				child.setC(restC);
			} else {
				amountB = parent.getB() + parent.getC();
				child.setB(amountB);
				restC = 0;
				child.setC(restC);
			}

			child.setA(parent.getA());

			if (!visit[child.getC()][child.getB()]) {
				queue.add(child);
				visit[child.getC()][child.getB()] = true;
			}

			// C->A
			if (parent.getC() + parent.getA() > A) {
				child.setA(A);
				restC = parent.getC() + parent.getA() - A;
				child.setC(restC);
			} else {
				amountA = parent.getA() + parent.getC();
				child.setA(amountA);
				restC = 0;
				child.setC(restC);
			}

			child.setB(parent.getB());

			if (!visit[child.getC()][child.getA()]) {
				queue.add(child);
				visit[child.getC()][child.getA()] = true;
			}
		}

		for (int i = 0; i < MAX; i++) {
			if (result[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
