import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Riphah_Form 
{
   public static void main(String[] args) 
    {
        
        JFrame frame = new JFrame("Signup");
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JLabel label1 = new JLabel("Name:");
//        label1.setBounds(80, 70, 140, 50);
        frame.add(label1);

        JTextField Field1 = new JTextField(20);
//        Field1.setBounds(160, 80, 200, 30);
        frame.add(Field1);

        JLabel Label2 = new JLabel("Username:");
//        Label2.setBounds(80, 70, 140, 20);
        frame.add(Label2);

        JTextField Field2 = new JTextField(15);
//        Field2.setBounds(60, 140, 160, 50);
        frame.add(Field2);

        
        JLabel Label3 = new JLabel("Password:");
//        Label3.setBounds(60, 220, 160, 50);
        frame.add(Label3);

        JPasswordField Field3 = new JPasswordField(10);
//        Field3.setBounds(240, 220, 320, 50);
        frame.add(Field3);

        
        JButton Lenywaly = new JButton("Leny Waly");
//        Lenywaly.setBounds(240, 300, 200, 60);
        frame.add(Lenywaly);

        Lenywaly.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
        		String n= Field1.getText();
        		String u =Field2.getText();
        		String pass = new String(Field3.getPassword());
        		System.out.println("name : " + n);
        		System.out.println("username : "+ u);
        		System.out.println("Password : "+ pass);
        	}
        });
       
        frame.setVisible(true);
    }
}
