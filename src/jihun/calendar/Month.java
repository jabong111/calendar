package jihun.calendar;

import java.util.Scanner;

public class Month {
	public int maxdays(int month) {
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		return days[month-1]; 
	}
	public static void main(String[] args) {
		String PROMPT = ">";
		Month maxmonth = new Month();
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			if(month == -1) {
				break;
			}
			else if(month > 12) {
				continue;
			}
			System.out.println(month+"월은 "+maxmonth.maxdays(month)+"까지 있습니다.");
			
		}
		System.out.println("BYE~");
		
				
				
		scanner.close();
	}

}
