import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main_10820 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Queue<String> queue = new LinkedList<String>();
		StringBuilder sb = new StringBuilder();
		int b_count = 0, s_count = 0, blank = 0, number = 0;

		for (int i = 0; i < str.length(); i++) {
			queue.offer(str);
		}
		System.out.println(str.length());
		for (int j = 0; j < str.length(); j++) {
			sb.append(queue.poll());
		}
		for (int l = 0; l < str.length(); l++) {
			System.out.println(sb.substring(l, l + 1));
		}
		for (int k = 0; k < str.length(); k++) {
			if (65 <= (int) sb.substring(k, k + 1).charAt(0) && (int) sb.substring(k, k + 1).charAt(0) <= 90) {
				b_count++;
			} else if (97 <= (int) sb.substring(k, k + 1).charAt(0) && (int) sb.substring(k, k + 1).charAt(0) <= 122) {
				s_count++;
			} else if (9 <= (int) sb.substring(k, k + 1).charAt(0) && (int) sb.substring(k, k + 1).charAt(0) <= 13
					|| (int) sb.substring(k, k + 1).charAt(0) == 32) {
				blank++;
			} else if (48 <= (int) sb.substring(k, k + 1).charAt(0) && (int) sb.substring(k, k + 1).charAt(0) <= 57) {
				number++;
			}
		}

		System.out.println("대문자 수:" + b_count);
		System.out.println("소문자 수:" + s_count);
		System.out.println("숫자 수:" + number);
		System.out.println("공백 수:" + blank);

	}

}
