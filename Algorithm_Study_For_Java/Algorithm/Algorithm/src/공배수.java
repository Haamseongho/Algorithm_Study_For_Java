import java.util.Scanner;

public class °ø¹è¼ö {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0;
		int answer[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 && arr[i] % 4 == 0) {
				cnt++;
				answer[cnt] = (arr[i]);
			}
		}

		for (int elem : answer) {
			System.out.println(elem);
		}

	}

}
