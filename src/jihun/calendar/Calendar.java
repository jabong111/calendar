package jihun.calendar;
import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("두수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int result = a+b;
		System.out.println("두 수의 합은 "+result+" 입니다.");
		
	}

}
