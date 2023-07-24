import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class expense{

    public static void main(String[] args) {

        //create the jframe
        JFrame f=new JFrame("");
        
        //create a text field & set the size & position of it
        final JTextField tf=new JTextField("Expense tracker");
        tf.setBounds(50,50,350,20);

        //create the button
        JButton b=new JButton("login");
        b.setBounds(50,100,95,30);
        b.setBackground(Color.GREEN);

        //create the panel for a layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));

        //create the username input
        JLabel usernameLabel = new JLabel("Username: ");
        JTextField usernameField = new JTextField();

        //create the password input
        JLabel passwordLabel = new JLabel("Password: ");
        JPasswordField passwordField = new JPasswordField();
    

        //add an action listener to the button
        b.addActionListener(new ActionListener()    {
            public void actionPerformed(ActionEvent e)  {
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
            
                
            }
        });
        
    }
}