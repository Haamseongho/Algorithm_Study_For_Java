package 큐;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class 암호만들기 {

	private static Scanner scanner;
	private static String[] test;
	private static ArrayList<String> vowel; // 모음
	private static ArrayList<String> consonant; // 자음

	// 모음은 1개 이상 , 자음은 2개 이상이 맞는지 체크하는 함수
	private static boolean check(String password) {
		int vowel_size = 0; // 모음 사이즈
		int cons_size = 0; // 자음 사이즈
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) == 'a' || password.charAt(i) == 'i' || password.charAt(i) == 'o'
					|| password.charAt(i) == 'u' || password.charAt(i) == 'e') {
				vowel_size += 1;
			} else {
				cons_size += 1;
			}
		}
		return (vowel_size >= 1 && cons_size >= 2); // 조건에 만족하면 true 반환 , 불만족 하면 false 반환
	}

	private static void makePassword(int n, String[] alpha, String password, int index) {
		// n은 암호의 길이 (최종)
		// alpha는 입력받은 알파벳들을 가지고 password에 넣을 예정
		// password는 지금까지 만든 비밀번호
		// index는 알파벳 인덱스를 가지고 알파벳을 사용할 지 말 지 고민

		if (n == password.length()) {
			if (check(password)) { // 모음 1개 이상, 자음 2개 이상이 맞다면 이게 답임
				System.out.println(password);
			}
			return;
		}

		if (index >= alpha.length)
			return;

		makePassword(n, alpha, password + alpha[index], index + 1); // 다음 꺼 가져와야 하므로 index는 하나 증가
		makePassword(n, alpha, password, index + 1); // 값을 사용하지 않기 때문에 alpha[index]를 안더해줌.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);

		int L = scanner.nextInt(); // 암호로 만들 숫자의 갯수
		int C = scanner.nextInt(); // 전체 알파벳에서 뽑을 숫자
		// 예시로는 L이 4 C는 6으로 나옴
		// 여기서 C의 갯수 만큼 알파벳을 적은 뒤, 모음과 자음을 나눠서 배열에 입력할 것
		test = new String[C];
		vowel = new ArrayList<>();
		consonant = new ArrayList<>();

		for (int i = 0; i < C; i++) {
			test[i] = scanner.next();
		}

		Arrays.sort(test); // 오름차순 정리 완료

		// makePassword(L,test,"",0);

		for (int i = 0; i < C; i++) {
			if (test[i].toLowerCase().equals("a")) {
				vowel.add(test[i]);
			} else if (test[i].toLowerCase().equals("i")) {
				vowel.add(test[i]);
			} else if (test[i].toLowerCase().equals("o")) {
				vowel.add(test[i]);
			} else if (test[i].toLowerCase().equals("u")) {
				vowel.add(test[i]);
			} else if (test[i].toLowerCase().equals("e")) {
				vowel.add(test[i]);
			} else {
				consonant.add(test[i]); // 모음 외에 것들은 자음으로 넣기 } }
			}
		}

		// 그렇다면 총 몇가지 경우의 수가 나올 것인가..?

		int vowel_num = vowel.size();
		int cons_num = consonant.size();

		
		int k = 1;
		int ans = 0;
		System.out.println((fibonacci(2, 1) / fibonacci(1, 1)) * (fibonacci(4, 3) / fibonacci(3, 3)));
		System.out.println((fibonacci(2, 2) / fibonacci(2,2)) * (fibonacci(4, 2) / fibonacci(2, 2)));

		
		ans += (fibonacci(2, 1) / fibonacci(1, 1)) * (fibonacci(4, 3) / fibonacci(3, 2)) + (fibonacci(2, 2) / fibonacci(2,2)) * (fibonacci(4, 2) / fibonacci(2, 1));
		
		System.out.println("답 :" + ans);
		// ans += (fibonacci(3, 1) / fibonacci(4, 1));

		/*
		 * while (k < L) {
		 * 
		 * if (k >= 1 && L - k >= 2) {
		 * 
		 * System.out.println("값 : " + ans); } else { break; } k += 1; }
		 */}

	// 이것은 경우의 수 구할 때임 수학의 콤비네이션 구할 때
	// 답안은 암호들을 구하는 것이기 때문에 이거 사용 못함
	private static int fibonacci(int n, int count) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		if (count >= 1)
			return n * fibonacci(n - 1, count - 1);
		else
			return 1;
	}
}
