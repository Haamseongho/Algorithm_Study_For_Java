import java.util.Scanner;

public class Main_11053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num]; // 배열 내의 숫자
		int d[] = new int[num]; // 가장 긴 거리 계산해서 넣을 배열
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			d[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && d[i] < d[j] + 1) {
					// arr 배열이 있을 때 i번째 배열 보다 j번째 배열의 값이 더 작아야 한다. (i>j)
					/*
					 * d 배열은 길이를 나타내는 것이기 때문에 i번째 까지의 길이는 이 전인 j 배열의 길이에 +1 한
					 * 것보다 커야 합니다. 만일 크지 않다면 이 전 j 번째의 길이 배열에 +1을 해준 것을 i 번째의
					 * 길이로 넘겨주어야 합니다.
					 */
					d[i] = d[j] + 1;
				}
			}
		}
		System.out.print(d[num - 1]);
	}

}
