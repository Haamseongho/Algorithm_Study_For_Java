import java.util.Scanner;

public class 붕어빵_판매하기 {

	private static Scanner scanner;
	private static int[] d; // OO개 팔아서 얻을 수 있는 최대 수익
	private static int[] p; // i개 팔아서 얻을 수 있는 i개의 총 판매 수익
	private static int MAX;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		MAX = scanner.nextInt();
		d = new int[MAX + 1];
		p = new int[MAX + 1];

		d[0] = 0;
		p[0] = 0;
		
		for(int i=1;i<=MAX;i++) {
			p[i] = scanner.nextInt();
		}
		
		for (int i = 1; i <= MAX; i++) {
			for (int j = 1; j <= i; j++) {
				d[i] = Math.max(d[i], d[i - j] + p[j]);
			}
		}
		System.out.println(d[MAX]);
	}
}
