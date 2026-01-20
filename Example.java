import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Example
{
    public static void main(String[] args) 
    {
        // 1. JFrame
        JFrame frame = new JFrame("All GUI Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // 2. JMenuBar, JMenu, JMenuItem
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        exitItem.addActionListener(e -> System.exit(0));

        // 3. JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // ========== TAB 1 ==========
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5, 2, 10, 10));

        // 4. JLabel
        panel1.add(new JLabel("Name:"));

        // 5. JTextField
        JTextField nameField = new JTextField();
        panel1.add(nameField);

        // 6. JCheckBox
        JCheckBox agreeCheck = new JCheckBox("Agree to terms");
        panel1.add(agreeCheck);

        // 7. JRadioButton + ButtonGroup
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        panel1.add(male);
        panel1.add(female);

        // 8. JComboBox
        panel1.add(new JLabel("Country:"));
        String[] countries = { "Pakistan", "India", "USA" };
        JComboBox<String> countryBox = new JComboBox<>(countries);
        panel1.add(countryBox);

        // 9. JButton
        JButton submitButton = new JButton("Submit");
        panel1.add(submitButton);

        // 10. JLabel (for result)
        JLabel resultLabel = new JLabel("");
        panel1.add(resultLabel);

        submitButton.addActionListener(e -> 
        {
            String name = nameField.getText();
            String gender = male.isSelected() ? "Male" : "Female";
            String country = (String) countryBox.getSelectedItem();
            resultLabel.setText("Name: " + name + ", Gender: " + gender + ", Country: " + country);
        });

        tabbedPane.addTab("Form", panel1);

        // ========== TAB 2 ==========
        JPanel panel2 = new JPanel(new BorderLayout());

        // 11. JTextArea
        JTextArea textArea = new JTextArea(10, 30);

        // 12. JScrollPane (for JTextArea)
        JScrollPane scrollPane1 = new JScrollPane(textArea);
        panel2.add(scrollPane1, BorderLayout.CENTER);

        tabbedPane.addTab("Text Area", panel2);

        // ========== TAB 3 ==========
        JPanel panel3 = new JPanel();

        // 13. JList
        String[] items = { "Apple", "Banana", "Cherry" };
        JList<String> itemList = new JList<>(items);

        // 14. JScrollPane (for JList)
        JScrollPane scrollPane2 = new JScrollPane(itemList);
        scrollPane2.setPreferredSize(new Dimension(100, 80));
        panel3.add(scrollPane2);

        // 15. JTable
        String[][] data = {
            { "1", "Ali", "A+" },
            { "2", "Sara", "B" },
        };
        String[] columns = { "ID", "Name", "Grade" };
        JTable table = new JTable(data, columns);
        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setPreferredSize(new Dimension(300, 80));
        panel3.add(tableScroll);

        // 16. JSlider
        JSlider slider = new JSlider(0, 100, 50);
        slider.setMajorTickSpacing(25);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        panel3.add(slider);

        tabbedPane.addTab("List & Table", panel3);

        // Add everything to the frame
        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}