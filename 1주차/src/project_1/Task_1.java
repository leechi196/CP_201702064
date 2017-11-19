package project_1;
import java.util.Scanner;
public class Task_1 {
	public static void main(String[]args) {
		String a;
		int userNum,p1=0,c1=0,i;
		Scanner input = new Scanner(System.in);
		for(i=1;i<8;i++) {
		System.out.println("가위바위보를 하세요.");
		a = input.nextLine();
		userNum = (int)(Math.random()*10) + 1;
		if(userNum==1||userNum==4||userNum==7) {
			System.out.println("가위");
			if(a.equals("바위")) {
				System.out.println("이겼다.");
				p1++;
				System.out.println("스테이지"+i+"-->"+"플레이어 승:"+p1+"VS"+"컴퓨터 승:"+c1);
			}
			if(a.equals("보")) {
				System.out.println("졌다.");
				c1++;
				System.out.println("스테이지"+i+"-->"+"플레이어 승:"+p1+"VS"+"컴퓨터 승:"+c1);
			}
			if(a.equals("가위"))
				System.out.println("스테이지"+i+"-->"+"플레이어 승:"+p1+"VS"+"컴퓨터 승:"+c1);
				
		}
		if(userNum==2||userNum==5||userNum==8) {
			System.out.println("바위");
			if(a.equals("보")) {
				System.out.println("이겼다.");
				p1++;
				System.out.println("스테이지"+i+"-->"+"플레이어 승:"+p1+"VS"+"컴퓨터 승:"+c1);
			}
			if(a.equals("가위")) {
				System.out.println("졌다.");
				c1++;
				System.out.println("스테이지"+i+"-->"+"플레이어 승:"+p1+"VS"+"컴퓨터 승:"+c1);
			}
			if(a.equals("바위"))
				System.out.println("스테이지"+i+"-->"+"플레이어 승:"+p1+"VS"+"컴퓨터 승:"+c1);
		}
		if(userNum==3||userNum==6||userNum==9) {
			System.out.println("보");
			if(a.equals("가위")) {
				System.out.println("이겼다.");
				p1++;
				System.out.println("스테이지"+i+"-->"+"플레이어 승:"+p1+"VS"+"컴퓨터 승:"+c1);
			}
			if(a.equals("바위")) {
				System.out.println("졌다.");
				c1++;
				System.out.println("스테이지"+i+"-->"+"플레이어 승:"+p1+"VS"+"컴퓨터 승:"+c1);
			}
			if(a.equals("보"))
				System.out.println("스테이지"+i+"-->"+"플레이어 승:"+p1+"VS"+"컴퓨터 승:"+c1);
		}
		}
		if(p1>c1)
			System.out.println("플레이어 승");
		else
			System.out.println("컴퓨터 승");
	}
}
