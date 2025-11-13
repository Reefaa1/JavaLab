class max
	{
	public static void main(String arg[])
	{
	int a=Integer.parseInt(arg[0]);
	int b=Integer.parseInt(arg[1]);
	int c=Integer.parseInt(arg[2]);
	if(a>b){
		if(a>c)
		System.out.println(a+ "is the largest number here");
		}
	else if(b>c)
		System.out.println(b+ "is the largest number here");
	else
		System.out.println(c+ "is the largest number here");
}
}