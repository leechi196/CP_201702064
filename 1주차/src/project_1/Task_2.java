package project_1;
import java.util.Scanner;
public class Task_2 {
	public static void main(String[]args) {
		int year, month, date, a_1, a_2, b_1, b_2=0, c_1, d, e, i, year_1=0, k,j;
		Scanner input=new Scanner(System.in);
		System.out.println("연도를 입력해 주세요.");
		year=input.nextInt();
		
		System.out.println("월을 입력해 주세요.");
		month=input.nextInt();
		System.out.println("일을 입력해 주세요.");
		date=input.nextInt();
		a_1 = year-1900;
		a_2 = 1900;
		c_1 = date-1;
		b_1 = a_1;

			for(k=0;k<a_1+1;k++) {
				if(b_1==0) {
					for(i=1;i<month;i++) {
						if(a_2%4==0&&a_2%100!=0) 
							year_1=1;
						else if (a_2%400==0)
							year_1=1;
						else
							year_1=0;
						if(i==1||i==3||i==5||i==7||i==8||i==10) 
							b_2+=31;
						if (i==4||i==6||i==9||i==11)
							b_2+=30;
						if(year_1==1&&i==2)
							b_2=+29;
						if (year_1==0&&i==2)
							b_2+=28;
					}
				}//같은년도일 경우
			
				if(b_1>0) {
					for(j=1;j<13;j++) {
						if(a_2%4==0&&a_2%100!=0) 
							year_1=1;
						else if (a_2%400==0)
							year_1=1;
						else
							year_1=0;
						if(j==1||j==3||j==5||j==7||j==8||j==10||j==12) 
						b_2+=31;
						if (j==4||j==6||j==9||j==11)
						b_2+=30;
						if(year_1==1&&j==2)
						b_2+=29;
						if (year_1==0&&j==2)
						b_2+=28;
					}
					a_2++;
				}
				b_1--;
			}
		d=b_2+c_1;
		e=d%7;
		if(e==0)
			System.out.println("월요일");
		else if(e==1)
			System.out.println("화요일");
		else if(e==2)
			System.out.println("수요일");
		else if(e==3)
			System.out.println("목요일");
		else if(e==4)
			System.out.println("금요일");
		else if(e==5)
			System.out.println("토요일");
		else if(e==6)
			System.out.println("일요일");
		
	}
}	
