import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class AdminSection extends JFrame implements ActionListener
{
	JLabel l1;
	JButton bt1;
	JPanel p1,p2;
	Font f,f1;
	
	AdminSection()
	{
		 super("Admin Page");
		 setLocation(0,0);
		 setSize(1500,800);
		 
		 f=new Font("Arial",Font.BOLD,25);
		 f1=new Font("Arial",Font.BOLD,20);
		 
			
		ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("l2.png"));
		Image img=ic.getImage().getScaledInstance(1500,800, Image.SCALE_DEFAULT);
		ImageIcon ic1=new ImageIcon(img);
		l1=new JLabel(ic1);
		
		JMenuBar m1=new JMenuBar();
		JMenu men1=new JMenu("Add Info");
		JMenuItem ment1=new JMenuItem("Add Librarian");
		
		JMenu men2=new JMenu("View Info");
		JMenuItem ment2=new JMenuItem("View Librarian");
		
		JMenu men3=new JMenu("Delete Info");
		JMenuItem ment3=new JMenuItem("Delete Librarian");
		
		JMenu men4=new JMenu("Exit");
		JMenuItem ment4=new JMenuItem("Logout");
		
		men1.add(ment1);
		men2.add(ment2);
		men3.add(ment3);
		men4.add(ment4);
		
		m1.add(men1);
		m1.add(men2);
		m1.add(men3);
		m1.add(men4);
		
		men1.setFont(f);
		men2.setFont(f);
		men3.setFont(f);
		men4.setFont(f);
		
		ment1.setFont(f1);
		ment2.setFont(f1);
		ment3.setFont(f1);
		ment4.setFont(f1);
		
		
		men1.setForeground(Color.GRAY);
		men2.setForeground(Color.GRAY);
		men3.setForeground(Color.GRAY);
		men4.setForeground(Color.RED);
		
		ment1.setBackground(Color.BLACK);
		ment2.setBackground(Color.BLACK);
		ment3.setBackground(Color.BLACK);
		ment4.setBackground(Color.BLACK);
		
		ment1.setForeground(Color.YELLOW);
		ment2.setForeground(Color.YELLOW);
		ment3.setForeground(Color.YELLOW);
		ment4.setForeground(Color.YELLOW);
	
		
		
		ment1.addActionListener(this);
		ment2.addActionListener(this);
		ment3.addActionListener(this);
		ment4.addActionListener(this);
		
		setJMenuBar(m1);
		add(l1);	
	}
	 public void actionPerformed(ActionEvent e)
	 {
		 String comnd=e.getActionCommand();
		 if(comnd.equals("Add Librarian"))
		 {
			 new AddLibrarian().setVisible(true);
		 }
		 else if(comnd.equals("View Librarian"))
		 {
			 new ViewLibrarian ().setVisible(true);
		 }
		 else if(comnd.equals("Delete Librarian"))
		 { 
			 new DeleteLibrarian ().setVisible(true);
		 }
		 else if(comnd.equals("Logout"))
		 {
			System.exit(0);
		 }
		 
		 
	 }
	 public static void main(String args[])
	 {
		 new AdminSection().setVisible(true);
	 }

}
