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
		 * 부을 수 있는 양 : fromId[i]; 붓는 양 : toId[i]; 전체 주스 양 : bottles[i]; 담겨질 수 있는 병의 용량 :
		 * capacities[i];
		 */

		/*
		 * 구조 1. 주스에서 붓는 양 만큼 해서 부을 경우 가득 채워질 때 (전체 주스를 부을 양보다 병의 용량이 더 클 경우) 
		 * 구조 2. 주스에서 붓는 양 만큼 해서 부을 경우 다 담지 못할 때 (전체 주스를 부을 양보다 병의 용량이 더 작을 경우)
		 */

		for (int i = 0; i < fromId.length; i++) {
			// 붓는 양과 부을 수 있는 양의 합계는 전체 부어야 할 주스의 양과 같음
			int sum = bottles[fromId[i]] + bottles[toId[i]];
			// 전체 부어야 할 주스의 양과 담겨질 수 있는 병의 용량을 비교한다.
			// 비교할 때 구조1로 들어가는 지 구조2로 들어가는 지 확인한다. 이를 조건문으로 나눌 수 있지만
			// 결국 전체 부어야 할 주스의 양과 담겨질 수 있는 전체 병의 용량의 최소값을 찾는다면 더 편하다.
			// 만일 부어야 할 주스의 양이 더 작은 값이라면 다음에는 부을 값이 없기 때문에 붓는 양은 0이 될 것이다.
			// 반대로 병의 용량이 더 작은 값이라면 병의 용량을 가득 채워서 부어도 부어야할 주스가 남을 것이다. 이것이 붓는양의 값이 될 것이다.
			bottles[toId[i]] = Math.min(sum,capacities[i]);
			bottles[fromId[i]] = sum - bottles[toId[i]];  
			
		
		}
		return bottles;
	}
}
