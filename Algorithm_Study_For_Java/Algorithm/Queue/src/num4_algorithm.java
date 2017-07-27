import java.util.Scanner;

public class num4_algorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,num4;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		String str1 = String.valueOf(num1) + String.valueOf(num2);
		String str2 = String.valueOf(num3) + String.valueOf(num4);
		
		System.out.println(Long.valueOf(str1)+Long.valueOf(str2));
	}
}
