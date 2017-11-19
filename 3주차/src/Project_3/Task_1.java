package Project_3;
import java.util.Scanner;
public class Task_1 {
	public static void main (String[]args){
		int a=0,b=0;
		String s;
		Scanner input = new Scanner(System.in);
		System.out.println("문자를 입력해주세요. :");
		s = input.nextLine();
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				a++;
			else if(s.charAt(i)=='b'||s.charAt(i)=='c'||s.charAt(i)=='d'||s.charAt(i)=='f'||s.charAt(i)=='g'
					||s.charAt(i)=='h'||s.charAt(i)=='j'||s.charAt(i)=='k'||s.charAt(i)=='l'||s.charAt(i)=='m'
					||s.charAt(i)=='m'||s.charAt(i)=='n'||s.charAt(i)=='p'||s.charAt(i)=='q'||s.charAt(i)=='r'
					||s.charAt(i)=='s'||s.charAt(i)=='t'||s.charAt(i)=='v'||s.charAt(i)=='w'||s.charAt(i)=='x'
					||s.charAt(i)=='z')
				b++;
		}
		System.out.println("자음의 개수 :"+b);
		System.out.println("모음의 개수 :"+a);
	}
}
