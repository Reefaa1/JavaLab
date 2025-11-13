import java.util.Scanner;
public class Arr{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of numbers");
		int size=sc.nextInt();
		int[] n=new int[size];
		System.out.println("Enter "+size+" numbers");
		for (int i=0;i<size;i++)
			n[i]=sc.nextInt();
		  
		System.out.println("The array entered is:");
		for(int i=0;i<size;i++){
			System.out.println(n[i]+"");
		}
		int sm=n[0];int lar=n[0];int slar=n[0];
		for(int i=1;i<size;i++){
			if(n[i]<sm)
				sm=n[i];
			if(n[i]>lar){
				slar=lar;
				lar=n[i];
			}	
		}
	 	System.out.println("Smallest Element is:"+sm);
		System.out.println("Largest Element is:"+lar);
		System.out.println("Second largest is:"+slar);
	}
}