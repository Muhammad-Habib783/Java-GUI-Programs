import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class RiphahSignin 
{
   public static void main(String[] args) 
    {
        
        JFrame frame = new JFrame("Signup");
        frame.setSize(350, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
        JLabel Label2 = new JLabel("Username:");
        frame.add(Label2);

        JTextField Field2 = new JTextField(20);
        frame.add(Field2);

        
        JLabel Label3 = new JLabel("Password:");
        frame.add(Label3);
        
        JPasswordField Field3 = new JPasswordField(20);
        frame.add(Field3);

        
        JButton Denywaly = new JButton("Deny Waly");
        frame.add(Denywaly);

        Denywaly.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
        		String user =Field2.getText();
        		String pass = new String(Field3.getPassword());
        		if(user.equals("ali") && pass.equals("1234"))
        		{
        			System.out.println("Welcome to my home!");
        		}
        		else{
        			System.out.println("Invalid Home!!");
        		}
        	}
        });
       
        frame.setVisible(true);
    }
}
