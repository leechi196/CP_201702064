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
		System.out.println("계좌번호 : "+accountNumber);
		System.out.println("예금주 : "+owner);
		System.out.println("잔고 : "+balance);
		return owner;
	}
	public int sendAccount(int amount, BankAccount otherAccount) {
		if(amount > balance ) {
			System.out.println("계좌이체실패");
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
