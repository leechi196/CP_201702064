package lab_07;
import java.util.Scanner;

public class Task_1 {
	public static void main(String [] args) {
		int a;
		Scanner input = new Scanner(System.in);
		BankAccount b1=new BankAccount();
		BankAccount b2=new BankAccount();
		System.out.println("����1 �����Է�");
		System.out.println("���� ��ȣ : ");
		b1.accountNumber = input.nextInt();
		System.out.println("������ : ");
		b1.owner = input.next();
		System.out.println("�ʱ��ܾ� : ");
		b1.balance = input.nextInt();
		System.out.println("����2 �����Է�");
		System.out.println("���� ��ȣ : ");
		b2.accountNumber = input.nextInt();
		System.out.println("������ : ");
		b2.owner = input.next();
		System.out.println("�ʱ��ܾ� : ");
		b2.balance = input.nextInt();
		System.out.println("����1���� ����2�� �۱��� �ݾ� : ");
		a=input.nextInt();
		b1.sendAccount(a, b2);
		System.out.println("����1");
		b1.toString();
		System.out.println("����2");
		b2.toString();
	}
}
