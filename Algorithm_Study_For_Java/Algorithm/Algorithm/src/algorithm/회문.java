package algorithm;

public class 회문 {

	public static void main(String[] args) {
		System.out.println(solution("abab"));
	}

	static int solution(String s) {
		// 뒤에 반환된 것이 추가될 것이기 때문에
		for (int i = s.length();; i++) {
			boolean flag = true;
			for (int j = 0; j < s.length(); j++) {
				if (((i - j - 1) < s.length()) && (s.charAt(j) != s.charAt(i - j - 1))) {
					flag = false;
					break;
				}
			}
			System.out.println(flag);
			System.out.println(i);
			if (flag)
				return i;
		}
	}
}
