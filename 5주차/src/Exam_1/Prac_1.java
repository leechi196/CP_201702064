package Exam_1;
import java.util.Scanner;
public class Prac_1 {
	public static void main(String[]args) {
	int in, hour, min, sec;
	Scanner input=new Scanner(System.in);
	System.out.println("��ȯ �� �� �Է�:");
	in = input.nextInt();
	hour = in/3600;
	min = (in-hour*3600)/60;
	sec = (in-hour*3600-min*60);
	System.out.println(hour+"�ð�"+min+"��"+sec+"��");
	}
}
