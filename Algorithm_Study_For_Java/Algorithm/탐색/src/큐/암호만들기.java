package ť;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class ��ȣ����� {

	private static Scanner scanner;
	private static String[] test;
	private static ArrayList<String> vowel; // ����
	private static ArrayList<String> consonant; // ����

	// ������ 1�� �̻� , ������ 2�� �̻��� �´��� üũ�ϴ� �Լ�
	private static boolean check(String password) {
		int vowel_size = 0; // ���� ������
		int cons_size = 0; // ���� ������
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) == 'a' || password.charAt(i) == 'i' || password.charAt(i) == 'o'
					|| password.charAt(i) == 'u' || password.charAt(i) == 'e') {
				vowel_size += 1;
			} else {
				cons_size += 1;
			}
		}
		return (vowel_size >= 1 && cons_size >= 2); // ���ǿ� �����ϸ� true ��ȯ , �Ҹ��� �ϸ� false ��ȯ
	}

	private static void makePassword(int n, String[] alpha, String password, int index) {
		// n�� ��ȣ�� ���� (����)
		// alpha�� �Է¹��� ���ĺ����� ������ password�� ���� ����
		// password�� ���ݱ��� ���� ��й�ȣ
		// index�� ���ĺ� �ε����� ������ ���ĺ��� ����� �� �� �� ���

		if (n == password.length()) {
			if (check(password)) { // ���� 1�� �̻�, ���� 2�� �̻��� �´ٸ� �̰� ����
				System.out.println(password);
			}
			return;
		}

		if (index >= alpha.length)
			return;

		makePassword(n, alpha, password + alpha[index], index + 1); // ���� �� �����;� �ϹǷ� index�� �ϳ� ����
		makePassword(n, alpha, password, index + 1); // ���� ������� �ʱ� ������ alpha[index]�� �ȴ�����.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);

		int L = scanner.nextInt(); // ��ȣ�� ���� ������ ����
		int C = scanner.nextInt(); // ��ü ���ĺ����� ���� ����
		// ���÷δ� L�� 4 C�� 6���� ����
		// ���⼭ C�� ���� ��ŭ ���ĺ��� ���� ��, ������ ������ ������ �迭�� �Է��� ��
		test = new String[C];
		vowel = new ArrayList<>();
		consonant = new ArrayList<>();

		for (int i = 0; i < C; i++) {
			test[i] = scanner.next();
		}

		Arrays.sort(test); // �������� ���� �Ϸ�

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
				consonant.add(test[i]); // ���� �ܿ� �͵��� �������� �ֱ� } }
			}
		}

		// �׷��ٸ� �� ��� ����� ���� ���� ���ΰ�..?

		int vowel_num = vowel.size();
		int cons_num = consonant.size();

		
		int k = 1;
		int ans = 0;
		System.out.println((fibonacci(2, 1) / fibonacci(1, 1)) * (fibonacci(4, 3) / fibonacci(3, 3)));
		System.out.println((fibonacci(2, 2) / fibonacci(2,2)) * (fibonacci(4, 2) / fibonacci(2, 2)));

		
		ans += (fibonacci(2, 1) / fibonacci(1, 1)) * (fibonacci(4, 3) / fibonacci(3, 2)) + (fibonacci(2, 2) / fibonacci(2,2)) * (fibonacci(4, 2) / fibonacci(2, 1));
		
		System.out.println("�� :" + ans);
		// ans += (fibonacci(3, 1) / fibonacci(4, 1));

		/*
		 * while (k < L) {
		 * 
		 * if (k >= 1 && L - k >= 2) {
		 * 
		 * System.out.println("�� : " + ans); } else { break; } k += 1; }
		 */}

	// �̰��� ����� �� ���� ���� ������ �޺���̼� ���� ��
	// ����� ��ȣ���� ���ϴ� ���̱� ������ �̰� ��� ����
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
