package Exam_1;
import java.util.Scanner;
public class Prac_2 {
	public static void main(String[]args) {
		int in;
		Scanner input = new Scanner(System.in);
		System.out.println("�⵵�� �Է��Ͻÿ�.");
		in = input.nextInt();
		if(in%4==0)
			{if(in%400==0)
				System.out.println(in+"���� �����Դϴ�.");
			else if(in%100!=0)
				System.out.println(in+"���� �����Դϴ�.");
			else 
				System.out.println(in+"���� ������ �ƴմϴ�.");
			}
			else System.out.println(in+"���� ������ �ƴմϴ�.");
}
}
