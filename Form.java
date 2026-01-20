import javax.swing.*;
import java.awt.event.*;
public class Form
{
	public static void main(String[] arg) 
	{
		
		JFrame frame = new JFrame();
		frame.setSize(350,250);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Label 1
		JLabel label1 = new JLabel("Username");
		label1.setBounds(60,30,80,25);
		frame.add(label1);
		//Textfield 1
		JTextField field1 = new JTextField();
		field1.setBounds(60,50,160,25);
		frame.add(field1);
		
		JButton btn = new JButton("signup");
		btn.setBounds(120,150,100,30);
		frame.add(btn);
		
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String name =field1.getText();
				System.out.println("user enter this value : " + name);
			}
		});
		
		frame.setVisible(true);
		}
}
