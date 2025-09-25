class tri{
	public static void main(String arg[]){
	int a=Integer.parseInt( arg[0]); 
	int b=Integer.parseInt( arg[1]); 
	int c=Integer.parseInt( arg[2]); 
	if(a==b || b==c ||  a==c)
			System.out.println("This is an  isosceles triangle");
	else if(a==b && b==c )
			System.out.println("This is an equilateral triangle");
	
	else
		System.out.println("This is scalene triangle");
}}
			