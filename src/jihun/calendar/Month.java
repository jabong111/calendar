package jihun.calendar;

import java.util.Scanner;

public class Month {
	public int maxdays(int month) {
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		return days[month-1]; 
	}
	public static void main(String[] args) {
		Month maxmonth = new Month();
		Scanner scanner = new Scanner(System.in);
		System.out.println("반복횟수를 입력하세여");
		int num = scanner.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println("달을 입력하세요");
			int month = scanner.nextInt();
			System.out.println(month+"월은 "+maxmonth.maxdays(month)+"까지 있습니다.");
			
		}
		System.out.println("BYE~");
		
				
				
		scanner.close();
	}

}
