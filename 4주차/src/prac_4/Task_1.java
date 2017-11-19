package prac_4;

public class Task_1 {
	public static void main(String[]args) {
		int [] arr = new int[10];
		int max=0, min=100;
		for(int i=0;i<10;i++) {
		arr[i] = (int)(Math.random()*100) + 1;	
		}
		for(int k=0;k<10;k++)
		{
			System.out.print(arr[k]+" ");
			if(arr[k]>max)
				max=arr[k];
			if(arr[k]<min)
				min=arr[k];
		}
		System.out.println("");
		System.out.println("ÃÖ´ñ°ª :"+max);
		System.out.println("ÃÖ¼Ú°ª :"+min);
	}
}
