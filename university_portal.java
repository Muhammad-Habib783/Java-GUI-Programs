import javax.swing.*;
import java.awt.event.*;
public class university_portal
 { 
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("University Portal");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label1 = new JLabel("Name:");
        label1.setBounds(50, 50, 100, 30);
        frame.add(label1);
        JLabel label2 = new JLabel("SAP ID:");
        label2.setBounds(50, 100, 100, 30);
        frame.add(label2);
        JLabel label3 = new JLabel("Address:");
        label3.setBounds(50, 150, 100, 30);
        frame.add(label3);
        JLabel label4 = new JLabel("Age:");
        label4.setBounds(50, 200, 100, 30);
        frame.add(label4);
        JLabel label5 = new JLabel("Semester:");
        label5.setBounds(50, 250, 100, 30);
        frame.add(label5);
        JTextField textField1 = new JTextField();
        textField1.setBounds(150, 50, 200, 30);
        frame.add(textField1);
        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 100, 200, 30);
        frame.add(textField2);
        JTextField textField3 = new JTextField();
        textField3.setBounds(150, 150, 200, 30);
        frame.add(textField3);
        JTextField textField4 = new JTextField();
        textField4.setBounds(150, 200, 200, 30);
        frame.add(textField4);
        JTextField textField5 = new JTextField();
        textField5.setBounds(150, 250, 200, 30);
        frame.add(textField5);
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(200, 350, 100, 30);
        frame.add(submitButton);
        submitButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String name = textField1.getText();
                String sapId = textField2.getText();
                String address = textField3.getText();
                String age = textField4.getText();
                String semester = textField5.getText();

                JOptionPane.showMessageDialog(frame, "Submitted Details:\nName: " + name + "\nSAP ID: " + sapId + "\nAddress: " + address + "\nAge: " + age + "\nSemester: " + semester);
            }
        });
    frame.setVisible(true);
    }
}