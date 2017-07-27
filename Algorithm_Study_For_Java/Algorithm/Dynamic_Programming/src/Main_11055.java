import java.util.Scanner;

public class Main_11055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		int d[] = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			d[i] = arr[i];
			for (int j = 0; j < i; j++) {

				if (arr[i] > arr[j] && d[i] < d[j] + arr[i]) {
					d[i] = d[j] + arr[i];
				}
			}
		}
	}
}
