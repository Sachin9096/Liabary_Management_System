import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;


public class LibrarianSection extends JFrame implements ActionListener
{
	JLabel l1;
	JButton bt1;
	JPanel p1,p2;
	Font f,f1;
	
	LibrarianSection()
	{
		super("Admin Page");
		setLocation(0,0);
		setSize(1500,800);
		
		f=new Font("Arial",Font.BOLD,25);
		f1=new Font("Arial",Font.BOLD,18);
		 
			
		ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("l3.png"));
		Image img=ic.getImage().getScaledInstance(1500,800, Image.SCALE_DEFAULT);
		ImageIcon ic1=new ImageIcon(img);
		l1=new JLabel(ic1);
		
		JMenuBar m1=new JMenuBar();
		JMenu men1=new JMenu("Add Info");
		JMenuItem ment1=new JMenuItem("Add Book");
		
		JMenu men2=new JMenu("View Info");
		JMenuItem ment2=new JMenuItem("View Book");
		JMenuItem ment3=new JMenuItem("View Issue Book");
		
		JMenu men3=new JMenu("Issue Info");
		JMenuItem ment4=new JMenuItem("Issue Book");
		
		JMenu men4=new JMenu("Return");
		JMenuItem ment5=new JMenuItem("Return Book");
		
		JMenu men5=new JMenu("Exit");
		JMenuItem ment6=new JMenuItem("Logout");
		
		men1.add(ment1);
		men2.add(ment2);
		men2.add(ment3);
		men3.add(ment4);
		men4.add(ment5);
		men5.add(ment6);
		
		m1.add(men1);
		m1.add(men2);
		m1.add(men3);
		m1.add(men4);
		m1.add(men5);
		
		men1.setForeground(Color.GRAY);
		men2.setForeground(Color.GRAY);
		men3.setForeground(Color.GRAY);
		men4.setForeground(Color.GRAY);
		men5.setForeground(Color.RED);
		
		ment1.setBackground(Color.BLACK);
		ment2.setBackground(Color.BLACK);
		ment3.setBackground(Color.BLACK);
		ment4.setBackground(Color.BLACK);
		ment5.setBackground(Color.BLACK);
		ment6.setBackground(Color.BLACK);
		
		ment1.setForeground(Color.YELLOW);
		ment2.setForeground(Color.YELLOW);
		ment3.setForeground(Color.YELLOW);
		ment4.setForeground(Color.YELLOW);
		ment5.setForeground(Color.YELLOW);
		ment6.setForeground(Color.YELLOW);
		
		men1.setFont(f);
		men2.setFont(f);
		men3.setFont(f);
		men4.setFont(f);
		men5.setFont(f);
		
		ment1.setFont(f1);
		ment2.setFont(f1);
		ment3.setFont(f1);
		ment4.setFont(f1);
		ment5.setFont(f1);
		ment6.setFont(f1);
		
		ment1.addActionListener(this);
		ment2.addActionListener(this);
		ment3.addActionListener(this);
		ment4.addActionListener(this);
		ment5.addActionListener(this);
		ment6.addActionListener(this);
		
		setJMenuBar(m1);
		add(l1);	
	}
		public void actionPerformed(ActionEvent e)
		{
			 String comnd=e.getActionCommand();
			 if(comnd.equals("Add Book"))
			 {
				 new AddBook().setVisible(true);
			 }
			 else if(comnd.equals("View Book"))
			 {
				 new ViewBook ().setVisible(true);
			 }
			 else if(comnd.equals("View Issue Book"))
			 { 
				 new ViewIssueBook ().setVisible(true);
			 }
			 else if(comnd.equals("Issue Book"))
			 {
				 new IssueBook ().setVisible(true);
			 }
			 else if(comnd.equals("Return Book"))
			 { 
				new ReturnBook ().setVisible(true);
			 }
			 else if(comnd.equals("Logout"))
			 {
				System.exit(0);
			 }
		}
		public static void main(String args[])
		{
			new LibrarianSection().setVisible(true);
		}

}
