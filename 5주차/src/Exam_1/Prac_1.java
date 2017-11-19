package Exam_1;
import java.util.Scanner;
public class Prac_1 {
	public static void main(String[]args) {
	int in, hour, min, sec;
	Scanner input=new Scanner(System.in);
	System.out.println("변환 할 초 입력:");
	in = input.nextInt();
	hour = in/3600;
	min = (in-hour*3600)/60;
	sec = (in-hour*3600-min*60);
	System.out.println(hour+"시간"+min+"분"+sec+"초");
	}
}
