package algorithm_week1;

import java.util.Scanner;

public class check_2007 {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();


		checkDate(month, day);
	}

	private static void checkDate(int month, int day) {
		setCalendar(month, day);
	}

	private static void setCalendar(int month, int day) {
		if (month == 1) {
			if (day >= 1 && day <= 31) {
				switch (day % 7) {
				case 0:
					System.out.println("SUN");
					break;
				case 1:
					System.out.println("MON");
					break;
				case 2:
					System.out.println("TUE");
					break;
				case 3:
					System.out.println("WED");
					break;
				case 4:
					System.out.println("THU");
					break;
				case 5:
					System.out.println("FRI");
					break;
				case 6:
					System.out.println("SAT");
					break;
				}
			}
		}else if(month == 2){
			if(day>=1 && day<=28){
				
			}
		}

	}

}
