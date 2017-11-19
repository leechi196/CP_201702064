package Project_3;
import java.util.Scanner;
public class Tesk_3 {
	public static void main(String[] args) {
		Date Date1 = new Date();
		Scanner input = new Scanner (System.in);
		System.out.println("연도 :");
		Date1.y=input.nextInt();
		System.out.println("월 :");
		Date1.m=input.nextInt();
		System.out.println("일 :");
		Date1.d=input.nextInt();
		Date1.printEastern();
		Date1.printWestern();
	}
}
	class Date
{
	int y,m,d;
	public void printEastern() {
		System.out.println(y+"."+m+"."+d);
	}
	public void printWestern() {
		switch(m) {
		case 1 : 
			System.out.println("January "+d+", "+y);
			break;
		case 2 : 
			System.out.println("February "+d+", "+y);
			break;
		case 3 : 
			System.out.println("March "+d+", "+y);
			break;
		case 4 : 
			System.out.println("April "+d+", "+y);
			break;
		case 5 : 
			System.out.println("May "+d+", "+y);
			break;
		case 6 : 
			System.out.println("June "+d+", "+y);
			break;
		case 7 : 
			System.out.println("July "+d+", "+y);
			break;
		case 8 : 
			System.out.println("August "+d+", "+y);
			break;
		case 9 : 
			System.out.println("September "+d+", "+y);
			break;
		case 10 : 
			System.out.println("October "+d+", "+y);
			break;
		case 11 : 
			System.out.println("November "+d+", "+y);
			break;
		case 12 : 
			System.out.println("December "+d+", "+y);
		}
	}
}
