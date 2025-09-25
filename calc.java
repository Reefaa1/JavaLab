class calc{
	public static void main(String arg[]){
	int a=Integer.parseInt( arg[0]); 
	int b=Integer.parseInt( arg[1]); 
	int s=a+b;
	int d=a-b;
	int p=a*b;
	int q=a/b;
	int r=a%b;
	System.out.println("The sum of "+a+" and "+b+" is "+s);
	System.out.println("The difference of "+a+" and "+b+" is "+d);
	System.out.println("The product of "+a+" and "+b+" is "+p);
	System.out.println("The quotient of "+a+" and "+b+" is "+q);
	System.out.println("The remainder of "+a+" and "+b+" is "+r);
}
}