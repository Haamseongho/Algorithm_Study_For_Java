package algorithm_week1;

import java.util.Scanner;

public class sliceTenWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.println("���� �Է�");
		String sentence = sc.next();
		int rest = 0;
		int length = 0;

		if (sentence.length() > 0 && sentence.length() < 100) {
			if (sentence.length() < 10) {
				System.out.println(sentence.substring(0, sentence.length()));
			} else {
				rest = sentence.length() / 10;
				length = sentence.length();
				while (i <= rest) {
					if (sentence.length() > 10 * i) {
						System.out.println(sentence.substring(10 * (i - 1), 10 * i));
						length = sentence.length() - 10 * i;
						i++;
					}
					if (length < 10) {
						System.out.println(sentence.substring(10 * rest, sentence.length()));
					}
				}

			}
		}
	}
}
