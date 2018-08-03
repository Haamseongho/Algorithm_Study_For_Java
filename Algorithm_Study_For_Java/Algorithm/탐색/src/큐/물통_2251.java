package ť;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Bottle {
	int a; // A ���뿡���� ���Ǿ�
	int b; // B ���뿡���� ���Ǿ�
	int c; // C ���뿡���� ���Ǿ�

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

public class ����_2251 {

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
		visit = new boolean[MAX][MAX]; // A->B ������ , B->C������ �̷��� üũ�ϱ� ����
		result = new boolean[MAX]; // �̵� ��

		for (int i = 0; i < MAX; i++) {
			result[i] = false;
			for (int j = 0; j < MAX; j++) {
				visit[i][j] = false;
			}
		}

		// �ʱ⿡�� ��� false�� �д�. �湮�� ���ߴٴ� �����Ͽ� �����ؾ��ϰ� ��� ���� A�� �� ������� �� C�� ��ȯ�ϴ� ���̹Ƿ�
		// �� ����� i ���� ����ϰ� ���� ���̴�.

		Bottle parent = new Bottle();
		Bottle child = new Bottle();

		int A, B, C; // A,B,C�� �� �� �ִ� ���� ��
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();

		/*
		 * 6������ ��츦 �����ش�. A->B A->C B->A B->C C->A C->B �� �� �湮 �ߴ����� �迭�� üũ���ش�.
		 * 
		 */

		Bottle bottle = new Bottle(); // ó���� ���� �ִ� ���� �� üũ
		// bottle.a --> 0
		// bottle.b --> 0
		// bottle.c --> ���� ������ : C
		bottle.setA(0);
		bottle.setB(0);
		bottle.setC(C);

		queue.add(bottle); // ť�� ���� �ְ� ����

		while (!queue.isEmpty()) {
			int restA = 0, restB = 0, restC = 0;
			int amountA = 0, amountB = 0, amountC = 0;
			parent = (Bottle) queue.remove();
			System.out.println(parent.getA() + "/" + parent.getB() + "/" + parent.getC());
			// ���� ���� �� �ش�
			if (parent.getA() == 0) {
				result[parent.getC()] = true;
			}
			// A->B
			if (parent.getA() + parent.getB() > B) {
				// ���� ������ �ִ� ���� parent.a�� parent.b�� ���� B��� ���� ���� �� �ִ� ���� �Ѿ� �� ��
				child.setB(B); // �̵� �� (�ڽ�) ����� B�� ���� B��
				restA = parent.getB() + parent.getA() - B;
				child.setA(restA);
			} else {
				// ���� ������ �ִ� ���� parent.a�� parent.b�� ���� B��� ���� ���� �� �ִ� ���� �Ѿ�� ���� ���
				amountB = parent.getA() + parent.getB();
				child.setB(amountB);
				restA = 0; // �� ��� ���� A�� ���� ����
				child.setA(restA);
			}
			child.setC(parent.getC()); // C�� �״��

			// A->B �湮 �ߴ��� Ȯ���ϱ� (parent�� �Ѱ��ִ� ����(���� ����) child�� �Ѱ� �޴� ����(�� �� ���)�̱� ������
			// child�� üũ�ؾ� �Ѵ�.
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
