import java.util.Scanner;

public class Main_9095 {
	public static int[] d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		d = new int[num + 1];

		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		

		for (int i = 3; i <= num; i++) {
			d[i] = d[i - 1] + d[i - 2] + d[i - 3];
		}
		System.out.print(d[num]);
	}

}
