package jihun.calendar;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		int month = scanner.nextInt();
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println(month+ "월은" +days[month-1]+"일 까지입니다. ");
		
				
		scanner.close();
	}

}
