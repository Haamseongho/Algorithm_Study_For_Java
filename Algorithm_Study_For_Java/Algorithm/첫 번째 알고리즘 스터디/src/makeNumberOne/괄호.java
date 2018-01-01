package makeNumberOne;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 괄호 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String ans = "";
		String[] vps = new String[num];
		// 소괄호 입력하기
		Deque<String> vps2 = new ArrayDeque<String>();
		for (int i = 0; i < vps.length; i++) {
			vps[i] = scanner.next();
		}

		for (int i1 = 0; i1 < vps.length; i1++) {
			for (int j1 = 0; j1 < vps[i1].length(); j1++) {
				// System.out.println(vps[i1].substring(j1,j1+1));
				if (vps[i1].substring(0, 1).equals(")")) {
					ans = "NO";
				} else {
					// 쭉 넣다가 ')' 만나면 pop
					if (vps[i1].substring(j1, j1 + 1).equals("(")) {
						vps2.add(vps[i1].substring(j1, j1 + 1));
						// '(' 일 때 계속
						// 넣어주기
					}

					if (vps2.iterator().hasNext()) {
						if (vps[i1].substring(j1, j1 + 1).equals(")")) {
							vps2.poll(); // 먼저 ')' 만나면 지우고 시작
						}
					}
					// 큐에 아무것도 없을 경우 ")" 이거 만나면
					else {
						if (vps[i1].substring(j1, j1 + 1).equals(")")) {
							ans = "NO";
						}
					}
				}
			}

			if (vps2.iterator().hasNext() || ans.equals("NO")) {
				System.out.println("NO");
				vps2.clear();
			} else {
				System.out.println("YES");
				vps2.clear();
			}
		}

	}
}
