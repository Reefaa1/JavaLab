interface  AddSub{
 public void add(int a,int b);
 public void sub(int a,int b);
}
interface  MulDiv
{
 public void mul(int a,int b);
 public void div(int a,int b);
}
class calc implements AddSub,  MulDiv
{
	 public void add(int a,int b){
		System.out.println("sum of  "+a+" and "+b+" is "+(a+b));
}
	  public void sub(int a,int b){
		System.out.println("difference of  "+a+" and "+b+" is "+(a-b));
}
	 public void mul(int a,int b){
		System.out.println("product of  "+a+" and "+b+" is "+(a*b));
}
 	public void div(int a,int b){
		System.out.println("quotient of  "+a+" and "+b+" is "+(a/b));
}
}
class Calculator{
public static void main(String arg[]){
	calc c1=new calc();
	c1.add(5,2);
	c1.sub(6,3);
	c1.mul(7,5);
	c1.div(8,2);
}
}