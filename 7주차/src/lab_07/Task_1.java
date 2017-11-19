package lab_07;
import java.util.Scanner;

public class Task_1 {
	public static void main(String [] args) {
		int a;
		Scanner input = new Scanner(System.in);
		BankAccount b1=new BankAccount();
		BankAccount b2=new BankAccount();
		System.out.println("계좌1 정보입력");
		System.out.println("계좌 번호 : ");
		b1.accountNumber = input.nextInt();
		System.out.println("예금주 : ");
		b1.owner = input.next();
		System.out.println("초기잔액 : ");
		b1.balance = input.nextInt();
		System.out.println("계좌2 정보입력");
		System.out.println("계좌 번호 : ");
		b2.accountNumber = input.nextInt();
		System.out.println("예금주 : ");
		b2.owner = input.next();
		System.out.println("초기잔액 : ");
		b2.balance = input.nextInt();
		System.out.println("계좌1에서 계좌2로 송금할 금액 : ");
		a=input.nextInt();
		b1.sendAccount(a, b2);
		System.out.println("계좌1");
		b1.toString();
		System.out.println("계좌2");
		b2.toString();
	}
}
