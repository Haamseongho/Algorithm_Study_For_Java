package algorithm;

public class Situation {

	public static void main(String[] args) {
		int[] capacities = {30,20,10};
		int[] bottles = {10,5,5};
		int fromId[] = {0,1,2};
		int toId[] = {1,2,0};
		int[] answer = pour_the_juice(capacities,bottles,fromId,toId);
		System.out.print(answer[0]);
		System.out.print(answer[1]);
		System.out.print(answer[2]);
	}

	public static int[] pour_the_juice(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		/*
		 * ���� �� �ִ� �� : fromId[i]; �״� �� : toId[i]; ��ü �ֽ� �� : bottles[i]; ����� �� �ִ� ���� �뷮 :
		 * capacities[i];
		 */

		/*
		 * ���� 1. �ֽ����� �״� �� ��ŭ �ؼ� ���� ��� ���� ä���� �� (��ü �ֽ��� ���� �纸�� ���� �뷮�� �� Ŭ ���) 
		 * ���� 2. �ֽ����� �״� �� ��ŭ �ؼ� ���� ��� �� ���� ���� �� (��ü �ֽ��� ���� �纸�� ���� �뷮�� �� ���� ���)
		 */

		for (int i = 0; i < fromId.length; i++) {
			// �״� ��� ���� �� �ִ� ���� �հ�� ��ü �ξ�� �� �ֽ��� ��� ����
			int sum = bottles[fromId[i]] + bottles[toId[i]];
			// ��ü �ξ�� �� �ֽ��� ��� ����� �� �ִ� ���� �뷮�� ���Ѵ�.
			// ���� �� ����1�� ���� �� ����2�� ���� �� Ȯ���Ѵ�. �̸� ���ǹ����� ���� �� ������
			// �ᱹ ��ü �ξ�� �� �ֽ��� ��� ����� �� �ִ� ��ü ���� �뷮�� �ּҰ��� ã�´ٸ� �� ���ϴ�.
			// ���� �ξ�� �� �ֽ��� ���� �� ���� ���̶�� �������� ���� ���� ���� ������ �״� ���� 0�� �� ���̴�.
			// �ݴ�� ���� �뷮�� �� ���� ���̶�� ���� �뷮�� ���� ä���� �ξ �ξ���� �ֽ��� ���� ���̴�. �̰��� �״¾��� ���� �� ���̴�.
			bottles[toId[i]] = Math.min(sum,capacities[i]);
			bottles[fromId[i]] = sum - bottles[toId[i]];  
			
		
		}
		return bottles;
	}
}
