import javax.swing.*;
import java.awt.event.*;
public class Signup 
{

    public static void main(String[] args) 
    {
        // JFrame ka object banaya
        JFrame frame = new JFrame("Signup Form");
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 80, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 30, 160, 25);
        frame.add(nameField);

        // Username
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(30, 70, 80, 25);
        frame.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(120, 70, 160, 25);
        frame.add(usernameField);

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(30, 110, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(120, 110, 160, 25);
        frame.add(passwordField);

        // Signup Button
        JButton signupButton = new JButton("Sign Up");
        signupButton.setBounds(120, 150, 100, 30);
        frame.add(signupButton);

        signupButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
        		String name= nameField.getText();
        		String uname =usernameField.getText();
        		String pass = new String(passwordField.getPassword());
        		System.out.println("name : " + name);
        		System.out.println("username : "+ uname);
        		System.out.println("Password : "+ pass);
        	}
        });
        // Show the frame
        frame.setVisible(true);
    }
}
