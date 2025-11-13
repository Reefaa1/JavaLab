import java.awt.*;
class myframe extends Frame{
	myframe(String t){
	super(t);
	}
public static void main(String arg[]){
	myframe f=new myframe("The Real Frame");
	f.setSize(800,600);
	f.setVisible(true);
}
}