package jihun.calendar;

import java.util.Scanner;

public class Month {
	public static int maxdays(int month) {
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		return days[month-1]; 
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		int month = scanner.nextInt();
		int day = maxdays(month);
		
		System.out.println(month+"월은 "+day+"까지 있습니다.");
		
		
				
		scanner.close();
	}

}
