import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menuexm 
{

	
	public static void main(String[] args) 
	{
		

		JFrame frame = new JFrame("Menu Bar Frame");
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menubar = new JMenuBar();
		JMenu fmenu = new JMenu("File");
		JMenu emenu = new JMenu("Edit");
		JMenu nmenu = new JMenu("Source");
		
		JMenuItem newitem = new JMenuItem("New");
		JMenuItem openitem = new JMenuItem("Open");
		JMenuItem exititem = new JMenuItem("Exit");
		JMenuItem dlt = new JMenuItem("Delete");
		JMenuItem cpy = new JMenuItem("Copy");
		JMenuItem cl = new JMenuItem("Clean");
		nmenu.add(cl);
		fmenu.add(newitem);
		fmenu.add(openitem);
		fmenu.addSeparator();
		fmenu.add(exititem);
		emenu.add(dlt);
		emenu.add(cpy);
		menubar.add(nmenu);
		menubar.add(fmenu);
		menubar.add(emenu);
		frame.setJMenuBar(menubar);
		frame.setVisible(true);
		exititem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JOptionPane.showMessageDialog(frame, "if you click ok application will close..");
				System.exit(0);
			}
		});
		
			dlt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showConfirmDialog(frame, "Are you sure to want to delte");
					// 'frame' ko parent component is liye diya gaya hai taake dialog box isi window (JFrame) ke center mein nazar aaye.
					//JOptionPane.showMessageDialog(frame, "Want to delete");
				}
			});
		
	}

}
