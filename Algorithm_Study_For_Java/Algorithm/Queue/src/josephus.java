import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class josephus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
		ArrayList<Integer> IntegerList = new ArrayList<>();
		System.out.println("큐 안에 몇 개 넣으실 건가요?");
		int n = sc.nextInt();

		for (int i = 0; i < n - 1; i++) {
			queue.offer(i);
		}
		System.out.println("큐 돌리는 횟수:");
		int cnt = sc.nextInt();

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < cnt - 1; j++) {
				queue.offer(queue.poll());
			}
			IntegerList.add(queue.poll());
		}

		for (int k = 0; k < n-1; k++) {
			System.out.println(IntegerList.get(k));
		}
	}
}
