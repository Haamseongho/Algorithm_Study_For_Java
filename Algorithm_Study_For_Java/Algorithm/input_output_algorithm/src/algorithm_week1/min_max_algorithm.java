package algorithm_week1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class min_max_algorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�Է��� �� ����");
		int num = sc.nextInt();
		int val[] = new int[num];
		int cb = 0;
		int max = 0, min = 0;

		while (num > 0) {
			val[cb] = sc.nextInt();
			cb++;
			num--;
		}

		for (int i = 0, j = 0; i < val.length; i++) {
			if (max < val[i]) {
				max = val[i];
				min = max;
			}
			if (min > val[i]) {
				min = val[i];

			}

		}

		System.out.println("�ִ밪:" + max);
		System.out.println("�ּҰ�:" + min);
	}

	// private static void QuickSort(int data, int num[]) {
	// int i=0;
	// int max=0;
	// while(i<num.length){
	// if(data>num[i]){
	// max = data;
	// }else{
	// max = num[i];
	// }
	// i++;
	// }
	// System.out.println("�ִ밪:"+max);
	// }
}