import javax.swing.*;
import java.awt.event.*;
public class MenuBarExample extends JFrame 
{
    public MenuBarExample() 
    { //constructor of class MenuBarExample
        setTitle("MenuBar Example");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 1. Create MenuBar
        JMenuBar menuBar = new JMenuBar();

        // 2. Create Menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu helpMenu = new JMenu("Help");

        // 3. Create MenuItems for File
        JMenuItem newItem = new JMenuItem("New");
        newItem.setMnemonic('N'); // Alt + N (shortcut key )
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // 4. Add ActionListener
        exitItem.addActionListener(e -> System.exit(0));
        newItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "New File Created"));
        openItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Open File Dialog"));

        // 5. Add MenuItems to File Menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator(); // Separator line
        fileMenu.add(exitItem);

        // 6. Submenu under Edit Menu
        JMenu findSubMenu = new JMenu("Find");
        JMenuItem findItem = new JMenuItem("Find...");
        JMenuItem replaceItem = new JMenuItem("Replace...");
        findSubMenu.add(findItem);
        findSubMenu.add(replaceItem);
        editMenu.add(findSubMenu);

        // 7. Checkbox menu items in View
        JCheckBoxMenuItem statusBar = new JCheckBoxMenuItem("Show Status Bar");
        statusBar.setSelected(true);
        viewMenu.add(statusBar);

        // 8. Radio button menu items in View
        JRadioButtonMenuItem lightTheme = new JRadioButtonMenuItem("Light Theme");
        JRadioButtonMenuItem darkTheme = new JRadioButtonMenuItem("Dark Theme");

        ButtonGroup themeGroup = new ButtonGroup();
        themeGroup.add(lightTheme);
        themeGroup.add(darkTheme);

        lightTheme.setSelected(true);

        viewMenu.addSeparator();
        viewMenu.add(lightTheme);
        viewMenu.add(darkTheme);

        // 9. Add all menus to MenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);

        // 10. Add MenuBar to JFrame
        setJMenuBar(menuBar);

        // Optional: Add some content to frame
        JLabel label = new JLabel("Right now, you're learning JMenuBar!", JLabel.CENTER);
        add(label);
    }
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> 
        {
            new MenuBarExample().setVisible(true);
        });
    }
}
