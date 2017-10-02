package jihun.calendar;
import java.util.Scanner;

public class Showcalendar {
	public void printcal(int month) {
		Month getmonth = new Month();
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("----------------");
		int maxday = getmonth.maxdays(month);
		
		for(int i=1;i <= maxday; i++) {
			System.out.printf("%3d",i);
			if(i%7 == 0) {
				System.out.printf("\n");
			}
		}
		System.out.println();
				
				
//		System.out.println("1   2  3   4  5   6  7");
//		System.out.println("8   9 10  11 12  13 14");
//		System.out.println("15 16 17  18 19  20 21");
//		System.out.println("22 23 24  25 26  27 28");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Showcalendar showcalendar = new Showcalendar();
		
		while(true) {
			System.out.println("달을 입력하세요.");
			System.out.print(">");
			int month = scanner.nextInt();
			if(month == -1) {
				break;
			}
			else if(month > 12) {
				continue;
			}
			showcalendar.printcal(month);
			
		}
		System.out.println("Bye~");
		scanner.close();
	}


}
