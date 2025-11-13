import java.util.Scanner;
class Remove{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string");
		String st=sc.nextLine();
		String res=st.replaceAll("[AEIOUaeiou]","");
		System.out.println("String after vowel removal:"+res);
		}
	}
		