import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public  class Librarian extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JButton bt1,bt2;
	JPanel p1,p2;
	Font f,f1;
	JTextField tf1;
	JPasswordField pf1;
	
  Librarian() 

	{
		super("Librarian Login Page");
		setLocation(450,400);
		setSize(500,200);
		
		f=new Font("Arial",Font.BOLD,25);
		f1=new Font("Arial",Font.BOLD,20);
		
		l1=new JLabel("Librarian Login");
		l2=new JLabel("Name");
		l3=new JLabel("Password");
		
		bt1=new JButton("Login");
		bt2=new JButton("Cancel");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		tf1=new JTextField();
		pf1=new JPasswordField();
		
		l1.setFont(f);
		l2.setFont(f1);
		l3.setFont(f1);
		bt1.setFont(f1);
		bt2.setFont(f1);
		tf1.setFont(f1);
		pf1.setFont(f1);
		
		l1.setHorizontalAlignment(JLabel.CENTER);
		l3.setForeground(Color.BLACK);
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(1,1,10,10));
		p1.add(l1);
		l1.setForeground(Color.RED);
		
		p2=new JPanel();
		p2.setLayout(new GridLayout(3,2,10,10));
		p2.add(l2);
		p2.add(tf1);
		p2.add(l3);
		p2.add(pf1);
		p2.add(bt1);
		p2.add(bt2);
		
		setLayout(new BorderLayout(10,10));
		add(p1,"North");
		add(p2,"Center");
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String name=tf1.getText();
		String pass=pf1.getText();
		
		if(e.getSource()==bt1)
		{
			try
			{
				ConnectionClass obj=new ConnectionClass();
				String q=("select name,password from librarian where name='"+name+"' and password='"+pass+"'");
				ResultSet rest=obj.stm.executeQuery(q);
				if(rest.next())
				{
					System.out.println("Not Available Now");
					JOptionPane.showMessageDialog(null,"Entered Succesfully");
					new LibrarianSection().setVisible(true);
					this.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Your Name OR Password Is Incorrect");
					this.setVisible(false);
					this.setVisible(true);
				}
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
	}
		if(e.getSource()==bt2)
		{
			this.setVisible(false);
		}
	}
	public static void main(String[] args)
	{
		new Librarian().setVisible(true);
	}
}


//public class Librarian extends JFrame implements ActionListener
//{
//	JLabel l1,l2,l3;
//	JButton bt1,bt2;
//	JPanel p1,p2;
//	JTextField tf1;
//	JPasswordField pf1;
//	Font f,f1;
//	
//	Librarian()
//	{
//		super("Librarian Login Page");
//		setLocation(450,400);
//		setSize(500,200);
//			
//		f=new Font("Arial",Font.BOLD,25);
//		f1=new Font("Arial",Font.BOLD,20);
//		
//		l1=new JLabel("Librarian Login");
//		l2=new JLabel("Name");
//		l3=new JLabel("Password");
//		l1.setHorizontalAlignment(JLabel.CENTER);
//		l1.setForeground(Color.RED);
//		
//		tf1=new JTextField();
//		pf1=new JPasswordField();
//		
//		bt1=new JButton("Login");
//		bt2=new JButton("Cancel");
//		
//		bt1.addActionListener(this);
//		bt2.addActionListener(this);
//		
//		l1.setFont(f);
//		l2.setFont(f1);
//		l3.setFont(f1);
//		bt1.setFont(f1);
//		bt2.setFont(f1);
//		
//		
//		p1=new JPanel();
//		p1.setLayout(new GridLayout(2,2,10,10));
//		p1.add(l1);
//		
//		p2=new JPanel();
//		p2.setLayout(new GridLayout(3,2,10,10));
//		p2.add(l2);
//		p2.add(tf1);
//		p2.add(l3);
//		p2.add(pf1);
//		p2.add(bt1);
//		p2.add(bt2);
//		
//		setLayout(new BorderLayout(10,10));
//		add(p1,"North");
//		add(p2,"Center");
//		
//	}
//	public void actionPerformed(ActionEvent e)
//	{
//		 String name=tf1.getText();
//		 String pass=pf1.getText();
//		 
//		 if(e.getSource()==bt1)
//		 {
//			 try
//				{
//					ConnectionClass obj=new ConnectionClass();
//					String q="select name,password from librarian where username=('" +name+ "' and password='"+pass+"')";
//					ResultSet rest=obj.stm.executeQuery(q);
//					if(rest.next())
//					{
//					
//						//new LibrarianSection().setVisible(true);
//						this.setVisible(false);
//					}
//					else
//					{
//						JOptionPane.showMessageDialog(null, "Your name and password is wrong");
//						this.setVisible(false);
//						this.setVisible(true);
//					}
//				}
//				catch(Exception ee)
//				{
//					ee.printStackTrace();
//				}
//		 }
//		 if(e.getSource()==bt1)
//		 {
//			 this.setVisible(false);
//		 }
//		 
//		
//	}
//	public static void main(String args[])
//	{
//		new Librarian().setVisible(true);
//	}
//}
