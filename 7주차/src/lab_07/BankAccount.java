package lab_07;

public class BankAccount {
	int accountNumber;
	String owner;
	int balance;
	void deposit (int amount) {
		balance+=amount;
	}
	void withdraw (int amount) {
		balance-=amount;
	}
	public String toString() {
		System.out.println("���¹�ȣ : "+accountNumber);
		System.out.println("������ : "+owner);
		System.out.println("�ܰ� : "+balance);
		return owner;
	}
	public int sendAccount(int amount, BankAccount otherAccount) {
		if(amount > balance ) {
			System.out.println("������ü����");
			return balance;
		}
		else
			{
			this.withdraw(amount);
			otherAccount.deposit(amount);
			return balance;
			}
			
	}
}
