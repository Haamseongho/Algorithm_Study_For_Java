package algorithm;

public class 친구_수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] friends = { "NYNNN", "YNYNN", "NYNYN", "NNYNY", "NNNYN" };

		System.out.println(solution(friends));
	}

	static int solution(String[] friends) {
		int max = 0;
		for (int i = 0; i < friends.length; i++) {
			int cnt = 0;

			for (int j = 0; j < friends[i].length(); j++) {
				if (i == j)
					continue; // 같은 값은 다 N이기 때문

				if (friends[i].charAt(j) == 'Y') {
					// Y 일 때 (직접 친구 따짐)
					cnt += 1;
				} else {
					// N 일 때 (직접 친구가 아니기 때문에 간접적인 친구로 들어감)
					for (int k = 0; k < friends.length; k++) {
						// friends[j].charAt(k) --> '행'으로 돌기
						// friends[k].charAt(i) --> '열'로 돌기
						// 접합점을 찾기 위함 ('Y'로 접합점이 있는 경우 간접 친구가 되기 때문임)
						if (friends[j].charAt(k) == 'Y' && friends[k].charAt(i) == 'Y') {
							cnt += 1;
							break;
						}
					}
				}
			}
			// 가장 큰 것을 구하는 것이므로
			max = Math.max(max, cnt);
		}
		return max;
	}
}
