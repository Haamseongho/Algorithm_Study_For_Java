import java.util.Scanner;

public class ÀÌ°öÇÏ±â¿£ {

	private static Scanner scanner;
	private static int[] d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		d = new int[n+1];
		System.out.println(go(n));
	}
	
	private static int go(int n) {
		if(n == 0)
			return 1;
		
		if(n == 1)
			return 1; 
		
		if(d[n] > 0)
			return d[n];
		
		d[n] = go(n-1) + go(n-2);
		d[n] %= 10007;
		return d[n];
	}
}
