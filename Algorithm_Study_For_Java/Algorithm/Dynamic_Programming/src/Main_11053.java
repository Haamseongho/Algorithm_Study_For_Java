import java.util.Scanner;

public class Main_11053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num]; // �迭 ���� ����
		int d[] = new int[num]; // ���� �� �Ÿ� ����ؼ� ���� �迭
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			d[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && d[i] < d[j] + 1) {
					// arr �迭�� ���� �� i��° �迭 ���� j��° �迭�� ���� �� �۾ƾ� �Ѵ�. (i>j)
					/*
					 * d �迭�� ���̸� ��Ÿ���� ���̱� ������ i��° ������ ���̴� �� ���� j �迭�� ���̿� +1 ��
					 * �ͺ��� Ŀ�� �մϴ�. ���� ũ�� �ʴٸ� �� �� j ��°�� ���� �迭�� +1�� ���� ���� i ��°��
					 * ���̷� �Ѱ��־�� �մϴ�.
					 */
					d[i] = d[j] + 1;
				}
			}
		}
		System.out.print(d[num - 1]);
	}

}
