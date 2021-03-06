package stack_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class editor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack left = new Stack();
		Stack right = new Stack();

		int cnt1, cnt2 = 0;
		int dcnt = 0;
		int ecnt = 0;
		String type;
		String data;
		System.out.println("알파벳 몇 개 쓰실 거임?");
		dcnt = sc.nextInt();

		while (dcnt > 0) {
			System.out.print("왼쪽 스택 입력:");
			left.push(sc.next());
			System.out.print("오른쪽 스택 입력:");
			right.push(sc.next());
			dcnt--;
		}
		System.out.println("확인하기 (기존 썻던 알파벳 갯수 다시 적어주세요.");
		ecnt = sc.nextInt();
		while (ecnt > 0) {
			System.out.println("타입을 골라주세요 " + "L : 왼쪽 스택에  " + "pop , 오른쪽 스택에 push" + "D : 왼쪽 스택에 push 오른쪽 스택에 pop"
					+ "B : 왼쪽 스택에 pop" + "P : 왼쪽 스택에 push & cursor moves right");
			type = sc.next();
			cnt1 = left.size();
			cnt2 = right.size();
			switch (type) {
			case "L":
				if (!left.empty()) {
					right.push(left.peek());
					left.pop();
					cnt1--;
					cnt2++;
					System.out.println(left.get(cnt1 - 1));
				} else {
					System.out.println("왼쪽 스택이 비었습니다.");
				}
				break;
			case "D":
				if (!right.empty()) {
					left.push(right.peek());
					right.pop();
					cnt1++;
					cnt2--;
					System.out.println(right.get(cnt2 - 1));
				} else {
					System.out.println("오른쪽 스택이 비었습니다.");
				}
				break;
			case "B":
				if (!left.empty()) {
					left.pop();
					cnt1--;
					System.out.println(left.get(cnt1 - 1));
				} else {
					System.out.println("오른쪽 스택이 비었습니다.");
				}
				break;
			case "P":
				if (!right.isEmpty()) {
					left.push(right.peek());
					for (int k = 0; k <= cnt1; k++)
						right.push(left.get(k));
					cnt1++;
					cnt2 += cnt1 - 1;
					for (int j = 0; j < cnt2; j++)
						System.out.println(right.get(j));
				}
				break;

			default:
				break;
			}
			ecnt--;
		}
	}

}
