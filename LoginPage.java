import java.awt.*;
import java.awt.event.*;

public class LoginPageAWT extends Frame implements ActionListener {
    Label userLabel, passLabel, messageLabel;
    TextField userText, passText;
    Button okButton, cancelButton;

    public LoginPageAWT() {
     
        setLayout(new FlowLayout());
        setSize(300, 180);
        setTitle("Login Page");

       
        userLabel = new Label("User Name:");
        passLabel = new Label("Password:");
        messageLabel = new Label("");

     
        userText = new TextField(15);
        passText = new TextField(15);
        passText.setEchoChar('*'); 

        
        okButton = new Button("OK");
        cancelButton = new Button("Cancel");

        
        add(userLabel);
        add(userText);
        add(passLabel);
        add(passText);
        add(okButton);
        add(cancelButton);
        add(messageLabel);

        
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);

        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = passText.getText();

        if (e.getSource() == okButton) {
            
            if (username.equals("admin") && password.equals("12345")) {
                messageLabel.setText("Login Successful!");
                messageLabel.setForeground(Color.GREEN);
            } else {
                messageLabel.setText("Invalid username or password");
                messageLabel.setForeground(Color.RED);
            }
        } else if (e.getSource() == cancelButton) {
           
            userText.setText("");
            passText.setText("");
            messageLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new LoginPageAWT();
    }
}
