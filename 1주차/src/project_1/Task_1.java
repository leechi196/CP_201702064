package project_1;
import java.util.Scanner;
public class Task_1 {
	public static void main(String[]args) {
		String a;
		int userNum,p1=0,c1=0,i;
		Scanner input = new Scanner(System.in);
		for(i=1;i<8;i++) {
		System.out.println("������������ �ϼ���.");
		a = input.nextLine();
		userNum = (int)(Math.random()*10) + 1;
		if(userNum==1||userNum==4||userNum==7) {
			System.out.println("����");
			if(a.equals("����")) {
				System.out.println("�̰��.");
				p1++;
				System.out.println("��������"+i+"-->"+"�÷��̾� ��:"+p1+"VS"+"��ǻ�� ��:"+c1);
			}
			if(a.equals("��")) {
				System.out.println("����.");
				c1++;
				System.out.println("��������"+i+"-->"+"�÷��̾� ��:"+p1+"VS"+"��ǻ�� ��:"+c1);
			}
			if(a.equals("����"))
				System.out.println("��������"+i+"-->"+"�÷��̾� ��:"+p1+"VS"+"��ǻ�� ��:"+c1);
				
		}
		if(userNum==2||userNum==5||userNum==8) {
			System.out.println("����");
			if(a.equals("��")) {
				System.out.println("�̰��.");
				p1++;
				System.out.println("��������"+i+"-->"+"�÷��̾� ��:"+p1+"VS"+"��ǻ�� ��:"+c1);
			}
			if(a.equals("����")) {
				System.out.println("����.");
				c1++;
				System.out.println("��������"+i+"-->"+"�÷��̾� ��:"+p1+"VS"+"��ǻ�� ��:"+c1);
			}
			if(a.equals("����"))
				System.out.println("��������"+i+"-->"+"�÷��̾� ��:"+p1+"VS"+"��ǻ�� ��:"+c1);
		}
		if(userNum==3||userNum==6||userNum==9) {
			System.out.println("��");
			if(a.equals("����")) {
				System.out.println("�̰��.");
				p1++;
				System.out.println("��������"+i+"-->"+"�÷��̾� ��:"+p1+"VS"+"��ǻ�� ��:"+c1);
			}
			if(a.equals("����")) {
				System.out.println("����.");
				c1++;
				System.out.println("��������"+i+"-->"+"�÷��̾� ��:"+p1+"VS"+"��ǻ�� ��:"+c1);
			}
			if(a.equals("��"))
				System.out.println("��������"+i+"-->"+"�÷��̾� ��:"+p1+"VS"+"��ǻ�� ��:"+c1);
		}
		}
		if(p1>c1)
			System.out.println("�÷��̾� ��");
		else
			System.out.println("��ǻ�� ��");
	}
}
