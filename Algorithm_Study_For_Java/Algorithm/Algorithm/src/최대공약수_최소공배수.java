import java.util.Scanner;

public class �ִ�����_�ּҰ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		int m=0;
		x = sc.nextInt();
		y = sc.nextInt();

		if (x >= y) {
			swap(x, y);
		}
		System.out.println(x);
		System.out.println(y);
		m = x / y;
		System.out.println(m);
		while (m != 0) {
			x = y;
			y = m;
		}
		System.out.println(y);
	}

	static void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
	}
}
