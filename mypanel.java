import java.awt.*;
class mypanel extends Panel{
	mypanel(){
		super();
		}
	public static void main(String arg[]){
		mypanel p=new mypanel();
		Frame f=new Frame("The Real Panel");
		f.add(p);
		f.setSize(800,600);
		f.setVisible(true);
	}
}