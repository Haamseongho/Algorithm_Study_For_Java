import java.util.ArrayList;
import java.util.Scanner;

public class BinaryGap2 { 
	// codility���� class�� Solution���� �ٲ㼭 �����ּ���! �׷��� ���ư��ϴ�..��

	static int solution(int N) {
		ArrayList<Integer> arrList = new ArrayList<>();
		int cnt = 0;
		int idx = 0;
		int max = 0;
		int i=N;
		
		do{
			arrList.add(idx,i%2);
			i = (int)i/2;
			idx++;
		}while(i>0);
	
		
		for (int j = arrList.size()-1 ; j >= 0 ; j--) {

			if (arrList.get(j) == 0) {
				cnt++;
			} else {
				if (max < cnt) {
					max = cnt;
				}
				cnt = 0;
			}
		}
		//System.out.print(max);
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//solution(sc.nextInt());
		System.out.println(solution(sc.nextInt()));
	}
}
