package Prac_6;

class Car1{
	private int speed;
	
	public void setspeed(int s) {
		speed = s;
		System.out.println("���� ���� ȣ��");
	}
	public void setspeed(double s) {
		speed = (int)s;
		System.out.println("�Ǽ� ���� ȣ��");
	}
}

public class Task_1 {
	public static void main(String[]args) {
		Car1 C1= new Car1();
		C1.setspeed(10);
		C1.setspeed(10.0);
	}
}