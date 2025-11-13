import java.awt.* ;
class login extends Frame{
	TextField t1,t2;
	Button b1,b2;

	public login(String title){
		super(title);
		Label l1=new Label("User Name");
		Label l2=new Label("Password");
		t1=new TextField(10);
		t2=new TextField(10);
		b1=new Button("OK");
		b2=new Button("Cancel");
		setLayout(new FlowLayout());
		add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);
		}
	public static void main(String arg[]){
		login l=new login("Login Page");
		l.setSize(200,200);
		l.setVisible(true);
	}
}