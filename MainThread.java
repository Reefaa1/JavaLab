class  T1 extends Thread{
  	public void run(){
		for(int i=1;i<=50;i++){
			System.out.println("Inside T1"+i);
	}
}}
class  T2 extends Thread{
  	public void run(){
		for(int i=1;i<=25;i++){
			System.out.println("Inside T2"+i);
	}}
}
public class MainThread{
	public static void main(String a[]) throws InterruptedException {
		T1 o1=new T1();
		T2 o2=new T2();
		o1.start();
		o1.join();
		o2.start();
		o2.join();
}
}
	 	