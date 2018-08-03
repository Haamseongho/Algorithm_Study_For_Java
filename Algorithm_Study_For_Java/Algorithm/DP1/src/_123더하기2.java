import java.util.Scanner;

public class _123´õÇÏ±â2 {

	private static Scanner scanner;
	private static int[] d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		while (count-- > 0) {
			int num = scanner.nextInt();
			d = new int[num + 1];
			d[0] = 1;
			d[1] = 1;
			d[2] = 2;
			d[3] = 4;
			for (int i = 3; i <= num; i++) {
				d[i] = d[i - 1] + d[i - 2] + d[i - 3];
			}
			System.out.println(d[num]);
		}
	}

}
