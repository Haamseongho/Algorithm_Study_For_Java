import java.util.ArrayList;
import java.util.Scanner;

public class Main_9465 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d[][] = new int[m+1][3];
		// 방법 . m은 열의 갯수라 생각하고 0은 아무것도 선택 안할 경우 1은 위에꺼 선택 2는 아래꺼 선택
		int arr[][] = new int[2][m+1];
		// 열만 증가시키는 입장이고 행은 2로 고정 m은 열의 크기

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt(); // 배열에 추가(내용물)
			}
		}
		for (int i = 1; i < m; i++) {
			d[i][0] = Math.max(d[i - 1][0], Math.max(d[i - 1][1], d[i - 1][2]));
			d[i][1] = Math.max(d[i - 1][0], d[i - 1][2]) + arr[i][1];
			d[i][2] = Math.max(d[i - 1][0], d[i - 1][1]) + arr[i][2];
		}

		long ans = 0;
		ans = Math.max(d[m][0], Math.max(d[m][1], d[m][2]));
		System.out.println(ans);
	}
}
