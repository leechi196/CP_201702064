package project_2;
import java.util.Scanner;
public class Task_2 {
	public static void main(String[]args) {
		int a;
		String in;
		
		Scanner input= new Scanner(System.in);
		System.out.println("���ĺ��� �Է����ּ���.");
		in = input.nextLine();
		if(in.equals("a")||in.equals("e")||in.equals("i")||in.equals("o")||in.equals("u"))
			a=1;
		else
			a=0;
		switch(a)
		{
			case 0 : 
				System.out.println("�����Դϴ�.");
				break;
			case 1 :
				System.out.println("�����Դϴ�.");
				break;
			default :
		}
	}
}
