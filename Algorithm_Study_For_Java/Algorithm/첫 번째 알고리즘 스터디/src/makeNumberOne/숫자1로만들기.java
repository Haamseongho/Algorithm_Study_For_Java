package makeNumberOne;

import java.util.Scanner;

public class 숫자1로만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int answer = dividedByNumbers(num);
		System.out.println(answer);
	}

	public static int dividedByNumbers(int n) {
		int d[] = new int[n + 1]; // d[n] (n에서 시작해서 1까지의 과정에서 거치는 횟수)
		
		if (n == 1)
			return 0; // n이 1이면 할 말 없죠? 어차피 1에서 1가는건데 0이죠
		if (d[n] > 0)
			return d[n]; // 과정의 수가 0 이상일 경우 값으로 제출하기 >> 2와 3에 걸리지 않는다는 것이죠
	
		d[n] = dividedByNumbers(n-1) + 1; // 항상 한 차례 넘어가면 +1 되어야 함
		if (n % 3 == 0) {
			// 3으로 나누어 떨어질 경우
			int temp = dividedByNumbers(n / 3) + 1; // 이동 횟수 +1
			if (d[n] > temp) {
				d[n] = temp; // 당연히 temp가 더 높아야하는데 d[n]이 높을 경우 switch해줘야함 >> 경로상
								// 최소 값을 구하는 것이기 때문
			}
		}
		if (n % 2 == 0) {
			int temp = dividedByNumbers(n / 2) + 1;
			if (d[n] > temp) {
				d[n] = temp;
			}
		}
		return d[n];
	}
}
