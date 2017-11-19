package Exam_1;
import java.util.Scanner;
public class Prac_2 {
	public static void main(String[]args) {
		int in;
		Scanner input = new Scanner(System.in);
		System.out.println("년도를 입력하시오.");
		in = input.nextInt();
		if(in%4==0)
			{if(in%400==0)
				System.out.println(in+"년은 윤년입니다.");
			else if(in%100!=0)
				System.out.println(in+"년은 윤년입니다.");
			else 
				System.out.println(in+"년은 윤년이 아닙니다.");
			}
			else System.out.println(in+"년은 윤년이 아닙니다.");
}
}
