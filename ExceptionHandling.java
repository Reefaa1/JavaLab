class ExceptionHandling
{
	public static void main(String arg[])
	{
	int c=0;
	try{
		int a=Integer.parseInt(arg[0]);
		int b=Integer.parseInt(arg[1]);
		c=a/b;
		}
	catch(ArithmeticException ex){
			System.out.println("Cannot divide by zero");
			}
	finally{
		System.out.println("The quotient here is "+c);
}
}
}