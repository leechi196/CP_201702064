package Prac_6;

public class Task_2 {
	public static void main(String[]args) {
		Test T=new Test();
		T.sub(1,2,3,4);
	}
}

class Test{
void sub(int... v) {
	System.out.println("�μ��� ���� : " + v.length);
	
	for(int x:v)
		System.out.println(x+" ");
	
	System.out.println();
}
}